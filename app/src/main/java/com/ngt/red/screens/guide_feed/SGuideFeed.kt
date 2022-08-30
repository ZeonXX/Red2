package com.ngt.red.screens.guide_feed

import android.view.View
import android.widget.ImageView
import com.dzen.campfire.api.API
import com.dzen.campfire.api.models.publications.post.PublicationPost
import com.dzen.campfire.api.requests.publications.RPublicationsGetAll
import com.ngt.red.BuildConfig
import com.ngt.red.R
import com.ngt.red.app.App
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.CardCategoryNetwork
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.models.UnitPostParsed
import com.ngt.red.screens.drafts.SDrafts
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sayzen.campfiresdk.controllers.ControllerApiLogin
import com.sayzen.campfiresdk.controllers.api
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsAndroid
import com.sup.dev.android.tools.ToolsStorage
import com.sup.dev.android.views.screens.SLoadingRecycler
import com.sup.dev.android.views.splash.SplashMenu
import com.sup.dev.java.libs.debug.log
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.tools.ToolsCryptography

class SGuideFeed : SLoadingRecycler<CardCategoryNetwork, UnitPostParsed>(R.layout.screen_network) {

    private val eventBus = EventBus
            .subscribe(EventStyleChanged::class) { e -> updateBackground() }

    private val languages = ArrayList<String>()

    init {
        findViewById<View>(R.id.vScreenRoot).setBackgroundDrawable(null)

        vFab.setImageResource(R.drawable.ic_add_white_24dp)
        (vFab as View).visibility = View.VISIBLE
        vFab.setOnClickListener { create() }

        vRefresh!!.setBackgroundColor(0x0000000)

        addToolbarIcon(R.drawable.ic_tune_white_24dp) { showFilters() }

        setTextEmpty(R.string.network_empty)
        setTitle(R.string.guides)

        updateMessage()

        adapter.setNotifyCount(5)
        adapter.setBottomLoader { onLoad, cards ->
            val fandomId = ToolsStorage.getLong("fandom_id", 0L)
            val fandomIds = if(fandomId != 0L) arrayOf(fandomId) else ControllerGuides.fandomsIds
            RPublicationsGetAll()
                    .setPublicationTypes(API.PUBLICATION_TYPE_POST)
                    .setCount(10)
                    .setOffset(cards.size)
                    .setFandomsIds(fandomIds)
                    .setLanguageId(getLanguage().id)
                    .onComplete { r ->
                        onLoad.invoke(Array(r.publications.size) { UnitPostParsed(r.publications[it] as PublicationPost) })
                    }
                    .onNetworkError { onLoad.invoke(null) }
                    .send(api)
        }
    }

    override fun classOfCard() = CardCategoryNetwork::class

    override fun map(item: UnitPostParsed) = CardCategoryNetwork(item)

    private fun updateBackground() {
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }

    private fun toDrafts(fandomId:Long) {

        if(ToolsAndroid.isDebug()) {
            val password = "123456"
            val email = "zeooontest@ya.ru"
            val passwordMD5 = ToolsCryptography.md5(password)

            ControllerApiLogin.setEmailToken(email, passwordMD5)
            ControllerApiLogin.setLoginType(ControllerApiLogin.LOGIN_EMAIL)
            ControllerApiLogin.getLoginToken {
                Navigator.to(SDrafts(fandomId))
            }
        } else {
            ControllerApi.loginWithRegistration {
                Navigator.to(SDrafts(fandomId))
            }
        }
    }

    private fun getLanguage() = ControllerApi.getLanguage(ToolsStorage.getString("languageCode", null)
            ?: ControllerApi.getLanguageCode())

    private fun showFilters() {
        if (BuildConfig.APPLICATION_ID != "com.dzen.total") {
            selectLanguages()
            return
        }
        SplashMenu()
                .add(R.string.app_language) { selectLanguages() }
                .add(R.string.app_category) { selectCategory() }
                .asSheetShow()
    }

    private fun create() {
        if (BuildConfig.APPLICATION_ID != "com.dzen.total") {
            toDrafts(ControllerGuides.rootFandomId)
            return
        }
        SplashMenu()
                .add(R.string.name_red){toDrafts(1924L)}
                .add(R.string.name_building){toDrafts(1925L)}
                .add(R.string.name_chem){toDrafts(1927L)}
                .add(R.string.name_cb){toDrafts(1926L)}
                .add(R.string.app_other){toDrafts(2870L)}
                .asSheetShow()
    }

    private fun selectCategory() {
        SplashMenu()
                .add(R.string.app_all){setFandomId(0)}
                .add(R.string.name_red){setFandomId(1924L)}
                .add(R.string.name_building){setFandomId(1925L)}
                .add(R.string.name_chem){setFandomId(1927L)}
                .add(R.string.name_cb){setFandomId(1926L)}
                .add(R.string.app_other){setFandomId(2870L)}
                .asSheetShow()
    }

    private fun setFandomId(fandom_id:Long){
        ToolsStorage.put("fandom_id", fandom_id)
        reload()
    }

    private fun selectLanguages() {
        var w = SplashMenu()
        for (l in API.LANGUAGES)
            w.add(l.name) {
                ToolsStorage.put("languageCode", l.code)
                reload()
            }
        w.asSheetShow()
    }

    private fun updateMessage() {
        if (languages.contains("en")) clearAction()
        else setAction(R.string.network_english) {
            languages.add("en")
            updateMessage()
            reload()
        }
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