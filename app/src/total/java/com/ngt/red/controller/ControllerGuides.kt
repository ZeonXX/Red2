package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.ngt.red.screens.guide_create.SCreateGuideTitle
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.java.classes.items.Item2

import java.util.ArrayList
import java.util.HashMap

object ControllerGuides {

    val rootFandomId = 2870L
    val fandomsIds = arrayOf(1924L, 1925L, 1926L, 1927L, 2870L)

    val appodialAppId = "4e5c9bbca73bea605fcc685479de4c89e232af570270c670"

    val categories = HashMap<Guide, ArrayList<Guide>>()

    fun isFileMode() = false

    fun getMainTitle() = R.string.guides

    fun getAlarmMessage() = R.string.notification_alarm_guides

    fun toCreateScreen(fandomId:Long, action: NavigationAction) {
        Navigator.action(action, SCreateGuideTitle(fandomId))
    }

    fun chooseFile(onFinish: (String, String, String) -> Unit) {

    }

    fun getPublishAlert() = R.string.create_finish_guide

    fun getAppSubIds() = emptyArray<Item2<Int, String>>()

    val rootCategories: ArrayList<Guide>
        get() {
            val categories = ArrayList<Guide>()
            categories.add(redstone())
            categories.add(building())
            categories.add(chem())
            categories.add(cb())
            return categories
        }

    fun getGuides(parentGuide: Guide): ArrayList<Guide> {
        return categories[parentGuide]!!
    }
    private fun redstone(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_red), R.drawable.d_red)
        val subCategories = ArrayList<Guide>()
        for(i in Guides_Red.rootCategories) subCategories.add(i)
        categories[Guide] = subCategories
        return Guide
    }

    private fun building(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_build), R.drawable.d_build)
        val subCategories = ArrayList<Guide>()
        for(i in Guides_Build.rootCategories) subCategories.add(i)
        categories[Guide] = subCategories
        return Guide
    }
    private fun chem(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_chem), R.drawable.d_chem)
        val subCategories = ArrayList<Guide>()
        for(i in Guides_Chem.rootCategories) subCategories.add(i)
        categories[Guide] = subCategories
        return Guide
    }
    private fun cb(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_cb), R.drawable.d_cb)
        val subCategories = ArrayList<Guide>()
        for(i in Guides_Cb.rootCategories) subCategories.add(i)
        categories[Guide] = subCategories
        return Guide
    }

}
