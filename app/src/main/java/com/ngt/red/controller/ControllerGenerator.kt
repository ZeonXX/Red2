package com.ngt.red.controller

import com.ngt.red.models.Guide
import com.ngt.red.models.GuidePage
import com.sup.dev.android.tools.ToolsResources

object ControllerGenerator {

    fun guide(prefix: String): Guide {

        val g = Guide(ToolsResources.s("${prefix}s0"), ToolsResources.getDrawableId("${prefix}s0"))

        try {
            var x = 1
            while (true) {
                val page = GuidePage(ToolsResources.s("${prefix}s$x"), ToolsResources.getDrawableId("${prefix}s$x"))
                try{
                    page.commandText = ToolsResources.s("${prefix}s${x}x")
                }catch (ex:Exception){

                }
                g.addPage(page)
                x++
            }
        } catch (e: Exception) {

        }

        return g

    }

    fun guideWithImageTags(prefix: String): Guide {

        val g = Guide(ToolsResources.s("${prefix}s0"), "${prefix}s0")

        try {
            var x = 1
            while (true) {
                val page = GuidePage(ToolsResources.s("${prefix}s$x"), "${prefix}s$x")
                try{
                    page.commandText = ToolsResources.s("${prefix}s${x}x")
                }catch (ex:Exception){

                }
                g.addPage(page)
                x++
            }
        } catch (e: Exception) {

        }

        return g

    }


}