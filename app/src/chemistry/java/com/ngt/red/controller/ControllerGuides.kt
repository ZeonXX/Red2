package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.ngt.red.screens.guide_create.SCreateGuideTitle
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.java.classes.items.Item2
import java.util.*

object ControllerGuides {

    val rootFandomId = 1927L
    val fandomsIds = arrayOf(1927L)

    val appodialAppId = "0756a06e780bab463d72a594221e716b2152991b1abb6f5e"

    private val categories = HashMap<Guide, ArrayList<Guide>>()

    fun isFileMode() = false

    fun getMainTitle() = R.string.guides

    fun getAlarmMessage() = R.string.notification_alarm_guides

    fun toCreateScreen(action: NavigationAction) {
        Navigator.action(action, SCreateGuideTitle(rootFandomId, null))
    }

    fun chooseFile(onFinish: (String, String, String) -> Unit) {

    }

    fun getPublishAlert() = R.string.create_finish_guide

    fun getAppSubIds() = emptyArray<Item2<Int, String>>()

    val rootCategories: ArrayList<Guide>
        get() {
            val categories = ArrayList<Guide>()
            categories.add(tutorial())
            categories.add(labTable())
            categories.add(crafts())
            categories.add(natural())
            return categories
        }

    fun getGuides(parentGuide: Guide): ArrayList<Guide> {
        return categories[parentGuide]!!
    }

    private fun tutorial(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_tutorial), R.drawable.z1s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("z1"))
        subCategories.add(ControllerGenerator.guide("z2"))
        subCategories.add(ControllerGenerator.guide("z3"))
        subCategories.add(ControllerGenerator.guide("z4"))
        subCategories.add(ControllerGenerator.guide("z5"))

        categories[Guide] = subCategories
        return Guide
    }

    private fun labTable(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_lab_table), R.drawable.z9s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("z6"))
        subCategories.add(ControllerGenerator.guide("z8"))
        subCategories.add(ControllerGenerator.guide("z9"))
        subCategories.add(ControllerGenerator.guide("z10"))

        categories[Guide] = subCategories
        return Guide
    }


    private fun crafts(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_crafts), R.drawable.z7s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("z7"))
        subCategories.add(ControllerGenerator.guide("z11"))
        subCategories.add(ControllerGenerator.guide("z12"))
        subCategories.add(ControllerGenerator.guide("z13"))
        subCategories.add(ControllerGenerator.guide("z14"))
        subCategories.add(ControllerGenerator.guide("z15"))

        categories[Guide] = subCategories
        return Guide
    }

    private fun natural(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_natural), R.drawable.z16s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("z16"))
        subCategories.add(ControllerGenerator.guide("z17"))
        subCategories.add(ControllerGenerator.guide("z18"))
        subCategories.add(ControllerGenerator.guide("z19"))

        categories[Guide] = subCategories
        return Guide
    }


}
