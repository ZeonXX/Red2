package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.app.Constants
import com.ngt.red.models.Guide
import com.ngt.red.screens.file_create.SCreateFile
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsPermission
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.tools.ToolsToast
import com.sup.dev.android.views.widgets.WidgetMenu
import com.sup.dev.java.classes.items.Item2
import com.sup.dev.java.libs.debug.err
import com.sup.dev.java.tools.ToolsFiles
import java.io.File
import java.lang.Exception

import java.util.ArrayList

object ControllerGuides {

    val rootFandomId = 2006L
    val fandomsIds = arrayOf(2006L)

    val appodialAppId = "71307509fe94829243ba8a9e213b283a18cff07331c264b0"

    val rootCategories: ArrayList<Guide>
        get() {
            val categories = ArrayList<Guide>()
            categories.add(Guide(ToolsResources.s(R.string.name_all), R.drawable.category_all, ""))
            categories.add(Guide(ToolsResources.s(R.string.name_adventure), R.drawable.category_adventures, "adventure"))
            categories.add(Guide(ToolsResources.s(R.string.name_creative), R.drawable.category_creative, "creative"))
            categories.add(Guide(ToolsResources.s(R.string.name_minigame), R.drawable.category_minigames, "minigame"))
            categories.add(Guide(ToolsResources.s(R.string.name_parkour), R.drawable.category_parkour, "parkour"))
            categories.add(Guide(ToolsResources.s(R.string.name_redstone), R.drawable.category_redstone, "redstone"))
            categories.add(Guide(ToolsResources.s(R.string.name_other), R.drawable.category_other, "other"))
            return categories
        }

    fun getGuides(parentGuide: Guide): ArrayList<Guide> {
        return ArrayList()
    }

    fun isFileMode() = true

    fun getMainTitle() = R.string.maps

    fun getAlarmMessage() = R.string.notification_alarm_maps

    fun toCreateScreen(action:NavigationAction){
        Navigator.action(action, SCreateFile())
    }

    fun chooseFile(onFinish:(String, String, String)->Unit){
        ToolsPermission.requestReadPermission {
            val files = File(Constants.MINECRAFT_MAPS_FOLDER).listFiles()

            var dirIsFound = false

            if(files != null) {
                val dialog = WidgetMenu()
                for (f in files) {
                    if (f.isDirectory) {
                        var name = "map_"+System.currentTimeMillis()
                        try {
                            name = ToolsFiles.readLine(File(f, "levelname.txt"))
                        }catch (e:Exception){
                            err(e)
                        }

                        if(name.isNotEmpty()) {
                            dirIsFound = true
                            dialog.add(name) {
                                onFinish.invoke(f.absolutePath, Constants.MINECRAFT_MAPS_FOLDER, name)
                            }
                        }
                    }
                }
                if(dirIsFound)dialog.asSheetShow()
            }

            if(!dirIsFound){
                ToolsToast.show(R.string.no_maps_found)
                return@requestReadPermission
            }
        }

    }

    fun getPublishAlert() =  R.string.create_finish_map

    fun getAppSubIds() = arrayOf(
            Item2(R.string.name_adventure, "adventure"),
            Item2(R.string.name_creative, "creative"),
            Item2(R.string.name_minigame, "minigame"),
            Item2(R.string.name_parkour, "parkour"),
            Item2(R.string.name_redstone, "redstone"),
            Item2(R.string.name_other, "other")
    )


}
