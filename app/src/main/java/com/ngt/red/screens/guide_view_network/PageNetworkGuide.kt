package com.ngt.red.screens.guide_view_network

import androidx.viewpager.widget.ViewPager
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.ngt.red.R
import com.ngt.red.controller.ControllerAppodeal
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.EventStyleChanged
import com.ngt.red.models.UnitPostParsedPage
import com.sup.dev.android.libs.image_loader.ImageLoader
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsToast
import com.sup.dev.android.views.cards.Card
import com.sup.dev.android.views.views.ViewIcon
import com.sup.dev.android.views.views.layouts.LayoutZoom
import com.sup.dev.java.libs.debug.err
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.tools.ToolsThreads

class PageNetworkGuide(
        private val vPager: ViewPager,
        private val page: UnitPostParsedPage
) : Card(R.layout.screen_guide_page_network) {

    override fun bindView(view: View) {
        super.bindView(view)

        try {

            val vZoom = view.findViewById<LayoutZoom>(R.id.zoom)
            val vText = view.findViewById<TextView>(R.id.text)
            val vPageIndex = view.findViewById<TextView>(R.id.page_index)
            val vImage = view.findViewById<ImageView>(R.id.image)
            val vToL = view.findViewById<ViewIcon>(R.id.to_left)
            val vToR = view.findViewById<ViewIcon>(R.id.to_right)


            val position = adapter.indexOf(this)
            val pagesCount = adapter.size()

            vZoom.reset()
            vToL.visibility = if (position == 0) View.INVISIBLE else View.VISIBLE
            vToR.visibility = if (position == pagesCount - 1) View.INVISIBLE else View.VISIBLE
            vToL.setOnClickListener { v -> vPager.currentItem = position - 1 }
            vToR.setOnClickListener { v -> vPager.currentItem = position + 1 }

            if (page.pageText.text.isEmpty())
                vText.visibility = View.GONE
            else {
                vText.visibility = View.VISIBLE
                vText.text = page.pageText.text
            }

            ImageLoader.load(page.pageImage.imageId).into(vImage)

            vPageIndex.text = (position + 1).toString() + " / " + pagesCount

           // ControllerAdsFullscreen.showIfNeed()
            ControllerAppodeal.show()
        } catch (e: OutOfMemoryError) {
            if (ControllerStorage.getBackgroundRes() == R.color.grey_100 && !Navigator.hasBackStack()) throw e
            err(e)
            while (Navigator.hasPrevious()) Navigator.remove(Navigator.getPrevious()!!)
            ControllerStorage.setBackgroundRes(R.color.grey_100)
            EventBus.post(EventStyleChanged())
            ToolsToast.show(R.string.remove_background_message)
            ToolsThreads.main(100) { update() }
        }
    }
}
