package com.ngt.red.screens.style

import android.view.View
import android.widget.ImageView

import com.ngt.red.R
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.Background
import com.ngt.red.models.EventStyleChanged
import com.sup.dev.android.views.cards.Card
import com.sup.dev.java.libs.eventBus.EventBus

class CardBackground(
        private val background: Background
) : Card(R.layout.screen_styles_card_background) {

    override fun bindView(view: View) {
        super.bindView(view)
        (view.findViewById<View>(R.id.image) as ImageView).setImageResource(background.previewResourceId)
        view.findViewById<View>(R.id.image).setOnClickListener { v ->
            ControllerStorage.setBackgroundRes(background.previewResourceId)
            EventBus.post(EventStyleChanged())
        }
    }
}
