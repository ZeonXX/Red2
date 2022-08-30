package com.ngt.red.controller

import android.content.Intent
import com.ngt.red.R
import com.ngt.red.app.ActivityApp
import com.sayzen.campfiresdk.controllers.ControllerNotifications
import com.sup.dev.android.app.SupAndroid
import com.sup.dev.android.models.EventJonScheduler
import com.sup.dev.android.tools.ToolsJobScheduler
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.android.tools.ToolsStorage
import com.sup.dev.java.libs.eventBus.EventBus
import com.sup.dev.java.tools.ToolsMath
import com.sup.dev.java.tools.ToolsThreads

object ControllerAlarm {

    fun init() {
        EventBus.subscribeHard(EventJonScheduler::class) {
            val icon = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) R.drawable.logo_alpha else R.drawable.logo
            val intent = Intent(SupAndroid.appContext, ActivityApp::class.java)
            val title = ToolsResources.s(R.string.app_name)

            intent.putExtra("ALARM", "ALRAM")

            ControllerNotifications.chanelOther.post(icon, title, ToolsResources.s(ControllerGuides.getAlarmMessage()), intent, "alarm")
            schedule()
        }

        schedule()
    }

    private fun schedule() {


        ToolsThreads.main(2000) {

            val long = ToolsStorage.getLong("ControllerAlarm_time", 0)
            if (long > System.currentTimeMillis()) return@main

            val day = 1000L * 60 * 60 * 24
            val random = ToolsMath.randomLong(day, day * 3)

            ToolsStorage.put("ControllerAlarm_time", System.currentTimeMillis() + random)

            ToolsJobScheduler.scheduleJob(1, random)
        }

    }

}