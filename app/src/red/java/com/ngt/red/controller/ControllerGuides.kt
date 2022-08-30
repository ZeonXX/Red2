package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.ngt.red.models.GuidePage
import com.ngt.red.screens.guide_create.SCreateGuideTitle
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.java.classes.items.Item2

import java.util.ArrayList
import java.util.HashMap

object ControllerGuides {

    val rootFandomId = 1924L
    val fandomsIds = arrayOf(1924L)

    val appodialAppId = "cf3ec124637fb9444e443d7cbe5194087b29d97415b1bca8"

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
            categories.add(fundamentalsAndCrafts())
            categories.add(basics())
            categories.add(farms())
            categories.add(doors())
            categories.add(bridges())
            categories.add(mechanisms())
            categories.add(traps())
            categories.add(buildings())
            categories.add(wring())
            return categories
        }

    fun getGuides(parentGuide: Guide): ArrayList<Guide> {
        return categories[parentGuide]!!
    }

    private fun fundamentalsAndCrafts(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_craft), R.drawable.z32s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z24s00), R.drawable.z24s00,
                GuidePage(ToolsResources.s(R.string.z24s0), R.drawable.z24s0),
                GuidePage(ToolsResources.s(R.string.z24s1), R.drawable.z24s1),
                GuidePage(ToolsResources.s(R.string.z24s2), R.drawable.z24s2),
                GuidePage(ToolsResources.s(R.string.z24s3), R.drawable.z24s3),
                GuidePage(ToolsResources.s(R.string.z24s4), R.drawable.z24s4),
                GuidePage(ToolsResources.s(R.string.z24s5), R.drawable.z24s5),
                GuidePage(ToolsResources.s(R.string.z24s6), R.drawable.z24s6),
                GuidePage(ToolsResources.s(R.string.z24s7), R.drawable.z24s7),
                GuidePage(ToolsResources.s(R.string.z24s8), R.drawable.z24s8),
                GuidePage(ToolsResources.s(R.string.z24s9), R.drawable.z24s9),
                GuidePage(ToolsResources.s(R.string.z24s10), R.drawable.z24s10),
                GuidePage(ToolsResources.s(R.string.z24s11), R.drawable.z24s11),
                GuidePage(ToolsResources.s(R.string.z24s12), R.drawable.z24s12),
                GuidePage(ToolsResources.s(R.string.z24s13), R.drawable.z24s13),
                GuidePage(ToolsResources.s(R.string.z24s14), R.drawable.z24s14),
                GuidePage(ToolsResources.s(R.string.z24s15), R.drawable.z24s15),
                GuidePage(ToolsResources.s(R.string.z24s16), R.drawable.z24s16),
                GuidePage(ToolsResources.s(R.string.z24s17), R.drawable.z24s17)))

        subCategories.add(Guide(ToolsResources.s(R.string.z25s00), R.drawable.z25s00,
                GuidePage(ToolsResources.s(R.string.z25s0), R.drawable.z25s1),
                GuidePage(ToolsResources.s(R.string.z25s1), R.drawable.z25s1),
                GuidePage(ToolsResources.s(R.string.z25s2), R.drawable.z25s2),
                GuidePage(ToolsResources.s(R.string.z25s3), R.drawable.z25s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z26s00), R.drawable.z26s00,
                GuidePage(ToolsResources.s(R.string.z26s0), R.drawable.z26s0),
                GuidePage(ToolsResources.s(R.string.z26s1), R.drawable.z26s1),
                GuidePage(ToolsResources.s(R.string.z26s2), R.drawable.z26s2),
                GuidePage(ToolsResources.s(R.string.z26s3), R.drawable.z26s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z27s00), R.drawable.z27s00,
                GuidePage(ToolsResources.s(R.string.z27s0), R.drawable.z27s0),
                GuidePage(ToolsResources.s(R.string.z27s1), R.drawable.z27s1)))

        subCategories.add(Guide(ToolsResources.s(R.string.z28s00), R.drawable.z28s00,
                GuidePage(ToolsResources.s(R.string.z28s0), R.drawable.z28s0),
                GuidePage(ToolsResources.s(R.string.z28s1), R.drawable.z28s1),
                GuidePage(ToolsResources.s(R.string.z28s2), R.drawable.z28s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.z29s00), R.drawable.z29s00,
                GuidePage(ToolsResources.s(R.string.z29s0), R.drawable.z29s0),
                GuidePage(ToolsResources.s(R.string.z29s1), R.drawable.z29s1),
                GuidePage(ToolsResources.s(R.string.z29s2), R.drawable.z29s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.z30s00), R.drawable.z30s00,
                GuidePage(ToolsResources.s(R.string.z30s0), R.drawable.z30s0),
                GuidePage(ToolsResources.s(R.string.z30s1), R.drawable.z30s1)))

        subCategories.add(Guide(ToolsResources.s(R.string.z31s00), R.drawable.z31s00,
                GuidePage(ToolsResources.s(R.string.z31s0), R.drawable.z24s15),
                GuidePage(ToolsResources.s(R.string.z31s1), R.drawable.z31s1),
                GuidePage(ToolsResources.s(R.string.z31s2), R.drawable.z31s2),
                GuidePage(ToolsResources.s(R.string.z31s3), R.drawable.z31s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z32s00), R.drawable.z32s00,
                GuidePage(ToolsResources.s(R.string.z32s0), R.drawable.z24s5),
                GuidePage(ToolsResources.s(R.string.z32s1), R.drawable.z32s1),
                GuidePage(ToolsResources.s(R.string.z32s2), R.drawable.z32s2),
                GuidePage(ToolsResources.s(R.string.z32s3), R.drawable.z32s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i30s0), R.drawable.i30s0,
                GuidePage(ToolsResources.s(R.string.i30s1), R.drawable.i30s1),
                GuidePage(ToolsResources.s(R.string.i30s2), R.drawable.i30s2),
                GuidePage(ToolsResources.s(R.string.i30s3), R.drawable.i30s3),
                GuidePage(ToolsResources.s(R.string.i30s4), R.drawable.i30s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i31s0), R.drawable.i31s0,
                GuidePage(ToolsResources.s(R.string.i31s1), R.drawable.i31s1),
                GuidePage(ToolsResources.s(R.string.i31s2), R.drawable.i31s2),
                GuidePage(ToolsResources.s(R.string.i31s3), R.drawable.i31s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i32s0), R.drawable.i32s0,
                GuidePage(ToolsResources.s(R.string.i32s1), R.drawable.i32s1),
                GuidePage(ToolsResources.s(R.string.i32s2), R.drawable.i32s2),
                GuidePage(ToolsResources.s(R.string.i32s3), R.drawable.i32s3),
                GuidePage(ToolsResources.s(R.string.i32s4), R.drawable.i32s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i33s0), R.drawable.i33s0,
                GuidePage(ToolsResources.s(R.string.i33s1), R.drawable.i33s1),
                GuidePage(ToolsResources.s(R.string.i33s2), R.drawable.i33s2),
                GuidePage(ToolsResources.s(R.string.i33s3), R.drawable.i33s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i34s0), R.drawable.i34s0,
                GuidePage(ToolsResources.s(R.string.i34s1), R.drawable.i34s1),
                GuidePage(ToolsResources.s(R.string.i34s2), R.drawable.i34s2),
                GuidePage(ToolsResources.s(R.string.i34s3), R.drawable.i34s3),
                GuidePage(ToolsResources.s(R.string.i34s4), R.drawable.i34s4),
                GuidePage(ToolsResources.s(R.string.i34s5), R.drawable.i34s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.i35s0), R.drawable.i35s0,
                GuidePage(ToolsResources.s(R.string.i35s1), R.drawable.i35s1),
                GuidePage(ToolsResources.s(R.string.i35s2), R.drawable.i35s2),
                GuidePage(ToolsResources.s(R.string.i35s3), R.drawable.i35s3),
                GuidePage(ToolsResources.s(R.string.i35s4), R.drawable.i35s4)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun basics(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_root), R.drawable.i12s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i4s0), R.drawable.i4s0,
                GuidePage(ToolsResources.s(R.string.i4s1), R.drawable.i4s1),
                GuidePage(ToolsResources.s(R.string.i4s2), R.drawable.i4s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i5s0), R.drawable.i5s0,
                GuidePage(ToolsResources.s(R.string.i5s1), R.drawable.i5s1),
                GuidePage(ToolsResources.s(R.string.i5s2), R.drawable.i5s2),
                GuidePage(ToolsResources.s(R.string.i5s3), R.drawable.i5s3),
                GuidePage(ToolsResources.s(R.string.i5s4), R.drawable.i5s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i6s0), R.drawable.i6s0,
                GuidePage(ToolsResources.s(R.string.i6s1), R.drawable.i6s1),
                GuidePage(ToolsResources.s(R.string.i6s2), R.drawable.i6s2),
                GuidePage(ToolsResources.s(R.string.i6s3), R.drawable.i6s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i7s0), R.drawable.i7s0,
                GuidePage(ToolsResources.s(R.string.i7s1), R.drawable.i7s1),
                GuidePage(ToolsResources.s(R.string.i7s2), R.drawable.i7s2),
                GuidePage(ToolsResources.s(R.string.i7s3), R.drawable.i7s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i8s0), R.drawable.i8s0,
                GuidePage(ToolsResources.s(R.string.i8s1), R.drawable.i8s1),
                GuidePage(ToolsResources.s(R.string.i8s2), R.drawable.i8s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i9s0), R.drawable.i9s0,
                GuidePage(ToolsResources.s(R.string.i9s1), R.drawable.i9s1),
                GuidePage(ToolsResources.s(R.string.i9s2), R.drawable.i9s2),
                GuidePage(ToolsResources.s(R.string.i9s3), R.drawable.i9s3),
                GuidePage(ToolsResources.s(R.string.i9s4), R.drawable.i9s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i10s0), R.drawable.i10s0,
                GuidePage(ToolsResources.s(R.string.i10s1), R.drawable.i10s1),
                GuidePage(ToolsResources.s(R.string.i10s2), R.drawable.i10s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i11s0), R.drawable.i11s0,
                GuidePage(ToolsResources.s(R.string.i11s1), R.drawable.i11s1),
                GuidePage(ToolsResources.s(R.string.i11s2), R.drawable.i11s2),
                GuidePage(ToolsResources.s(R.string.i11s3), R.drawable.i11s3),
                GuidePage(ToolsResources.s(R.string.i11s4), R.drawable.i11s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i12s0), R.drawable.i12s0,
                GuidePage(ToolsResources.s(R.string.i12s1), R.drawable.i12s1),
                GuidePage(ToolsResources.s(R.string.i12s2), R.drawable.i12s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i13s0), R.drawable.i13s0,
                GuidePage(ToolsResources.s(R.string.i13s1), R.drawable.i13s1),
                GuidePage(ToolsResources.s(R.string.i13s2), R.drawable.i13s2),
                GuidePage(ToolsResources.s(R.string.i13s3), R.drawable.i13s3),
                GuidePage(ToolsResources.s(R.string.i13s4), R.drawable.i13s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i18s0), R.drawable.i18s0,
                GuidePage(ToolsResources.s(R.string.i18s1), R.drawable.i18s1),
                GuidePage(ToolsResources.s(R.string.i18s2), R.drawable.i18s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i19s0), R.drawable.i19s0,
                GuidePage(ToolsResources.s(R.string.i19s1), R.drawable.i19s1),
                GuidePage(ToolsResources.s(R.string.i19s2), R.drawable.i19s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i23s0), R.drawable.i23s0,
                GuidePage(ToolsResources.s(R.string.i23s1), R.drawable.i23s1),
                GuidePage(ToolsResources.s(R.string.i23s2), R.drawable.i23s2)))

        categories[Guide] = subCategories
        return Guide

    }

    private fun farms(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_farm), R.drawable.i1s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i1s0), R.drawable.i1s0,
                GuidePage(ToolsResources.s(R.string.i1s1), R.drawable.i1s1),
                GuidePage(ToolsResources.s(R.string.i1s2), R.drawable.i1s2),
                GuidePage(ToolsResources.s(R.string.i1s3), R.drawable.i1s3),
                GuidePage(ToolsResources.s(R.string.i1s4), R.drawable.i1s4),
                GuidePage(ToolsResources.s(R.string.i1s5), R.drawable.i1s5),
                GuidePage(ToolsResources.s(R.string.i1s6), R.drawable.i1s6),
                GuidePage(ToolsResources.s(R.string.i1s7), R.drawable.i1s7)))

        subCategories.add(Guide(ToolsResources.s(R.string.i2s0), R.drawable.i2s0,
                GuidePage(ToolsResources.s(R.string.i2s1), R.drawable.i2s1),
                GuidePage(ToolsResources.s(R.string.i2s2), R.drawable.i2s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.i3s0), R.drawable.i3s0,
                GuidePage(ToolsResources.s(R.string.i3s1), R.drawable.i3s1),
                GuidePage(ToolsResources.s(R.string.i3s2), R.drawable.i3s2),
                GuidePage(ToolsResources.s(R.string.i3s3), R.drawable.i3s3),
                GuidePage(ToolsResources.s(R.string.i3s4), R.drawable.i3s4),
                GuidePage(ToolsResources.s(R.string.i3s5), R.drawable.i3s5),
                GuidePage(ToolsResources.s(R.string.i3s6), R.drawable.i3s6),
                GuidePage(ToolsResources.s(R.string.i3s7), R.drawable.i3s7),
                GuidePage(ToolsResources.s(R.string.i3s8), R.drawable.i3s8),
                GuidePage(ToolsResources.s(R.string.i3s9), R.drawable.i3s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.z16s00), R.drawable.z16s00,
                GuidePage(ToolsResources.s(R.string.z16s0), R.drawable.z16s0),
                GuidePage(ToolsResources.s(R.string.z16s1), R.drawable.z16s1),
                GuidePage(ToolsResources.s(R.string.z16s2), R.drawable.z16s2),
                GuidePage(ToolsResources.s(R.string.z16s3), R.drawable.z16s3),
                GuidePage(ToolsResources.s(R.string.z16s4), R.drawable.z16s4),
                GuidePage(ToolsResources.s(R.string.z16s5), R.drawable.z16s5),
                GuidePage(ToolsResources.s(R.string.z16s6), R.drawable.z16s6),
                GuidePage(ToolsResources.s(R.string.z16s7), R.drawable.z16s7)))

        subCategories.add(Guide(ToolsResources.s(R.string.i24s0), R.drawable.i24s0,
                GuidePage(ToolsResources.s(R.string.i24s1), R.drawable.i24s1),
                GuidePage(ToolsResources.s(R.string.i24s2), R.drawable.i24s2),
                GuidePage(ToolsResources.s(R.string.i24s3), R.drawable.i24s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i25s0), R.drawable.i25s0,
                GuidePage(ToolsResources.s(R.string.i25s1), R.drawable.i25s1),
                GuidePage(ToolsResources.s(R.string.i25s2), R.drawable.i25s2),
                GuidePage(ToolsResources.s(R.string.i25s3), R.drawable.i25s3),
                GuidePage(ToolsResources.s(R.string.i25s4), R.drawable.i25s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i26s0), R.drawable.i26s0,
                GuidePage(ToolsResources.s(R.string.i26s1), R.drawable.i26s1),
                GuidePage(ToolsResources.s(R.string.i26s2), R.drawable.i26s2),
                GuidePage(ToolsResources.s(R.string.i26s3), R.drawable.i26s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i36s0), R.drawable.i36s0,
                GuidePage(ToolsResources.s(R.string.i36s1), R.drawable.i36s1),
                GuidePage(ToolsResources.s(R.string.i36s2), R.drawable.i36s2),
                GuidePage(ToolsResources.s(R.string.i36s3), R.drawable.i36s3),
                GuidePage(ToolsResources.s(R.string.i36s4), R.drawable.i36s4),
                GuidePage(ToolsResources.s(R.string.i36s5), R.drawable.i36s5),
                GuidePage(ToolsResources.s(R.string.i36s6), R.drawable.i36s6)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun doors(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_door), R.drawable.z1s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z0s00), R.drawable.z0s00,
                GuidePage(ToolsResources.s(R.string.z0s0), R.drawable.z0s0),
                GuidePage(ToolsResources.s(R.string.z0s1), R.drawable.z0s1),
                GuidePage(ToolsResources.s(R.string.z0s2), R.drawable.z0s2),
                GuidePage(ToolsResources.s(R.string.z0s3), R.drawable.z0s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z1s00), R.drawable.z1s00,
                GuidePage(ToolsResources.s(R.string.z1s0), R.drawable.z1s0),
                GuidePage(ToolsResources.s(R.string.z1s1), R.drawable.z1s1),
                GuidePage(ToolsResources.s(R.string.z1s2), R.drawable.z1s2),
                GuidePage(ToolsResources.s(R.string.z1s3), R.drawable.z1s3),
                GuidePage(ToolsResources.s(R.string.z1s4), R.drawable.z1s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.z5s00), R.drawable.z5s00,
                GuidePage(ToolsResources.s(R.string.z5s0), R.drawable.z5s0),
                GuidePage(ToolsResources.s(R.string.z5s1), R.drawable.z5s1),
                GuidePage(ToolsResources.s(R.string.z5s2), R.drawable.z5s2),
                GuidePage(ToolsResources.s(R.string.z5s3), R.drawable.z5s3),
                GuidePage(ToolsResources.s(R.string.z5s4), R.drawable.z5s4),
                GuidePage(ToolsResources.s(R.string.z5s5), R.drawable.z5s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.z6s00), R.drawable.z6s00,
                GuidePage(ToolsResources.s(R.string.z6s0), R.drawable.z6s0),
                GuidePage(ToolsResources.s(R.string.z6s1), R.drawable.z6s1),
                GuidePage(ToolsResources.s(R.string.z6s2), R.drawable.z6s2),
                GuidePage(ToolsResources.s(R.string.z6s3), R.drawable.z6s3),
                GuidePage(ToolsResources.s(R.string.z6s4), R.drawable.z6s4),
                GuidePage(ToolsResources.s(R.string.z6s5), R.drawable.z6s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.z10s00), R.drawable.z10s00,
                GuidePage(ToolsResources.s(R.string.z10s0), R.drawable.z10s0),
                GuidePage(ToolsResources.s(R.string.z10s1), R.drawable.z10s1),
                GuidePage(ToolsResources.s(R.string.z10s2), R.drawable.z10s2),
                GuidePage(ToolsResources.s(R.string.z10s3), R.drawable.z10s3),
                GuidePage(ToolsResources.s(R.string.z10s4), R.drawable.z10s4),
                GuidePage(ToolsResources.s(R.string.z10s5), R.drawable.z10s5),
                GuidePage(ToolsResources.s(R.string.z10s6), R.drawable.z10s6),
                GuidePage(ToolsResources.s(R.string.z10s7), R.drawable.z10s7),
                GuidePage(ToolsResources.s(R.string.z10s8), R.drawable.z10s8),
                GuidePage(ToolsResources.s(R.string.z10s9), R.drawable.z10s9),
                GuidePage(ToolsResources.s(R.string.z10s10), R.drawable.z10s10),
                GuidePage(ToolsResources.s(R.string.z10s11), R.drawable.z10s11),
                GuidePage(ToolsResources.s(R.string.z10s12), R.drawable.z10s12)))

        subCategories.add(Guide(ToolsResources.s(R.string.z11s00), R.drawable.z11s00,
                GuidePage(ToolsResources.s(R.string.z11s0), R.drawable.z11s0),
                GuidePage(ToolsResources.s(R.string.z11s1), R.drawable.z11s1),
                GuidePage(ToolsResources.s(R.string.z11s2), R.drawable.z11s2),
                GuidePage(ToolsResources.s(R.string.z11s3), R.drawable.z11s3),
                GuidePage(ToolsResources.s(R.string.z11s4), R.drawable.z11s4),
                GuidePage(ToolsResources.s(R.string.z11s5), R.drawable.z11s5),
                GuidePage(ToolsResources.s(R.string.z11s6), R.drawable.z11s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.z7s00), R.drawable.z7s00,
                GuidePage(ToolsResources.s(R.string.z7s0), R.drawable.z7s0),
                GuidePage(ToolsResources.s(R.string.z7s1), R.drawable.z7s1),
                GuidePage(ToolsResources.s(R.string.z7s2), R.drawable.z7s2),
                GuidePage(ToolsResources.s(R.string.z7s3), R.drawable.z7s3),
                GuidePage(ToolsResources.s(R.string.z7s4), R.drawable.z7s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i28s0), R.drawable.i28s0,
                GuidePage(ToolsResources.s(R.string.i28s1), R.drawable.i28s1),
                GuidePage(ToolsResources.s(R.string.i28s2), R.drawable.i28s2),
                GuidePage(ToolsResources.s(R.string.i28s3), R.drawable.i28s3),
                GuidePage(ToolsResources.s(R.string.i28s4), R.drawable.i28s4),
                GuidePage(ToolsResources.s(R.string.i28s5), R.drawable.i28s5),
                GuidePage(ToolsResources.s(R.string.i28s6), R.drawable.i28s6),
                GuidePage(ToolsResources.s(R.string.i28s7), R.drawable.i28s7),
                GuidePage(ToolsResources.s(R.string.i28s8), R.drawable.i28s8),
                GuidePage(ToolsResources.s(R.string.i28s9), R.drawable.i28s9),
                GuidePage(ToolsResources.s(R.string.i28s10), R.drawable.i28s10)))

        subCategories.add(Guide(ToolsResources.s(R.string.i42s0), R.drawable.i42s0,
                GuidePage(ToolsResources.s(R.string.i42s1), R.drawable.i42s1),
                GuidePage(ToolsResources.s(R.string.i42s2), R.drawable.i42s2),
                GuidePage(ToolsResources.s(R.string.i42s3), R.drawable.i42s3),
                GuidePage(ToolsResources.s(R.string.i42s4), R.drawable.i42s4),
                GuidePage(ToolsResources.s(R.string.i42s5), R.drawable.i42s5),
                GuidePage(ToolsResources.s(R.string.i42s6), R.drawable.i42s6),
                GuidePage(ToolsResources.s(R.string.i42s7), R.drawable.i42s7),
                GuidePage(ToolsResources.s(R.string.i42s8), R.drawable.i42s8)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun bridges(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_bridges), R.drawable.z4s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z2s00), R.drawable.z2s00,
                GuidePage(ToolsResources.s(R.string.z2s0), R.drawable.z2s0),
                GuidePage(ToolsResources.s(R.string.z2s1), R.drawable.z2s1),
                GuidePage(ToolsResources.s(R.string.z2s2), R.drawable.z2s2),
                GuidePage(ToolsResources.s(R.string.z2s3), R.drawable.z2s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z3s00), R.drawable.z3s00,
                GuidePage(ToolsResources.s(R.string.z3s0), R.drawable.z3s0),
                GuidePage(ToolsResources.s(R.string.z3s1), R.drawable.z3s1),
                GuidePage(ToolsResources.s(R.string.z3s2), R.drawable.z3s2),
                GuidePage(ToolsResources.s(R.string.z3s3), R.drawable.z3s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z4s00), R.drawable.z4s00,
                GuidePage(ToolsResources.s(R.string.z4s0), R.drawable.z4s0),
                GuidePage(ToolsResources.s(R.string.z4s1), R.drawable.z4s1),
                GuidePage(ToolsResources.s(R.string.z4s2), R.drawable.z4s2),
                GuidePage(ToolsResources.s(R.string.z4s3), R.drawable.z4s3),
                GuidePage(ToolsResources.s(R.string.z4s4), R.drawable.z4s4),
                GuidePage(ToolsResources.s(R.string.z4s5), R.drawable.z4s5),
                GuidePage(ToolsResources.s(R.string.z4s6), R.drawable.z4s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.z9s00), R.drawable.z9s00,
                GuidePage(ToolsResources.s(R.string.z9s0), R.drawable.z9s0),
                GuidePage(ToolsResources.s(R.string.z9s1), R.drawable.z9s1),
                GuidePage(ToolsResources.s(R.string.z9s2), R.drawable.z9s2),
                GuidePage(ToolsResources.s(R.string.z9s3), R.drawable.z9s3),
                GuidePage(ToolsResources.s(R.string.z9s4), R.drawable.z9s4),
                GuidePage(ToolsResources.s(R.string.z9s5), R.drawable.z9s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.z8s00), R.drawable.z8s00,
                GuidePage(ToolsResources.s(R.string.z8s0), R.drawable.z8s0),
                GuidePage(ToolsResources.s(R.string.z8s1), R.drawable.z8s1),
                GuidePage(ToolsResources.s(R.string.z8s2), R.drawable.z8s2),
                GuidePage(ToolsResources.s(R.string.z8s3), R.drawable.z8s3),
                GuidePage(ToolsResources.s(R.string.z8s4), R.drawable.z8s4),
                GuidePage(ToolsResources.s(R.string.z8s5), R.drawable.z8s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.i41s0), R.drawable.i41s0,
                GuidePage(ToolsResources.s(R.string.i41s1), R.drawable.i41s1),
                GuidePage(ToolsResources.s(R.string.i41s2), R.drawable.i41s2),
                GuidePage(ToolsResources.s(R.string.i41s3), R.drawable.i41s3),
                GuidePage(ToolsResources.s(R.string.i41s4), R.drawable.i41s4),
                GuidePage(ToolsResources.s(R.string.i41s5), R.drawable.i41s5),
                GuidePage(ToolsResources.s(R.string.i41s6), R.drawable.i41s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.i44s0), R.drawable.i44s0,
                GuidePage(ToolsResources.s(R.string.i44s1), R.drawable.i44s1),
                GuidePage(ToolsResources.s(R.string.i44s2), R.drawable.i44s2),
                GuidePage(ToolsResources.s(R.string.i44s3), R.drawable.i44s3),
                GuidePage(ToolsResources.s(R.string.i44s4), R.drawable.i44s4),
                GuidePage(ToolsResources.s(R.string.i44s5), R.drawable.i44s5),
                GuidePage(ToolsResources.s(R.string.i44s6), R.drawable.i44s6),
                GuidePage(ToolsResources.s(R.string.i44s7), R.drawable.i44s7),
                GuidePage(ToolsResources.s(R.string.i44s8), R.drawable.i44s8),
                GuidePage(ToolsResources.s(R.string.i44s9), R.drawable.i44s9),
                GuidePage(ToolsResources.s(R.string.i44s10), R.drawable.i44s10),
                GuidePage(ToolsResources.s(R.string.i44s11), R.drawable.i44s11),
                GuidePage(ToolsResources.s(R.string.i44s12), R.drawable.i44s12),
                GuidePage(ToolsResources.s(R.string.i44s13), R.drawable.i44s13),
                GuidePage(ToolsResources.s(R.string.i44s14), R.drawable.i44s14),
                GuidePage(ToolsResources.s(R.string.i44s15), R.drawable.i44s15)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun mechanisms(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_meh), R.drawable.z14s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z12s00), R.drawable.z12s00,
                GuidePage(ToolsResources.s(R.string.z12s0), R.drawable.z12s0),
                GuidePage(ToolsResources.s(R.string.z12s1), R.drawable.z12s1),
                GuidePage(ToolsResources.s(R.string.z12s2), R.drawable.z12s2),
                GuidePage(ToolsResources.s(R.string.z12s3), R.drawable.z12s3),
                GuidePage(ToolsResources.s(R.string.z12s4), R.drawable.z12s4),
                GuidePage(ToolsResources.s(R.string.z12s5), R.drawable.z12s5),
                GuidePage(ToolsResources.s(R.string.z12s6), R.drawable.z12s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.z13s00), R.drawable.z13s00,
                GuidePage(ToolsResources.s(R.string.z13s0), R.drawable.z13s0),
                GuidePage(ToolsResources.s(R.string.z13s1), R.drawable.z13s1),
                GuidePage(ToolsResources.s(R.string.z13s2), R.drawable.z13s2),
                GuidePage(ToolsResources.s(R.string.z13s3), R.drawable.z13s3),
                GuidePage(ToolsResources.s(R.string.z13s4), R.drawable.z13s4),
                GuidePage(ToolsResources.s(R.string.z13s5), R.drawable.z13s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.z14s00), R.drawable.z14s00,
                GuidePage(ToolsResources.s(R.string.z14s0), R.drawable.z14s0),
                GuidePage(ToolsResources.s(R.string.z14s1), R.drawable.z14s1),
                GuidePage(ToolsResources.s(R.string.z14s2), R.drawable.z14s2),
                GuidePage(ToolsResources.s(R.string.z14s3), R.drawable.z14s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z15s00), R.drawable.z15s00,
                GuidePage(ToolsResources.s(R.string.z15s0), R.drawable.z15s0),
                GuidePage(ToolsResources.s(R.string.z15s1), R.drawable.z15s1),
                GuidePage(ToolsResources.s(R.string.z15s2), R.drawable.z15s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.z17s00), R.drawable.z17s00,
                GuidePage(ToolsResources.s(R.string.z17s0), R.drawable.z17s0),
                GuidePage(ToolsResources.s(R.string.z17s1), R.drawable.z17s1),
                GuidePage(ToolsResources.s(R.string.z17s2), R.drawable.z17s2),
                GuidePage(ToolsResources.s(R.string.z17s3), R.drawable.z17s3),
                GuidePage(ToolsResources.s(R.string.z17s4), R.drawable.z17s4),
                GuidePage(ToolsResources.s(R.string.z17s5), R.drawable.z17s5),
                GuidePage(ToolsResources.s(R.string.z17s6), R.drawable.z17s6),
                GuidePage(ToolsResources.s(R.string.z17s7), R.drawable.z17s7),
                GuidePage(ToolsResources.s(R.string.z17s8), R.drawable.z17s8),
                GuidePage(ToolsResources.s(R.string.z17s9), R.drawable.z17s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.z18s00), R.drawable.z18s00,
                GuidePage(ToolsResources.s(R.string.z18s0), R.drawable.z18s0),
                GuidePage(ToolsResources.s(R.string.z18s1), R.drawable.z18s1),
                GuidePage(ToolsResources.s(R.string.z18s2), R.drawable.z18s2),
                GuidePage(ToolsResources.s(R.string.z18s3), R.drawable.z18s3),
                GuidePage(ToolsResources.s(R.string.z18s4), R.drawable.z18s4),
                GuidePage(ToolsResources.s(R.string.z18s5), R.drawable.z18s5),
                GuidePage(ToolsResources.s(R.string.z18s6), R.drawable.z18s6),
                GuidePage(ToolsResources.s(R.string.z18s7), R.drawable.z18s7)))

        subCategories.add(Guide(ToolsResources.s(R.string.i14s0), R.drawable.i14s0,
                GuidePage(ToolsResources.s(R.string.i14s1), R.drawable.i14s1),
                GuidePage(ToolsResources.s(R.string.i14s2), R.drawable.i14s2),
                GuidePage(ToolsResources.s(R.string.i14s3), R.drawable.i14s3),
                GuidePage(ToolsResources.s(R.string.i14s4), R.drawable.i14s4),
                GuidePage(ToolsResources.s(R.string.i14s5), R.drawable.i14s5),
                GuidePage(ToolsResources.s(R.string.i14s6), R.drawable.i14s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.i29s0), R.drawable.i29s0,
                GuidePage(ToolsResources.s(R.string.i29s1), R.drawable.i29s1),
                GuidePage(ToolsResources.s(R.string.i29s2), R.drawable.i29s2),
                GuidePage(ToolsResources.s(R.string.i29s3), R.drawable.i29s3),
                GuidePage(ToolsResources.s(R.string.i29s4), R.drawable.i29s4),
                GuidePage(ToolsResources.s(R.string.i29s5), R.drawable.i29s5),
                GuidePage(ToolsResources.s(R.string.i29s6), R.drawable.i29s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.i16s0), R.drawable.i16s0,
                GuidePage(ToolsResources.s(R.string.i16s1), R.drawable.i16s1),
                GuidePage(ToolsResources.s(R.string.i16s2), R.drawable.i16s2),
                GuidePage(ToolsResources.s(R.string.i16s3), R.drawable.i16s3),
                GuidePage(ToolsResources.s(R.string.i16s4), R.drawable.i16s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.z35s00), R.drawable.z35s00,
                GuidePage(ToolsResources.s(R.string.z35s0), R.drawable.z35s0),
                GuidePage(ToolsResources.s(R.string.z35s1), R.drawable.z35s1),
                GuidePage(ToolsResources.s(R.string.z35s2), R.drawable.z35s2),
                GuidePage(ToolsResources.s(R.string.z35s3), R.drawable.z35s3),
                GuidePage(ToolsResources.s(R.string.z35s4), R.drawable.z35s4),
                GuidePage(ToolsResources.s(R.string.z35s5), R.drawable.z35s5),
                GuidePage(ToolsResources.s(R.string.z35s6), R.drawable.z35s6),
                GuidePage(ToolsResources.s(R.string.z35s7), R.drawable.z35s7),
                GuidePage(ToolsResources.s(R.string.z35s8), R.drawable.z35s8)))

        subCategories.add(Guide(ToolsResources.s(R.string.z36s00), R.drawable.z36s00,
                GuidePage(ToolsResources.s(R.string.z36s0), R.drawable.z36s0),
                GuidePage(ToolsResources.s(R.string.z36s1), R.drawable.z36s1),
                GuidePage(ToolsResources.s(R.string.z36s2), R.drawable.z36s2),
                GuidePage(ToolsResources.s(R.string.z36s3), R.drawable.z36s3),
                GuidePage(ToolsResources.s(R.string.z36s4), R.drawable.z36s4),
                GuidePage(ToolsResources.s(R.string.z36s5), R.drawable.z36s5),
                GuidePage(ToolsResources.s(R.string.z36s6), R.drawable.z36s6),
                GuidePage(ToolsResources.s(R.string.z36s7), R.drawable.z36s7),
                GuidePage(ToolsResources.s(R.string.z36s8), R.drawable.z36s8)))

        subCategories.add(Guide(ToolsResources.s(R.string.z39s00), R.drawable.z39s00,
                GuidePage(ToolsResources.s(R.string.z39s0), R.drawable.z39s0),
                GuidePage(ToolsResources.s(R.string.z39s1), R.drawable.z39s1),
                GuidePage(ToolsResources.s(R.string.z39s2), R.drawable.z39s2)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun traps(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_trap), R.drawable.z21s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z19s00), R.drawable.z19s00,
                GuidePage(ToolsResources.s(R.string.z19s0), R.drawable.z19s0),
                GuidePage(ToolsResources.s(R.string.z19s1), R.drawable.z19s1),
                GuidePage(ToolsResources.s(R.string.z19s2), R.drawable.z19s2),
                GuidePage(ToolsResources.s(R.string.z19s3), R.drawable.z19s3),
                GuidePage(ToolsResources.s(R.string.z19s4), R.drawable.z19s4),
                GuidePage(ToolsResources.s(R.string.z19s5), R.drawable.z19s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.z20s00), R.drawable.z20s00,
                GuidePage(ToolsResources.s(R.string.z20s0), R.drawable.z20s0),
                GuidePage(ToolsResources.s(R.string.z20s1), R.drawable.z20s1),
                GuidePage(ToolsResources.s(R.string.z20s2), R.drawable.z20s2)))

        subCategories.add(Guide(ToolsResources.s(R.string.z21s00), R.drawable.z21s00,
                GuidePage(ToolsResources.s(R.string.z21s0), R.drawable.z21s0),
                GuidePage(ToolsResources.s(R.string.z21s1), R.drawable.z21s1),
                GuidePage(ToolsResources.s(R.string.z21s2), R.drawable.z21s2),
                GuidePage(ToolsResources.s(R.string.z21s3), R.drawable.z21s3),
                GuidePage(ToolsResources.s(R.string.z21s4), R.drawable.z21s4),
                GuidePage(ToolsResources.s(R.string.z21s5), R.drawable.z21s5)))

        subCategories.add(Guide(ToolsResources.s(R.string.z22s00), R.drawable.z22s00,
                GuidePage(ToolsResources.s(R.string.z22s0), R.drawable.z22s0),
                GuidePage(ToolsResources.s(R.string.z22s1), R.drawable.z22s1),
                GuidePage(ToolsResources.s(R.string.z22s2), R.drawable.z22s2),
                GuidePage(ToolsResources.s(R.string.z22s3), R.drawable.z22s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.i15s0), R.drawable.i15s0,
                GuidePage(ToolsResources.s(R.string.i15s1), R.drawable.i15s1),
                GuidePage(ToolsResources.s(R.string.i15s2), R.drawable.i15s2),
                GuidePage(ToolsResources.s(R.string.i15s3), R.drawable.i15s3),
                GuidePage(ToolsResources.s(R.string.i15s4), R.drawable.i15s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i22s0), R.drawable.i22s0,
                GuidePage(ToolsResources.s(R.string.i22s1), R.drawable.i22s1),
                GuidePage(ToolsResources.s(R.string.i22s2), R.drawable.i22s2),
                GuidePage(ToolsResources.s(R.string.i22s3), R.drawable.i22s3),
                GuidePage(ToolsResources.s(R.string.i22s4), R.drawable.i22s4),
                GuidePage(ToolsResources.s(R.string.i22s5), R.drawable.i22s5),
                GuidePage(ToolsResources.s(R.string.i22s6), R.drawable.i22s6),
                GuidePage(ToolsResources.s(R.string.i22s7), R.drawable.i22s7),
                GuidePage(ToolsResources.s(R.string.i22s8), R.drawable.i22s8)))

        subCategories.add(Guide(ToolsResources.s(R.string.z23s00), R.drawable.z23s00,
                GuidePage(ToolsResources.s(R.string.z23s0), R.drawable.z23s0),
                GuidePage(ToolsResources.s(R.string.z23s1), R.drawable.z23s1),
                GuidePage(ToolsResources.s(R.string.z23s2), R.drawable.z23s2),
                GuidePage(ToolsResources.s(R.string.z23s3), R.drawable.z23s3),
                GuidePage(ToolsResources.s(R.string.z23s4), R.drawable.z23s4),
                GuidePage(ToolsResources.s(R.string.z23s5), R.drawable.z23s5),
                GuidePage(ToolsResources.s(R.string.z23s6), R.drawable.z23s6),
                GuidePage(ToolsResources.s(R.string.z23s7), R.drawable.z23s7),
                GuidePage(ToolsResources.s(R.string.z23s8), R.drawable.z23s8),
                GuidePage(ToolsResources.s(R.string.z23s9), R.drawable.z23s9),
                GuidePage(ToolsResources.s(R.string.z23s10), R.drawable.z23s10),
                GuidePage(ToolsResources.s(R.string.z23s11), R.drawable.z23s11),
                GuidePage(ToolsResources.s(R.string.z23s12), R.drawable.z23s12),
                GuidePage(ToolsResources.s(R.string.z23s13), R.drawable.z23s13),
                GuidePage(ToolsResources.s(R.string.z23s14), R.drawable.z23s14),
                GuidePage(ToolsResources.s(R.string.z23s15), R.drawable.z23s15),
                GuidePage(ToolsResources.s(R.string.z23s16), R.drawable.z23s16),
                GuidePage(ToolsResources.s(R.string.z23s17), R.drawable.z23s17),
                GuidePage(ToolsResources.s(R.string.z23s18), R.drawable.z23s18),
                GuidePage(ToolsResources.s(R.string.z23s19), R.drawable.z23s19),
                GuidePage(ToolsResources.s(R.string.z23s20), R.drawable.z23s20),
                GuidePage(ToolsResources.s(R.string.z23s21), R.drawable.z23s21)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun buildings(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_links), R.drawable.i20s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i20s0), R.drawable.i20s0,
                GuidePage(ToolsResources.s(R.string.i20s1), R.drawable.i20s1),
                GuidePage(ToolsResources.s(R.string.i20s2), R.drawable.i20s2),
                GuidePage(ToolsResources.s(R.string.i20s3), R.drawable.i20s3),
                GuidePage(ToolsResources.s(R.string.i20s4), R.drawable.i20s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i21s0), R.drawable.i21s0,
                GuidePage(ToolsResources.s(R.string.i21s1), R.drawable.i21s1),
                GuidePage(ToolsResources.s(R.string.i21s2), R.drawable.i21s2),
                GuidePage(ToolsResources.s(R.string.i21s3), R.drawable.i21s3),
                GuidePage(ToolsResources.s(R.string.i21s4), R.drawable.i21s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i27s0), R.drawable.i27s0,
                GuidePage(ToolsResources.s(R.string.i27s1), R.drawable.i27s1),
                GuidePage(ToolsResources.s(R.string.i27s2), R.drawable.i27s2),
                GuidePage(ToolsResources.s(R.string.i27s3), R.drawable.i27s3),
                GuidePage(ToolsResources.s(R.string.i27s4), R.drawable.i27s4)))

        categories[Guide] = subCategories
        return Guide
    }

    private fun wring(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_building), R.drawable.i17s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i17s0), R.drawable.i17s0,
                GuidePage(ToolsResources.s(R.string.i17s1), R.drawable.i17s1),
                GuidePage(ToolsResources.s(R.string.i17s2), R.drawable.i17s2),
                GuidePage(ToolsResources.s(R.string.i17s3), R.drawable.i17s3),
                GuidePage(ToolsResources.s(R.string.i17s4), R.drawable.i17s4),
                GuidePage(ToolsResources.s(R.string.i17s5), R.drawable.i17s5),
                GuidePage(ToolsResources.s(R.string.i17s6), R.drawable.i17s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.z33s00), R.drawable.z33s00,
                GuidePage(ToolsResources.s(R.string.z33s0), R.drawable.z33s0),
                GuidePage(ToolsResources.s(R.string.z33s1), R.drawable.z33s1),
                GuidePage(ToolsResources.s(R.string.z33s2), R.drawable.z33s2),
                GuidePage(ToolsResources.s(R.string.z33s3), R.drawable.z33s3),
                GuidePage(ToolsResources.s(R.string.z33s4), R.drawable.z33s4),
                GuidePage(ToolsResources.s(R.string.z33s5), R.drawable.z33s5),
                GuidePage(ToolsResources.s(R.string.z33s6), R.drawable.z33s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.z34s00), R.drawable.z34s00,
                GuidePage(ToolsResources.s(R.string.z34s0), R.drawable.z34s0),
                GuidePage(ToolsResources.s(R.string.z34s1), R.drawable.z34s1),
                GuidePage(ToolsResources.s(R.string.z34s2), R.drawable.z34s2),
                GuidePage(ToolsResources.s(R.string.z34s3), R.drawable.z34s3)))

        subCategories.add(Guide(ToolsResources.s(R.string.z37s00), R.drawable.z37s00,
                GuidePage(ToolsResources.s(R.string.z37s0), R.drawable.z37s0),
                GuidePage(ToolsResources.s(R.string.z37s1), R.drawable.z37s1),
                GuidePage(ToolsResources.s(R.string.z37s2), R.drawable.z37s2),
                GuidePage(ToolsResources.s(R.string.z37s3), R.drawable.z37s3),
                GuidePage(ToolsResources.s(R.string.z37s4), R.drawable.z37s4),
                GuidePage(ToolsResources.s(R.string.z37s5), R.drawable.z37s5),
                GuidePage(ToolsResources.s(R.string.z37s6), R.drawable.z37s6),
                GuidePage(ToolsResources.s(R.string.z37s7), R.drawable.z37s7),
                GuidePage(ToolsResources.s(R.string.z37s8), R.drawable.z37s8)))

        subCategories.add(Guide(ToolsResources.s(R.string.z38s00), R.drawable.z38s00,
                GuidePage(ToolsResources.s(R.string.z38s0), R.drawable.z38s0),
                GuidePage(ToolsResources.s(R.string.z38s1), R.drawable.z38s1),
                GuidePage(ToolsResources.s(R.string.z38s2), R.drawable.z38s2),
                GuidePage(ToolsResources.s(R.string.z38s3), R.drawable.z38s3),
                GuidePage(ToolsResources.s(R.string.z38s4), R.drawable.z38s4),
                GuidePage(ToolsResources.s(R.string.z38s5), R.drawable.z38s5),
                GuidePage(ToolsResources.s(R.string.z38s6), R.drawable.z38s6),
                GuidePage(ToolsResources.s(R.string.z38s7), R.drawable.z38s7),
                GuidePage(ToolsResources.s(R.string.z38s8), R.drawable.z38s8),
                GuidePage(ToolsResources.s(R.string.z38s9), R.drawable.z38s9),
                GuidePage(ToolsResources.s(R.string.z38s10), R.drawable.z38s10)))

        subCategories.add(Guide(ToolsResources.s(R.string.i40s0), R.drawable.i40s0,
                GuidePage(ToolsResources.s(R.string.i40s1), R.drawable.i40s1),
                GuidePage(ToolsResources.s(R.string.i40s2), R.drawable.i40s2),
                GuidePage(ToolsResources.s(R.string.i40s3), R.drawable.i40s3),
                GuidePage(ToolsResources.s(R.string.i40s4), R.drawable.i40s4),
                GuidePage(ToolsResources.s(R.string.i40s5), R.drawable.i40s5),
                GuidePage(ToolsResources.s(R.string.i40s6), R.drawable.i40s6),
                GuidePage(ToolsResources.s(R.string.i40s7), R.drawable.i40s7),
                GuidePage(ToolsResources.s(R.string.i40s8), R.drawable.i40s8),
                GuidePage(ToolsResources.s(R.string.i40s9), R.drawable.i40s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.i43s0), R.drawable.i43s0,
                GuidePage(ToolsResources.s(R.string.i43s1), R.drawable.i43s1),
                GuidePage(ToolsResources.s(R.string.i43s2), R.drawable.i43s2),
                GuidePage(ToolsResources.s(R.string.i43s3), R.drawable.i43s3),
                GuidePage(ToolsResources.s(R.string.i43s4), R.drawable.i43s4),
                GuidePage(ToolsResources.s(R.string.i43s5), R.drawable.i43s5),
                GuidePage(ToolsResources.s(R.string.i43s6), R.drawable.i43s6),
                GuidePage(ToolsResources.s(R.string.i43s7), R.drawable.i43s7),
                GuidePage(ToolsResources.s(R.string.i43s8), R.drawable.i43s8)))

        categories[Guide] = subCategories
        return Guide
    }

}
