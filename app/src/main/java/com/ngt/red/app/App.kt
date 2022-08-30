package com.ngt.red.app

import android.app.Application
import com.dzen.campfire.api.models.notifications.account.NotificationAdminBlock
import com.dzen.campfire.api.models.notifications.account.NotificationPunishmentRemove
import com.dzen.campfire.api.models.notifications.comments.NotificationComment
import com.dzen.campfire.api.models.notifications.comments.NotificationCommentAnswer
import com.dzen.campfire.api.models.notifications.publications.NotificationKarmaAdd
import com.dzen.campfire.api.models.notifications.publications.NotificationPublicationBlock
import com.dzen.campfire.api.models.notifications.publications.NotificationPublicationBlockAfterReport
import com.dzen.campfire.api.models.notifications.publications.NotificationPublicationRestore
import com.google.firebase.FirebaseApp
import com.ngt.red.BuildConfig
import com.ngt.red.R
import com.ngt.red.controller.ControllerAlarm
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.screens.categories.SCategories
import com.sayzen.campfiresdk.controllers.*
import com.sayzen.campfiresdk.controllers.notifications.comments.NotificationCommentAnswerParser
import com.sayzen.campfiresdk.controllers.notifications.comments.NotificationCommentParser
import com.sayzen.campfiresdk.controllers.notifications.publications.NotificationKarmaAddParser
import com.sayzen.campfiresdk.controllers.notifications.publications.NotificationPublicationBlockParser
import com.sayzen.campfiresdk.screens.comments.SComments
import com.sayzen.campfiresdk.screens.post.view.SPost
import com.sayzen.campfiresdk.support.adapters.XAccount
import com.sayzen.devsupandroidgoogle.ControllerAds
import com.sup.dev.android.app.SupAndroid
import com.sup.dev.android.libs.image_loader.ImageLoader
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsAndroid
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.views.views.ViewCircleImage
import com.sup.dev.java.libs.eventBus.EventBus

class App : Application() {

    companion object {
        fun activity() = SupAndroid.activity as ActivityApp
        fun isDebug() = false && ToolsAndroid.isDebug()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        ImageLoader.clearCash()
        ControllerStorage.setBackgroundRes(R.color.grey_100)
        EventBus.post(EventStyleChanged())
    }

    override fun onCreate() {
        super.onCreate()

        ControllerCampfireSDK.IS_DEBUG = isDebug()

        FirebaseApp.initializeApp(applicationContext)
        SupAndroid.init(applicationContext, BuildConfig.APPLICATION_ID, ActivityApp::class.java)
        ControllerAds.init(
                "pub-5463072271586627",
                ToolsResources.s(R.string.admob_app_key)
        )
        // ControllerAdsFullscreen.init(arrayOf(
        //         ToolsResources.s(R.string.admob_ad_1_key))
        // )

        initSdk()

        ControllerAlarm.init()
        ViewCircleImage.SQUARE_GLOBAL_MODE = false
    }


    private fun initSdk() {
        ControllerPost.ENABLED_BLOCK = true
        ControllerPost.ENABLED_MODER_TO_DRAFT = true
        ControllerPost.ENABLED_TO_DRAFTS = true
        ControllerPost.ENABLED_REMOVE = true
        ControllerLinks.LINKS_ENABLED = false

        ControllerCampfireSDK.init(
                Constants.getAppKey(),
                R.drawable.logo,
                R.drawable.logo_alpha
        ) { Navigator.set(SCategories()) }

        XAccount.GLOBAL_ON_TO_PROFILE_SCREEN = {
            ControllerCampfireSDK.showCampfireAlertProfile()
        }

        ControllerApi.enableAutoRegistration()

        ControllerNotifications.WHITE_LIST.add(NotificationComment::class)
        ControllerNotifications.WHITE_LIST.add(NotificationCommentAnswer::class)
        ControllerNotifications.WHITE_LIST.add(NotificationPublicationBlock::class)
        ControllerNotifications.WHITE_LIST.add(NotificationKarmaAdd::class)
        ControllerNotifications.WHITE_LIST.add(NotificationPublicationBlockAfterReport::class)
        ControllerNotifications.WHITE_LIST.add(NotificationAdminBlock::class)
        ControllerNotifications.WHITE_LIST.add(NotificationPunishmentRemove::class)
        ControllerNotifications.WHITE_LIST.add(NotificationPublicationRestore::class)

        NotificationCommentParser.CAN_SHOW = { it.tag_s_1 == Constants.getAppKey() }
        NotificationCommentAnswerParser.CAN_SHOW = { it.tag_s_1 == Constants.getAppKey() }
        NotificationPublicationBlockParser.CAN_SHOW = { it.tag_s_1 == Constants.getAppKey() }
        NotificationKarmaAddParser.CAN_SHOW = { it.tag_s_1 == Constants.getAppKey() }

        NotificationCommentParser.DO_ACTION = { SComments.instance(it.publicationId, it.commentId, Navigator.TO) }
        NotificationCommentAnswerParser.DO_ACTION = { SComments.instance(it.publicationId, it.commentId, Navigator.TO) }
        NotificationPublicationBlockParser.DO_ACTION = { }
        NotificationKarmaAddParser.DO_ACTION = { SPost.instance(it.publicationId, Navigator.TO) }


    }


}