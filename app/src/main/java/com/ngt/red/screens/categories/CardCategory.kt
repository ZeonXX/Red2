package com.ngt.red.screens.categories

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.ngt.red.R
import com.ngt.red.controller.ControllerGuides
import com.ngt.red.models.Guide
import com.ngt.red.screens.file_feed.SFileFeed
import com.ngt.red.screens.guide_view.SGuide
import com.sup.dev.android.libs.image_loader.ImageLoader
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.views.cards.Card

class CardCategory(
        private val guide: Guide
) : Card(R.layout.screen_categories_card) {

    @SuppressLint("SetTextI18n")
    override fun bindView(view: View) {
        super.bindView(view)
        val vImage: ImageView = view.findViewById(R.id.image)
        val vTitle: TextView = view.findViewById(R.id.title)

        if (guide.imageId > 0) {
            vImage.setImageResource(guide.imageId.toInt())
        } else if (guide.imageTag.isNotEmpty()) {
            ImageLoader.load(guide.imageTag).size(800, 400).into(vImage)
        }

        vTitle.text = guide.title

        view.findViewById<View>(R.id.touch).setOnClickListener { v ->

            if (ControllerGuides.isFileMode()) {
                Navigator.to(SFileFeed(guide.tag, guide.title))
            } else {
                if (guide.pages.isEmpty()) Navigator.to(SCategories(guide))
                else Navigator.to(SGuide(guide))
            }
        }

    }

}
