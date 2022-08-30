package com.ngt.red.app

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import com.ngt.red.R
import com.ngt.red.controller.ControllerAppodeal
import com.ngt.red.controller.ControllerGuides

import com.ngt.red.controller.ControllerStorage
import com.ngt.red.screens.categories.SCategories
import com.ngt.red.screens.file_feed.SFileFeed
import com.ngt.red.screens.guide_feed.SGuideFeed
import com.sayzen.devsupandroidgoogle.ControllerAds
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.activity.SActivity
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.java.tools.ToolsThreads

class ActivityApp : SActivity() {

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        ControllerAppodeal.init(this)
    }

    override fun applyTheme() {
        val themeResource = ControllerStorage.getTheme()
        if (themeResource > 0) setTheme(themeResource)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = ToolsResources.getPrimaryDarkColor(this)
        }
    }

    override fun onFirstStart() {
        if (!parseIntent_X(intent)) Navigator.set(SCategories())
        ControllerAds.updateConsent()
        ToolsThreads.main(true) { parseStartAction() }
    }

    override fun toMainScreen() {
        Navigator.set(SCategories())
    }

    override fun onLastBackPressed(screen: Screen?): Boolean {
        if (Navigator.getCurrent() !is SCategories) {
            Navigator.set(SCategories())
            return true
        }

        return false
    }

    fun parseStartAction(): Boolean {
        return parseIntent_X(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        parseIntent_X(intent)
    }

    private fun parseIntent_X(intent: Intent?): Boolean {
        if (intent != null) {
            if (intent.hasExtra("ALARM")) {
                ToolsThreads.main(1000) {
                    if (ControllerGuides.isFileMode())
                        Navigator.to(SFileFeed("", ToolsResources.s(R.string.name_all)))
                    else
                        Navigator.to(SGuideFeed())
                }
            }
        }
        return false
    }
}

