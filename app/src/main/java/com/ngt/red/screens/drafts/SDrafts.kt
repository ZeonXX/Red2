package com.ngt.red.screens.drafts

import android.view.View
import android.widget.ImageView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.models.publications.post.PublicationPost
import com.dzen.campfire.api.requests.publications.RPublicationsGetAll
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.controller.*
import com.ngt.red.models.EventGuideChanged
import com.ngt.red.models.CardCategoryNetwork
import com.ngt.red.models.UnitPostParsed
import com.sayzen.campfiresdk.controllers.api
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.views.screens.SLoadingRecycler
import com.sup.dev.java.libs.eventBus.EventBus

class SDrafts(
        val fandomId:Long
) : SLoadingRecycler<CardCategoryNetwork, UnitPostParsed>(R.layout.screen_network) {


    val eventBus = EventBus.subscribe(EventGuideChanged::class) { reload() }

    init {
        vFab.setImageResource(R.drawable.ic_add_white_24dp)
        (vFab as View).visibility = View.VISIBLE
        //vFab.setOnClickListener { ControllerGuides.toCreateScreen(fandomId, Navigator.SET) }
        vFab.setOnClickListener { ControllerGuides.toCreateScreen(Navigator.SET) }
        vRefresh!!.setBackgroundColor(0x0000000)

        setTextEmpty(R.string.post_drafts_empty_text)
        setTitle(R.string.app_drafts)

        adapter.setBottomLoader { onLoad, cards ->
            RPublicationsGetAll()
                    .setTokenRequired(true)
                    .setPublicationTypes(API.PUBLICATION_TYPE_POST)
                    .setCount(10)
                    .setOffset(cards.size)
                    .setFandomsIds(ControllerGuides.fandomsIds)
                    .setDrafts(true)
                    .setAppKey(Constants.getAppKey())
                    .onComplete { r ->
                        onLoad.invoke(Array(r.publications.size) { UnitPostParsed(r.publications[it] as PublicationPost) })
                        //if (adapter.isEmpty && r.publications.isEmpty()) ControllerGuides.toCreateScreen(fandomId, Navigator.REPLACE)
                        if (adapter.isEmpty && r.publications.isEmpty()) ControllerGuides.toCreateScreen(Navigator.REPLACE)
                    }
                    .onNetworkError { onLoad.invoke(null) }
                    .send(api)
        }
    }

    override fun classOfCard() = CardCategoryNetwork::class

    override fun map(item: UnitPostParsed) = CardCategoryNetwork(item)

    override fun onPause() {
        super.onPause()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageBitmap(null)
    }

    override fun onResume() {
        super.onResume()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }


}