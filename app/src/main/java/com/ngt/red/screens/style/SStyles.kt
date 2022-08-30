package com.ngt.red.screens.style

import androidx.viewpager.widget.ViewPager
import android.view.View
import android.widget.ImageView
import com.ngt.red.R
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventStyleChanged
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.views.support.adapters.pager.PagerCardAdapter
import com.sup.dev.android.views.views.pager.ViewPagerIndicatorTitles
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.libs.eventBus.EventBusSubscriber

class SStyles @JvmOverloads constructor(position: Int = 0) : Screen(R.layout.screen_styles) {

    private val eventBus = EventBus
            .subscribe(EventStyleChanged::class) {updateBackground() }

    init {

        val vIndicator = findViewById<ViewPagerIndicatorTitles>(R.id.indicator)
        val vPager = findViewById<ViewPager>(R.id.pager)
        val adapter = PagerCardAdapter()
        vPager.adapter = adapter

        adapter.add(PageBackgrounds())
        adapter.add(PageThemes())
        vPager.setCurrentItem(position, false)

        vIndicator.setTitles(R.string.background, R.string.theme)
        vIndicator.setPagerView(vPager)

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
