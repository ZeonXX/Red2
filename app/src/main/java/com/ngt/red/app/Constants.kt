package com.ngt.red.app

import com.ngt.red.R
import com.sup.dev.android.tools.ToolsResources

object Constants{


    val ROOT_FOLDER = "sdcard/"
    val MINECRAFT_MAPS_FOLDER = ROOT_FOLDER + "games/com.mojang/minecraftworlds/"

    val DRAFT_IMAGE_W = 800
    val DRAFT_IMAGE_H = 400
    val DRAFT_TITLE_SIZE = 120
    val GUIDE_IMAGE_SIDES = 400

    fun getAppKey() = ToolsResources.s(R.string.app_key)


}