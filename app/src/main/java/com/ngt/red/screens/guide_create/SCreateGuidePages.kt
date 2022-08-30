package com.ngt.red.screens.guide_create

import androidx.viewpager.widget.ViewPager
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.dzen.campfire.api.requests.post.RPostGetDraft
import com.dzen.campfire.api.requests.post.RPostPublication

import com.ngt.red.R
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.screens.guide_feed.SGuideFeed
import com.ngt.red.models.UnitPostParsed
import com.sayzen.campfiresdk.screens.other.rules.SGoogleRules
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsToast
import com.sup.dev.android.views.splash.SplashAlert
import com.sup.dev.android.views.support.adapters.pager.PagerCardAdapter

class SCreateGuidePages(val guide: UnitPostParsed) : Screen(R.layout.screen_create_guide) {

    companion object {

        fun instance(guideId: Long, action: NavigationAction) {
            ApiRequestsSupporter.executeProgressDialog(RPostGetDraft(guideId)) { r ->
                Navigator.action(action, SCreateGuidePages(UnitPostParsed(r.publication)))
            }
        }

        fun instance(guide: UnitPostParsed, action: NavigationAction) {
            Navigator.action(action, SCreateGuidePages(guide))
        }

    }

    val vPager: ViewPager = findViewById(R.id.vPager)
    val vPublish: Button = findViewById(R.id.vPublish)
    val adapter = PagerCardAdapter()

    init {
        setTitle(guide.getTitleText())
        vPublish.setOnClickListener { publishCheck() }
        vPublish.visibility = if (guide.unit.isDraft) View.VISIBLE else View.GONE

        vPager.adapter = adapter

        val pages = guide.getPages()
        for (p in pages) adapter.add(PageGuideCreate(vPager, p))
        adapter.add(PageGuideNew(vPager, guide))
    }

    override fun onPause() {
        super.onPause()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageBitmap(null)
    }

    override fun onResume() {
        super.onResume()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }

    private fun publishCheck() {

        if (adapter.size() == 1) {
            ToolsToast.show(R.string.create_error_empty)
            return
        }

        SGoogleRules.acceptRulesDialog {
            SplashAlert()
                    .setText(ControllerGuides.getPublishAlert())
                    .setOnCancel(R.string.app_cancel)
                    .setOnEnter(R.string.app_publish) {
                        ApiRequestsSupporter.executeProgressDialog(RPostPublication(guide.unit.id, emptyArray(), "", true, 0, false, false, 0, 0, 0)) { r ->
                            Navigator.set(SGuideFeed())
                            ToolsToast.show(R.string.app_done)
                        }
                    }
                    .asSheetShow()
        }


    }

}
