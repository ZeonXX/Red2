package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.sup.dev.android.tools.ToolsResources

object Guides_Chem {

    val rootCategories: ArrayList<Guide>
        get() {
            val categories = ArrayList<Guide>()
            categories.add(tutorial())
            categories.add(labTable())
            categories.add(crafts())
            categories.add(natural())
            return categories
        }

    private fun tutorial(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_tutorial), "chem_z1s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z1"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z2"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z3"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z4"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z5"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun labTable(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_lab_table), "chem_z9s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z6"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z8"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z9"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z10"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }


    private fun crafts(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_crafts), "chem_z7s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z7"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z11"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z12"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z13"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z14"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z15"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun natural(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_natural), "chem_z16s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z16"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z17"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z18"))
        subCategories.add(ControllerGenerator.guideWithImageTags("chem_z19"))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }



}