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

    val rootFandomId = 1926L
    val fandomsIds = arrayOf(1926L)

    val appodialAppId = "6ee48fef45e68425544447ca53c650413b3d04b28e1f2e82"

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
            categories.add(basic())
            categories.add(execute())
            categories.add(advanced())
            return categories
        }

    fun getGuides(parentGuide: Guide): ArrayList<Guide> {
        return categories[parentGuide]!!
    }

    private fun tutorial(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_tutorial), R.drawable.z1s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("z1"))
        subCategories.add(ControllerGenerator.guide("s2"))
        subCategories.add(ControllerGenerator.guide("z2"))
        subCategories.add(ControllerGenerator.guide("z3"))
        subCategories.add(ControllerGenerator.guide("z7"))
        subCategories.add(ControllerGenerator.guide("z8"))

        categories[Guide] = subCategories
        return Guide
    }

    private fun basic(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_basic), R.drawable.z5s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("s3"))
        subCategories.add(ControllerGenerator.guide("s4"))
        subCategories.add(ControllerGenerator.guide("z4"))
        subCategories.add(ControllerGenerator.guide("z5"))
        subCategories.add(ControllerGenerator.guide("z6"))
        subCategories.add(ControllerGenerator.guide("s7"))
        subCategories.add(ControllerGenerator.guide("s5"))
        subCategories.add(ControllerGenerator.guide("s6"))
        subCategories.add(ControllerGenerator.guide("s11"))
        subCategories.add(ControllerGenerator.guide("s12"))
        subCategories.add(ControllerGenerator.guide("s13"))
        subCategories.add(ControllerGenerator.guide("s14"))
        subCategories.add(ControllerGenerator.guide("z11"))
        subCategories.add(ControllerGenerator.guide("s15"))
        subCategories.add(ControllerGenerator.guide("s16"))
        subCategories.add(ControllerGenerator.guide("s17"))
        subCategories.add(ControllerGenerator.guide("s18"))
        subCategories.add(ControllerGenerator.guide("s19"))
        subCategories.add(ControllerGenerator.guide("s1"))

        categories[Guide] = subCategories
        return Guide
    }

    private fun advanced(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_advanced), R.drawable.z20s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("s9"))
        subCategories.add(ControllerGenerator.guide("s10"))
        subCategories.add(ControllerGenerator.guide("s20"))
        subCategories.add(ControllerGenerator.guide("s8"))
        subCategories.add(ControllerGenerator.guide("z9"))
        subCategories.add(ControllerGenerator.guide("z10"))
        subCategories.add(ControllerGenerator.guide("z12"))
        subCategories.add(ControllerGenerator.guide("z13"))
        subCategories.add(ControllerGenerator.guide("z14"))
        subCategories.add(ControllerGenerator.guide("z19"))
        subCategories.add(ControllerGenerator.guide("z20"))

        categories[Guide] = subCategories
        return Guide
    }

    private fun execute(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_execute), R.drawable.z15s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guide("z15"))
        subCategories.add(ControllerGenerator.guide("z16"))
        subCategories.add(ControllerGenerator.guide("z17"))
        subCategories.add(ControllerGenerator.guide("z18"))

        categories[Guide] = subCategories
        return Guide
    }


}
