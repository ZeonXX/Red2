package com.ngt.red.screens.guide_create

import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.models.publications.post.PageImage
import com.dzen.campfire.api.models.publications.post.PageText
import com.dzen.campfire.api.requests.post.RPostChangePage
import com.dzen.campfire.api.requests.post.RPostPutPage
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventGuideChanged
import com.ngt.red.models.UnitPostParsed
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sup.dev.android.libs.image_loader.ImageLoader
import com.sup.dev.android.libs.image_loader.ImageLoaderId
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsBitmap
import com.sup.dev.android.tools.ToolsToast
import com.sup.dev.android.tools.ToolsView
import com.sup.dev.android.views.screens.SCrop
import com.sup.dev.android.views.splash.SplashChooseImage
import com.sup.dev.android.views.support.watchers.TextWatcherChanged
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.tools.ToolsThreads

class SCreateGuideTitle(
        val fandomId:Long,
        val guide: UnitPostParsed? = null
) : Screen(R.layout.screen_create_draft) {

    val vImage: ImageView = findViewById(R.id.vImage)
    val vImageTouch: View = findViewById(R.id.vImageTouch)
    val vPlus: View = findViewById(R.id.vPlus)
    val vTitle: EditText = findViewById(R.id.vTitle)
    val vFab: FloatingActionButton = findViewById(R.id.vFab)

    var language = ControllerApi.getLanguage(ControllerApi.getLanguageCode())
    var imageBytes: ByteArray? = null

    init {
        vTitle.addTextChangedListener(TextWatcherChanged { updateCreateEnabled() })
        vFab.setOnClickListener { create() }
        vImageTouch.setOnClickListener { selectImage() }

        if (guide != null) {
            vTitle.setText(guide.getTitleText())
            ImageLoader.load(guide.getTitleImage()).into(vImage){
                if (imageBytes == null) imageBytes = it
                updateCreateEnabled()
            }
        }

        updateCreateEnabled()
    }

    override fun onPause() {
        super.onPause()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageBitmap(null)
    }

    override fun onResume() {
        super.onResume()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }

    fun selectImage() {
        SplashChooseImage()
                .setOnSelectedBitmap { w, b ->
                    Navigator.to(SCrop(b, Constants.DRAFT_IMAGE_W, Constants.DRAFT_IMAGE_H) { s, b2, x, y, w, h ->
                        val dialog = ToolsView.showProgressDialog()
                        ToolsThreads.thread {
                            imageBytes = ToolsBitmap.toBytes(ToolsBitmap.resize(b2, Constants.DRAFT_IMAGE_W, Constants.DRAFT_IMAGE_H), API.PAGE_IMAGE_WEIGHT)
                            ToolsThreads.main {
                                vImage.setImageBitmap(b2)
                                vPlus.visibility = View.GONE
                                dialog.hide()
                                updateCreateEnabled()
                            }
                        }
                    })
                }
                .asSheetShow()
    }

    fun updateCreateEnabled() {
        ToolsView.setFabEnabled(vFab, imageBytes != null && vTitle.text.isNotEmpty() && vTitle.text.length <= Constants.DRAFT_TITLE_SIZE)
    }

    fun create() {
        val title = vTitle.text.toString()

        val pageText = PageText()
        pageText.text = title
        pageText.size = PageText.SIZE_1

        val pageImage = PageImage()
        pageImage.insertBytes = imageBytes

        if (guide == null) {
            ApiRequestsSupporter.executeProgressDialog(RPostPutPage(0, arrayOf(pageText, pageImage), fandomId, language.id, Constants.getAppKey(), "none")) { w, r1 ->
                SCreateGuidePages.instance(r1.publicationId, Navigator.REPLACE)
            }
        } else {
            ApiRequestsSupporter.executeProgressDialog(RPostChangePage(guide.unit.id, pageText, 0)) { w, r ->
                ApiRequestsSupporter.executeProgressDialog(w, RPostChangePage(guide.unit.id, pageImage, 1)) { r ->
                    ImageLoaderId(pageImage.imageId).clear()
                    EventBus.post(EventGuideChanged())
                    Navigator.back()
                    ToolsToast.show(R.string.app_done)
                }
            }
        }
    }

}