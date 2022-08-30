package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.sup.dev.android.tools.ToolsResources

object Guides_Cb {

    val rootCategories: ArrayList<Guide>
        get() {
            val categories = ArrayList<Guide>()
            categories.add(tutorial())
            categories.add(basic())
            categories.add(execute())
            categories.add(advanced())
            return categories
        }

    private fun tutorial(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_tutorial), "cb_z1s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z1"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s2"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z2"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z3"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z7"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z8"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun basic(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_basic), "cb_z5s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s3"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s4"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z4"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z5"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z6"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s7"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s5"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s6"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s11"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s12"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s13"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s14"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z11"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s15"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s16"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s17"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s18"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s19"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s1"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun advanced(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_advanced), "cb_z20s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s9"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s10"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s20"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_s8"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z9"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z10"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z12"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z13"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z14"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z19"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z20"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun execute(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_execute), "cb_z15s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z15"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z16"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z17"))
        subCategories.add(ControllerGenerator.guideWithImageTags("cb_z18"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }



}