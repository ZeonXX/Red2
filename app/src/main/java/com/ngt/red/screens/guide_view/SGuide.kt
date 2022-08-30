package com.ngt.red.screens.guide_view

import androidx.viewpager.widget.ViewPager
import android.view.View
import android.widget.ImageView
import com.ngt.red.R
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.models.Guide
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.views.support.adapters.pager.PagerCardAdapter
import com.sup.dev.java.libs.eventBus.EventBus

class SGuide(val guide: Guide) : Screen(R.layout.screen_guide) {

    private val eventBus = EventBus
            .subscribe(EventStyleChanged::class) { updateBackground() }

    init {
        setTitle(guide.title)

        val vPager = findViewById<ViewPager>(R.id.pager)

        val adapter = PagerCardAdapter()
        vPager.adapter = adapter

        for (i in 0 until guide.pages.size) adapter.add(PageGuide(vPager, guide.pages[i]))

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
