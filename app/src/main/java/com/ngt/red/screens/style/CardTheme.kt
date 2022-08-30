package com.ngt.red.screens.style

import android.view.View

import com.ngt.red.R
import com.ngt.red.app.App
import com.ngt.red.controller.ControllerStorage
import com.ngt.red.models.Theme
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.views.cards.Card
import com.sup.dev.java.tools.ToolsThreads

class CardTheme(
        private val theme: Theme
) : Card(R.layout.screen_styles_card_theme) {

    override fun bindView(view: View) {
        super.bindView(view)
        val vPrimary = view.findViewById<View>(R.id.color_primary)
        val vAccent = view.findViewById<View>(R.id.color_accent)
        val vTouch = view.findViewById<View>(R.id.touch)

        vPrimary.setBackgroundResource(theme.primaryColorId)
        vAccent.setBackgroundResource(theme.accentColorId)
        vTouch.setOnClickListener { v ->
            ControllerStorage.setTheme(theme.themeId)
            App.activity().recreate()
            ToolsThreads.main(20) { Navigator.set(SStyles(1)) }
        }
    }
}
