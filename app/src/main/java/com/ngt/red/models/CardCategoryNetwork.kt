package com.ngt.red.models

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.requests.publications.RPublicationsRemove
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.controller.ControllerAppodeal
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.screens.guide_create.SCreateGuidePages
import com.ngt.red.screens.guide_create.SCreateGuideTitle
import com.ngt.red.screens.guide_view_network.SNetworkView
import com.sayzen.campfiresdk.models.events.publications.EventPostStatusChange
import com.sayzen.campfiresdk.models.events.publications.EventPublicationRemove
import com.sayzen.campfiresdk.screens.comments.SComments
import com.sayzen.campfiresdk.screens.post.view.SPost
import com.sayzen.campfiresdk.support.ApiRequestsSupporter
import com.sayzen.campfiresdk.support.adapters.XAccount
import com.sayzen.campfiresdk.support.adapters.XKarma
import com.sayzen.campfiresdk.views.ViewKarma
import com.sup.dev.android.libs.image_loader.ImageLoader
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.splash.SplashMenu
import com.sup.dev.android.views.support.adapters.NotifyItem
import com.sup.dev.android.views.views.ViewAvatarTitle
import com.sup.dev.java.libs.eventBus.EventBus

class CardCategoryNetwork(
        val guide: UnitPostParsed
) : Card(R.layout.screen_network_card), NotifyItem {

    private val xKarma = XKarma(guide.unit) { update() }
    private val xAccount = XAccount().setAccount(guide.unit.creator).setDate(guide.unit.dateCreate).setOnChanged { update() }

    private val eventBus = EventBus
            .subscribe(EventPublicationRemove::class) { if (it.publicationId == guide.unit.id) adapter.remove(this) }
            .subscribe(EventPostStatusChange::class) { if (it.publicationId == guide.unit.id) adapter.remove(this) }

    override fun bindView(view: View) {
        super.bindView(view)
        val vImage: ImageView = view.findViewById(R.id.image)
        val vTitle: TextView = view.findViewById(R.id.title)
        val vMore: View = view.findViewById(R.id.vMore)
        val vKarmaContainer: View = view.findViewById(R.id.vKarmaContainer)
        val vAvatarContainer: View = view.findViewById(R.id.vAvatarContainer)
        val vCommentsContainer: View = view.findViewById(R.id.vCommentsContainer)
        val vKarma: ViewKarma = view.findViewById(R.id.vKarma)
        val vAvatar: ViewAvatarTitle = view.findViewById(R.id.vAvatar)
        val vComments: TextView = view.findViewById(R.id.vComments)

        xKarma.setView(vKarma)
        xAccount.setView(vAvatar)
        vComments.text = "${guide.unit.subPublicationsCount}"

        if (guide.isCorrect()) {
            view.visibility = View.VISIBLE
            ImageLoader.load(guide.getTitleImage()).size(Constants.DRAFT_IMAGE_W, Constants.DRAFT_IMAGE_H).into(vImage)
            vTitle.text = guide.getTitleText()
        } else {
            view.visibility = View.GONE
        }

        vCommentsContainer.setOnClickListener {
            Navigator.to(SComments(guide.unit.id, 0))
        }

        vMore.visibility = if (guide.unit.status == API.STATUS_DRAFT) View.VISIBLE else View.GONE
        vKarmaContainer.visibility = if (guide.unit.status == API.STATUS_DRAFT) View.GONE else View.VISIBLE
        vAvatarContainer.visibility = if (guide.unit.status == API.STATUS_DRAFT) View.GONE else View.VISIBLE
        vCommentsContainer.visibility = if (guide.unit.status == API.STATUS_DRAFT) View.GONE else View.VISIBLE

        view.findViewById<View>(R.id.touch).setOnClickListener { v ->
            if (guide.unit.isDraft) SCreateGuidePages.instance(guide.unit.id, Navigator.TO)
            else if (ControllerGuides.isFileMode()) {
                //ControllerAdsFullscreen.showIfNeed()
                ControllerAppodeal.show()
                Navigator.to(SPost(guide.unit, emptyArray(), 0))
            } else Navigator.to(SNetworkView(guide))
        }

        vMore.setOnClickListener {
            SplashMenu()
                    .add(R.string.app_change) {change() }
                    .add(R.string.app_remove) {removeDraft() }
                    .asPopupShow(vMore)

        }

    }

    fun removeDraft(){
        ApiRequestsSupporter.executeProgressDialog(RPublicationsRemove(guide.unit.id)){ r->
            remove()
        }
    }

    override fun notifyItem() {
        if (guide.isCorrect())
            ImageLoader.load(guide.getTitleImage()).size(Constants.DRAFT_IMAGE_W, Constants.DRAFT_IMAGE_H).intoCash()
    }

    private fun change() {
        Navigator.to(SCreateGuideTitle(guide.unit.fandom.id, guide))
    }

}
