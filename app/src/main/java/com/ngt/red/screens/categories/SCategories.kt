package com.ngt.red.screens.categories

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.ngt.red.BuildConfig
import com.ngt.red.R
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.models.Guide
import com.ngt.red.screens.file_create.SCreateFile
import com.ngt.red.screens.info.SInfo
import com.ngt.red.screens.style.SStyles
import com.sayzen.campfiresdk.controllers.ControllerApi
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.views.support.adapters.recycler_view.RecyclerCardAdapter
import com.sup.dev.android.views.views.ViewIcon
import com.sup.dev.java.libs.eventBus.EventBus
import java.util.*

class SCategories constructor(parentCategory: Guide? = null) : Screen(R.layout.screen_categories) {

    private val eventBus = EventBus
            .subscribe(EventStyleChanged::class) { e -> updateBackground() }


    init {

        ControllerApi.loginIfTokenExist()

        if (parentCategory == null) setTitle(ControllerGuides.getMainTitle())
        else setTitle(parentCategory.title)

        val vStyles = findViewById<ViewIcon>(R.id.styles)
        vStyles.visibility = if (parentCategory == null) View.VISIBLE else View.GONE
        vStyles.setOnClickListener { v -> Navigator.to(SStyles()) }


        val vInfo = findViewById<ViewIcon>(R.id.info)
        vInfo.visibility = if (parentCategory == null) View.VISIBLE else View.GONE
        vInfo.setOnClickListener { v -> Navigator.to(SInfo()) }

        val vRecycler = findViewById<RecyclerView>(R.id.vRecycler)
        vRecycler.layoutManager = LinearLayoutManager(context)

        val adapter = RecyclerCardAdapter()
        vRecycler.adapter = adapter

        val categories: ArrayList<Guide> = if (parentCategory == null) ControllerGuides.rootCategories else ControllerGuides.getGuides(parentCategory)

        for (c in categories) adapter.add(CardCategory(c))
        if (parentCategory == null) {
            if (!ControllerGuides.isFileMode()) adapter.add(CardNetwork())
            if (BuildConfig.APPLICATION_ID != "com.dzen.total") adapter.add(CardAd(ToolsResources.s(R.string.app_name_total), R.drawable.a_logo_total, "com.dzen.total", ToolsResources.s(R.string.app_name_total_desc)))
            // if (BuildConfig.APPLICATION_ID != "com.dzen.building") adapter.add(CardAd("Building Guide", R.drawable.a_logo_build, "com.dzen.building"))
            // if (BuildConfig.APPLICATION_ID != "com.dzen.cb") adapter.add(CardAd("Command Block Guide", R.drawable.a_logo_cb, "com.dzen.cb"))
            // if (BuildConfig.APPLICATION_ID != "com.dzen.chemistry") adapter.add(CardAd("Chemistry Guide", R.drawable.a_logo_chim, "com.dzen.chemistry"))
            // if (BuildConfig.APPLICATION_ID != "com.dzen.maps") adapter.add(CardAd("Maps", R.drawable.a_logo_maps, "com.dzen.maps"))
            // adapter.add(CardAd("Campfire", R.drawable.a_logo_cf, "com.dzen.campfire"))
            if (BuildConfig.APPLICATION_ID == "com.dzen.total")
                adapter.add(CardAd("Campfire", R.drawable.logo_campfire_128x128, "com.dzen.campfire", ToolsResources.s(R.string.app_name_campfire_desc)))

        }

        val vAdd: FloatingActionButton = findViewById(R.id.vAdd)
        (vAdd as View).visibility = if (!ControllerGuides.isFileMode()) View.GONE else View.VISIBLE
        vAdd.setOnClickListener {
            ControllerApi.loginWithRegistration {
                Navigator.to(SCreateFile())
            }
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

    private fun updateBackground() {
        (findViewById<View>(R.id.vBackground) as ImageView).setImageResource(ControllerStorage.getBackgroundRes())
    }


}
