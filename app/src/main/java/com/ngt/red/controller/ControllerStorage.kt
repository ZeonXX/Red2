package com.ngt.red.controller

import androidx.annotation.DrawableRes
import androidx.annotation.StyleRes

import com.ngt.red.R
import com.sup.dev.android.tools.ToolsStorage

object ControllerStorage{

    fun getBackgroundRes(): Int {
        return ToolsStorage.getInt("background", R.drawable.b_bg_2)
    }

    fun getTheme(): Int {
        return ToolsStorage.getInt("theme", -1)
    }


    fun setBackgroundRes(@DrawableRes res: Int) {
        ToolsStorage.put("background", res)
    }

    fun setTheme(@StyleRes res: Int) {
        ToolsStorage.put("theme", res)
    }


}
