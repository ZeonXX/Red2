package com.ngt.red.screens.info

import android.view.View
import com.ngt.red.R
import com.sup.dev.android.libs.screens.Screen
import com.sup.dev.android.tools.ToolsIntent

class SInfo : Screen(R.layout.screen_info) {

    init {

        val vButton = findViewById<View>(R.id.vButton)

        vButton.setOnClickListener {
            ToolsIntent.openLink("http://campfiresayzen.net/")
        }

    }

}
