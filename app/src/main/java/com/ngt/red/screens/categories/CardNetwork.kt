package com.ngt.red.screens.categories

import android.view.View

import com.ngt.red.R
import com.ngt.red.screens.guide_feed.SGuideFeed
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.views.cards.Card

class CardNetwork : Card(R.layout.screen_categories_card_network) {

    override fun bindView(view: View) {
        super.bindView(view)

        view.findViewById<View>(R.id.touch).setOnClickListener { v -> Navigator.to(SGuideFeed()) }
    }
}
