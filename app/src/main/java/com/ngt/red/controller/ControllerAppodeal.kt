package com.ngt.red.controller

import android.app.Activity
import com.appodeal.ads.Appodeal
import com.appodeal.ads.InterstitialCallbacks
import com.sup.dev.android.app.SupAndroid
import com.sup.dev.android.tools.ToolsStorage
import com.sup.dev.java.libs.debug.info
import com.sup.dev.java.libs.debug.log
import com.sup.dev.java.tools.ToolsDate


object ControllerAppodeal {

    private var lastShow = System.currentTimeMillis()

    fun init(activity: Activity) {
        Appodeal.disableLocationPermissionCheck()
        Appodeal.disableWriteExternalStoragePermissionCheck()
        Appodeal.initialize(activity, ControllerGuides.appodialAppId, Appodeal.INTERSTITIAL, false)

        Appodeal.setInterstitialCallbacks(object : InterstitialCallbacks {
            override fun onInterstitialLoaded(isPrecache: Boolean) {
                info("ControllerAppodeal", "onInterstitialLoaded")
            }

            override fun onInterstitialFailedToLoad() {
                log("ControllerAppodeal", "onInterstitialFailedToLoad")
            }

            override fun onInterstitialShown() {
                log("ControllerAppodeal", "onInterstitialShown")
            }

            override fun onInterstitialShowFailed() {
                log("ControllerAppodeal", "onInterstitialShowFailed")
            }

            override fun onInterstitialClicked() {
                log("ControllerAppodeal", "onInterstitialClicked")
            }

            override fun onInterstitialClosed() {
                log("ControllerAppodeal", "onInterstitialClosed")
            }

            override fun onInterstitialExpired() {
                log("ControllerAppodeal", "onInterstitialExpired")
            }
        })
    }

    fun show() {
        if (System.currentTimeMillis() <= lastShow + 1000 * 60 * 2) return
        val date = ToolsDate.getStartOfDay()
        val count = ToolsStorage.getInt("ad_key_$date", 0)
        if (count >= 10) return

        if (Appodeal.show(SupAndroid.activity!!, Appodeal.INTERSTITIAL)) {
            lastShow = System.currentTimeMillis()
            ToolsStorage.put("ad_key_$date", count + 1)
        }
    }

}