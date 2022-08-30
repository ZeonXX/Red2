package com.ngt.red.screens.guide_create

import androidx.viewpager.widget.ViewPager
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.requests.post.RPostChangePage
import com.dzen.campfire.api.requests.post.RPostRemovePage
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.models.UnitPostParsedPage
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sup.dev.android.libs.image_loader.ImageLoader
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsBitmap
import com.sup.dev.android.tools.ToolsView
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.screens.SCrop
import com.sup.dev.android.views.splash.SplashChooseImage
import com.sup.dev.android.views.splash.SplashField
import com.sup.dev.android.views.views.ViewIcon
import com.sup.dev.java.tools.ToolsThreads

class PageGuideCreate(
        val vPager: ViewPager,
        val page: UnitPostParsedPage
) : Card(R.layout.screen_create_guide_page) {

    override fun bindView(view: View) {
        super.bindView(view)

        val vText: TextView = view.findViewById(R.id.vText)
        val vPageIndex: TextView = view.findViewById(R.id.vPageIndex)
        val vImage: ImageView = view.findViewById(R.id.vImage)
        val vToL: ViewIcon = view.findViewById(R.id.vToLeft)
        val vToR: ViewIcon = view.findViewById(R.id.vToRight)
        val vRemove: View = view.findViewById(R.id.vRemove)

        val position = adapter.indexOf(this)
        val pagesCount = adapter.size() - 1

        vImage.setOnClickListener { selectImage() }
        vText.setOnClickListener { changeText() }
        vRemove.setOnClickListener { removePage() }

        vToL.visibility = if (position == 0) View.INVISIBLE else View.VISIBLE
        vToL.setOnClickListener { v -> vPager.currentItem = position - 1 }
        vToR.setOnClickListener { v -> vPager.currentItem = position + 1 }

        if (page.pageText.text.isEmpty())
            vText.setText(R.string.create_page_text)
        else
            vText.text = page.pageText.text

        if (page.pageImage.imageId > 0)
            ImageLoader.load(page.pageImage.imageId).into(vImage)
        else
            vImage.setImageBitmap(null)


        vPageIndex.text = (position + 1).toString() + " / " + pagesCount

        vRemove.visibility = if (page.guide.unit.isDraft) View.VISIBLE else View.GONE


    }

    private fun changeText() {
        SplashField()
                .setHint(R.string.create_page_text_hint)
                .setText(page.pageText.text)
                .setOnCancel(R.string.app_cancel)
                .setOnEnter(R.string.app_save) { w, t ->
                    page.pageText.text = t
                    ApiRequestsSupporter.executeProgressDialog(RPostChangePage(page.guide.unit.id, page.pageText, page.indexOfText())) { r ->
                        update()
                    }
                }
                .asSheetShow()
    }

    private fun selectImage() {
        SplashChooseImage()
                .setOnSelectedBitmap { w, b ->
                    Navigator.to(SCrop(b, Constants.GUIDE_IMAGE_SIDES, Constants.GUIDE_IMAGE_SIDES) { s, b2, x, y, w, h ->
                        val dialog = ToolsView.showProgressDialog()
                        ToolsThreads.thread {
                            val imageBytes = ToolsBitmap.toBytes(ToolsBitmap.resize(b2, Constants.GUIDE_IMAGE_SIDES, Constants.GUIDE_IMAGE_SIDES), API.PAGE_IMAGES_WEIGHT)
                            page.pageImage.insertBytes = imageBytes
                            ApiRequestsSupporter.executeProgressDialog(dialog, RPostChangePage(page.guide.unit.id, page.pageImage, page.indexOfImage())) { r ->
                                update()
                            }
                        }
                    })
                }
                .asSheetShow()
    }

    private fun removePage() {
        val index = page.indexOfText()
        ApiRequestsSupporter.executeEnabledConfirm(R.string.create_remove, R.string.app_remove, RPostRemovePage(page.guide.unit.id, arrayOf(index,index))) { r ->
            page.guide.removePage(page)
            adapter.remove(this)
        }
    }

}
