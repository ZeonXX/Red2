package com.ngt.red.screens.guide_view_network

import androidx.viewpager.widget.ViewPager
import android.view.View
import android.widget.ImageView
import com.dzen.campfire.api.requests.post.RPostGetDraft
import com.ngt.red.R
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.models.UnitPostParsed
import com.sayzen.campfiresdk.controllers.ControllerPost
import com.sayzen.campfiresdk.models.events.publications.EventPostStatusChange
import com.sayzen.campfiresdk.models.events.publications.EventPublicationRemove
import com.sayzen.campfiresdk.screens.comments.SComments
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.views.support.adapters.pager.PagerCardAdapter
import com.sup.dev.java.libs.eventBus.EventBus

class SNetworkView(
        val guide: UnitPostParsed
) : Screen(R.layout.screen_guide_network) {


    companion object {

        fun instance(guideId: Long, action: NavigationAction) {
            ApiRequestsSupporter.executeProgressDialog(RPostGetDraft(guideId)) { r ->
                Navigator.action(action, SNetworkView(UnitPostParsed(r.publication)))
            }
        }

        fun instance(guide: UnitPostParsed, action: NavigationAction) {
            Navigator.action(action, SNetworkView(guide))
        }

    }

    private val eventBus = EventBus
            .subscribe(EventStyleChanged::class) { updateBackground() }
            .subscribe(EventPublicationRemove::class) { if(it.publicationId == guide.unit.id) Navigator.remove(this) }
            .subscribe(EventPostStatusChange::class) { if(it.publicationId == guide.unit.id) Navigator.remove(this) }

    init {
        setTitle(guide.getTitleText())

        val vPager = findViewById<ViewPager>(R.id.pager)
        val vFab: View = findViewById(R.id.vFab)
        val vMenu: View = findViewById(R.id.vMenu)

        vFab.setOnClickListener { Navigator.to(SComments(guide.unit.id, 0)) }

        val adapter = PagerCardAdapter()
        vPager.adapter = adapter

        for (p in guide.getPages()) adapter.add(PageNetworkGuide(vPager, p))


        vMenu.setOnClickListener {
            ControllerPost.showPostMenu(vMenu, guide.unit)
        }

        updateBackground()
    }

    override fun onPause() {
        super.onPause()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageBitmap(null)
    }

    override fun onResume() {
        super.onResume()
        updateBackground()
    }

    private fun updateBackground() {
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }

}
