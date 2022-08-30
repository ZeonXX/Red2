package com.ngt.red.screens.file_feed

import android.view.View
import android.widget.ImageView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.models.publications.post.PublicationPost
import com.dzen.campfire.api.requests.publications.RPublicationsGetAll
import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.CardCategoryNetwork
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.models.UnitPostParsed
import com.ngt.red.screens.file_create.SCreateFile
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.controllers.api
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsStorage
import com.sup.dev.android.views.screens.SLoadingRecycler
import com.sup.dev.android.views.support.adapters.recycler_view.RecyclerCardAdapterLoading
import com.sup.dev.java.libs.eventBus.EventBus
import kotlin.reflect.KClass

class SFileFeed(
        val appSubKey: String,
        val title: String
) : SLoadingRecycler<CardCategoryNetwork, UnitPostParsed>(R.layout.screen_network) {

    private val eventBus = EventBus
            .subscribe(EventStyleChanged::class) { e -> updateBackground() }

    init {
        findViewById<View>(R.id.vScreenRoot).setBackgroundDrawable(null)

        vFab.setImageResource(R.drawable.ic_add_white_24dp)
        (vFab as View).visibility = View.VISIBLE
        vFab.setOnClickListener { toDrafts() }

        vRefresh!!.setBackgroundColor(0x0000000)

        setTextEmpty(R.string.network_empty)
        setTitle(title)

        if (!ToolsStorage.contains("languageCode"))
            ToolsStorage.put("languageCode", ControllerApi.getLanguage().code)

        adapter.setNotifyCount(5)
        adapter.setBottomLoader { onLoad, cards ->
            val r = RPublicationsGetAll()
                    .setPublicationTypes(API.PUBLICATION_TYPE_POST)
                    .setCount(10)
                    .setOffset(cards.size)
                    .setFandomsIds(ControllerGuides.fandomsIds)
                    .setAppKey(Constants.getAppKey())
                    .onComplete { r ->
                        onLoad.invoke(Array(r.publications.size) { UnitPostParsed(r.publications[it] as PublicationPost) })
                    }
                    .onNetworkError { onLoad.invoke(null) } as RPublicationsGetAll
            if (appSubKey.isNotEmpty()) r.setAppSubKey(appSubKey)
            r.send(api)
        }
    }

    override fun classOfCard() = CardCategoryNetwork::class

    override fun map(item: UnitPostParsed) = CardCategoryNetwork(item)

    private fun updateBackground() {
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }

    private fun toDrafts() {
        ControllerApi.loginWithRegistration { Navigator.to(SCreateFile()) }
    }

    override fun onPause() {
        super.onPause()
        (findViewById<View>(R.id.vBackground) as ImageView).setImageBitmap(null)
    }

    override fun onResume() {
        super.onResume()
        updateBackground()
    }

}