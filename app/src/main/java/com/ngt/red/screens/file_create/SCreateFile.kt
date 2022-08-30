package com.ngt.red.screens.file_create

import android.graphics.Bitmap
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.models.publications.post.PageDownload
import com.dzen.campfire.api.models.publications.post.PageImage
import com.dzen.campfire.api.models.publications.post.PageText
import com.dzen.campfire.api.requests.post.RPostPublication
import com.dzen.campfire.api.requests.post.RPostPutPage
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.controller.ControllerGuides
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.screens.post.view.SPost
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.*
import com.sup.dev.android.views.screens.SCrop
import com.sup.dev.android.views.splash.SplashAlert
import com.sup.dev.android.views.splash.SplashChooseImage
import com.sup.dev.android.views.splash.SplashMenu
import com.sup.dev.android.views.support.watchers.TextWatcherChanged
import com.sup.dev.java.libs.debug.err
import com.sup.dev.java.tools.ToolsThreads
import java.io.File

class SCreateFile() : Screen(R.layout.screen_create_v2) {

    val vImage: ImageView = findViewById(R.id.vImage)
    val vImageTouch: View = findViewById(R.id.vImageTouch)
    val vPlus: View = findViewById(R.id.vPlus)
    val vTitle: EditText = findViewById(R.id.vTitle)
    val vDescription: EditText = findViewById(R.id.vDescription)
    val vGenre: Button = findViewById(R.id.vGenre)
    val vFile: Button = findViewById(R.id.vFile)
    val vFinish: Button = findViewById(R.id.vFinish)
    val vImage_1: ImageView = findViewById(R.id.vImage_1)
    val vImagePlus_1: View = findViewById(R.id.vImagePlus_1)
    val vImage_2: ImageView = findViewById(R.id.vImage_2)
    val vImagePlus_2: View = findViewById(R.id.vImagePlus_2)
    val vImage_3: ImageView = findViewById(R.id.vImage_3)
    val vImagePlus_3: View = findViewById(R.id.vImagePlus_3)

    var language = ControllerApi.getLanguage(ControllerApi.getLanguageCode())
    var imageBytes: ByteArray? = null
    var imageBytes_1: ByteArray? = null
    var imageBytes_2: ByteArray? = null
    var imageBytes_3: ByteArray? = null
    var appSubKey: String? = null
    var fileBytes: ByteArray? = null
    var savePatch: String = ""

    init {
        vTitle.addTextChangedListener(TextWatcherChanged { updateCreateEnabled() })
        vDescription.addTextChangedListener(TextWatcherChanged { updateCreateEnabled() })
        vFinish.setOnClickListener { create() }
        vGenre.setOnClickListener { showGenreDialog() }
        vFile.setOnClickListener { showFileDialog() }


        vImageTouch.setOnClickListener {
            selectImage { bitmap, bytes ->
                imageBytes = bytes
                vImage.setImageBitmap(bitmap)
                vPlus.visibility = View.GONE
            }
        }
        vImage_1.setOnClickListener {
            selectImage{ bitmap, bytes ->
                imageBytes_1 = bytes
                vImage_1.setImageBitmap(bitmap)
                vImagePlus_1.visibility = View.GONE
            }
        }
        vImage_2.setOnClickListener {
            selectImage{ bitmap, bytes ->
                imageBytes_2 = bytes
                vImage_2.setImageBitmap(bitmap)
                vImagePlus_2.visibility = View.GONE
            }
        }
        vImage_3.setOnClickListener {
            selectImage{ bitmap, bytes ->
                imageBytes_3 = bytes
                vImage_3.setImageBitmap(bitmap)
                vImagePlus_3.visibility = View.GONE
            }
        }

        updateCreateEnabled()
    }

    private fun showFileDialog() {
        ControllerGuides.chooseFile { file, savePatch, name ->

            this.savePatch = savePatch

            val dProgress = ToolsView.showProgressDialog()
            ToolsThreads.thread {
                try {
                    this.fileBytes = ToolsFilesAndroid.readAsZip(file)
                    ToolsThreads.main {
                        vFile.text = name
                        dProgress.hide()
                        updateCreateEnabled()
                    }
                } catch (e: Exception) {
                    dProgress.hide()
                    err(e)
                    ToolsToast.show(R.string.error_unknown)
                }

            }
        }
    }

    private fun showGenreDialog() {
        val appSubIds = ControllerGuides.getAppSubIds()
        val w = SplashMenu()
        for (i in appSubIds) w.add(i.a1) {
            appSubKey = i.a2
            vGenre.setText(i.a1)
            updateCreateEnabled()
        }
        w.asSheetShow()
    }

    fun selectImage(onSelect: (Bitmap, ByteArray) -> Unit) {
        SplashChooseImage()
                .setOnSelectedBitmap { w, b ->
                    Navigator.to(SCrop(b, Constants.DRAFT_IMAGE_W, Constants.DRAFT_IMAGE_H) { s, b2, x, y, w, h ->
                        val dialog = ToolsView.showProgressDialog()
                        ToolsThreads.thread {
                            val imageBytesX = ToolsBitmap.toBytes(ToolsBitmap.resize(b2, Constants.DRAFT_IMAGE_W, Constants.DRAFT_IMAGE_H), API.PAGE_IMAGE_WEIGHT)
                            if (imageBytesX == null) {
                                ToolsToast.show(R.string.error_cant_load_image)
                                return@thread
                            }
                            ToolsThreads.main {
                                onSelect.invoke(b2, imageBytesX)

                                dialog.hide()
                                updateCreateEnabled()
                            }
                        }
                    })
                }
                .asSheetShow()
    }

    fun updateCreateEnabled() {
        vFinish.isEnabled = imageBytes != null
                && vTitle.text.isNotEmpty()
                && vTitle.text.length <= Constants.DRAFT_TITLE_SIZE
                && vDescription.text.isNotEmpty()
                && vDescription.text.length <= API.PAGE_TEXT_MAX_L
                && appSubKey != null
                && fileBytes != null
                && imageBytes_1 != null
                && imageBytes_2 != null
                && imageBytes_3 != null
    }

    fun create() {

        val pageText = PageText()
        pageText.text = vTitle.text.toString()
        pageText.size = PageText.SIZE_1

        val pageDescription = PageText()
        pageDescription.text = vDescription.text.toString()

        val pageImage = PageImage()
        pageImage.insertBytes = imageBytes

        val pageImage1 = PageImage()
        pageImage1.insertBytes = imageBytes_1

        val pageImage2 = PageImage()
        pageImage2.insertBytes = imageBytes_2

        val pageImage3 = PageImage()
        pageImage3.insertBytes = imageBytes_3

        val pageFile = PageDownload()
        pageFile.insertBytes = fileBytes
        pageFile.patch = savePatch

        SplashAlert()
                .setText(ControllerGuides.getPublishAlert())
                .setOnCancel(R.string.app_cancel)
                .setOnEnter(R.string.app_publish) {
                    ApiRequestsSupporter.executeProgressDialog(RPostPutPage(0, arrayOf(pageText, pageImage, pageDescription, pageImage1, pageImage2, pageImage3, pageFile), ControllerGuides.rootFandomId, language.id, Constants.getAppKey(), appSubKey!!)) { w, r1 ->
                        ApiRequestsSupporter.executeProgressDialog(RPostPublication(r1.publicationId, emptyArray(), "", true, 0, false, false, 0,0,0)) { r ->
                            SPost.instance(r1.publicationId, Navigator.REPLACE)
                            ToolsToast.show(R.string.app_done)
                        }
                    }
                }
                .asSheetShow()


    }

}