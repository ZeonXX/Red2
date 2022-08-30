package com.ngt.red.screens.guide_create

import androidx.viewpager.widget.ViewPager
import android.view.View
import com.dzen.campfire.api.API
import com.dzen.campfire.api.models.publications.post.PageImage
import com.dzen.campfire.api.models.publications.post.PageText
import com.dzen.campfire.api.requests.post.RPostPutPage
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.models.UnitPostParsed
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsBitmap
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.screens.SCrop
import com.sup.dev.android.views.splash.SplashChooseImage
import com.sup.dev.android.views.support.adapters.pager.PagerCardAdapter
import com.sup.dev.java.libs.debug.log
import com.sup.dev.java.tools.ToolsThreads

class PageGuideNew(
        val vPager: ViewPager,
        val guide: UnitPostParsed
) : Card(R.layout.screen_create_guide_page_new) {

    override fun bindView(view: View) {
        super.bindView(view)

        val vAdd: View = view.findViewById(R.id.vAddPage)

        vAdd.visibility = View.VISIBLE

        vAdd.setOnClickListener {
            SplashChooseImage()
                    .setOnSelectedBitmap { w, b ->
                        Navigator.to(SCrop(b, Constants.GUIDE_IMAGE_SIDES, Constants.GUIDE_IMAGE_SIDES) { s, b2, x, y, w, h ->
                            ToolsThreads.thread {
                                val language = ControllerApi.getLanguage(ControllerApi.getLanguageCode())
                                val pageText = PageText()
                                pageText.text = ""
                                val imageBytes = ToolsBitmap.toBytes(ToolsBitmap.resize(b2, Constants.GUIDE_IMAGE_SIDES, Constants.GUIDE_IMAGE_SIDES), API.PAGE_IMAGE_WEIGHT)
                                val pageImage = PageImage()
                                pageImage.insertBytes = imageBytes
                                ApiRequestsSupporter.executeProgressDialog(RPostPutPage(guide.unit.id, arrayOf(pageText, pageImage), ControllerGuides.rootFandomId, language.id, Constants.getAppKey(), "none")) { r ->
                                    guide.addPage(r.pages[0] as PageText, r.pages[1] as PageImage)
                                    adapter.add(adapter.size()-1, PageGuideCreate(vPager, guide.getPages().last()))
                                    vPager.setCurrentItem(adapter.size()-2, false)

                                    val cards = adapter.get(PageGuideNew::class)
                                    if(cards.isNotEmpty()){
                                        val index = adapter.indexOf(cards.first())
                                        adapter.remove(cards.first())
                                        adapter.add(index, PageGuideNew(vPager, guide))
                                    }
                                }
                            }
                        })
                    }
                    .asSheetShow()
        }

    }


}
