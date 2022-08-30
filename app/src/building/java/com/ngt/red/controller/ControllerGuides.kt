package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.ngt.red.models.GuidePage
import com.ngt.red.screens.guide_create.SCreateGuideTitle
import com.sup.dev.android.libs.screens.navigator.NavigationAction
import com.sup.dev.android.libs.screens.navigator.Navigator
import com.sup.dev.android.tools.ToolsResources
import com.sup.dev.java.classes.items.Item2
import java.util.*

object ControllerGuides {

    val rootFandomId = 1925L
    val fandomsIds = arrayOf(1925L)
    val appodialAppId = "d68bb1868a00458a62327b274bdcefba7a9eb4cb47329fe6"

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
            categories.add(woodCity())
            categories.add(stoneCity())
            categories.add(stoneHarbor())
            categories.add(woodenHarbor())
            categories.add(stoneDungeon())
            categories.add(woodenDungeon())
            categories.add(farm())
            categories.add(houses())
            categories.add(furniture())
            return categories
        }

    fun getGuides(parentCategory: Guide): ArrayList<Guide> {
        return categories[parentCategory]!!
    }

    private fun woodCity(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_wood_city), R.drawable.z3s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z0s00), R.drawable.z0s00,
                GuidePage(ToolsResources.s(R.string.z0s0), R.drawable.z0s0),
                GuidePage(R.drawable.z0s1),
                GuidePage(R.drawable.z0s2),
                GuidePage(R.drawable.z0s3),
                GuidePage(R.drawable.z0s4),
                GuidePage(R.drawable.z0s5),
                GuidePage(R.drawable.z0s6),
                GuidePage(R.drawable.z0s7),
                GuidePage(R.drawable.z0s8),
                GuidePage(R.drawable.z0s9),
                GuidePage(R.drawable.z0s10),
                GuidePage(R.drawable.z0s11),
                GuidePage(R.drawable.z0s12),
                GuidePage(R.drawable.z0s13),
                GuidePage(R.drawable.z0s14),
                GuidePage(R.drawable.z0s15),
                GuidePage(R.drawable.z0s16),
                GuidePage(R.drawable.z0s17)))

        subCategories.add(Guide(ToolsResources.s(R.string.z1s00), R.drawable.z1s00,
                GuidePage(ToolsResources.s(R.string.z0s0), R.drawable.z1s0),
                GuidePage(R.drawable.z1s1),
                GuidePage(R.drawable.z1s2),
                GuidePage(R.drawable.z1s3),
                GuidePage(R.drawable.z1s4),
                GuidePage(R.drawable.z1s5),
                GuidePage(R.drawable.z1s6),
                GuidePage(R.drawable.z1s7),
                GuidePage(R.drawable.z1s8),
                GuidePage(R.drawable.z1s9),
                GuidePage(R.drawable.z1s10),
                GuidePage(R.drawable.z1s11),
                GuidePage(R.drawable.z1s12),
                GuidePage(R.drawable.z1s13),
                GuidePage(R.drawable.z1s14),
                GuidePage(R.drawable.z1s15),
                GuidePage(R.drawable.z1s16),
                GuidePage(R.drawable.z1s17),
                GuidePage(R.drawable.z1s18),
                GuidePage(R.drawable.z1s19),
                GuidePage(R.drawable.z1s20),
                GuidePage(R.drawable.z1s21),
                GuidePage(R.drawable.z1s22)))

        subCategories.add(Guide(ToolsResources.s(R.string.z2s00), R.drawable.z2s00,
                GuidePage(ToolsResources.s(R.string.z2s0), R.drawable.z2s0),
                GuidePage(R.drawable.z2s1),
                GuidePage(R.drawable.z2s2),
                GuidePage(R.drawable.z2s3),
                GuidePage(R.drawable.z2s4),
                GuidePage(R.drawable.z2s5),
                GuidePage(R.drawable.z2s6),
                GuidePage(R.drawable.z2s7),
                GuidePage(R.drawable.z2s8),
                GuidePage(R.drawable.z2s9)))


        subCategories.add(Guide(ToolsResources.s(R.string.z3s00), R.drawable.z3s00,
                GuidePage(ToolsResources.s(R.string.z3s0), R.drawable.z3s0),
                GuidePage(R.drawable.z3s1),
                GuidePage(R.drawable.z3s2),
                GuidePage(R.drawable.z3s3),
                GuidePage(R.drawable.z3s4),
                GuidePage(R.drawable.z3s5),
                GuidePage(R.drawable.z3s6),
                GuidePage(R.drawable.z3s7),
                GuidePage(R.drawable.z3s8),
                GuidePage(R.drawable.z3s9),
                GuidePage(R.drawable.z3s10),
                GuidePage(R.drawable.z3s11),
                GuidePage(R.drawable.z3s12),
                GuidePage(R.drawable.z3s13),
                GuidePage(R.drawable.z3s14),
                GuidePage(R.drawable.z3s15),
                GuidePage(R.drawable.z3s16),
                GuidePage(R.drawable.z3s17),
                GuidePage(R.drawable.z3s18),
                GuidePage(R.drawable.z3s19),
                GuidePage(R.drawable.z3s20)))

        subCategories.add(Guide(ToolsResources.s(R.string.z4s00), R.drawable.z4s00,
                GuidePage(ToolsResources.s(R.string.z4s0), R.drawable.z4s0),
                GuidePage(R.drawable.z4s1),
                GuidePage(R.drawable.z4s2),
                GuidePage(R.drawable.z4s3),
                GuidePage(R.drawable.z4s4),
                GuidePage(R.drawable.z4s5),
                GuidePage(R.drawable.z4s6),
                GuidePage(R.drawable.z4s7),
                GuidePage(R.drawable.z4s8),
                GuidePage(R.drawable.z4s9)))

        categories[category] = subCategories
        return category
    }

    private fun stoneCity(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_stone_city), R.drawable.i4s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i1s00), R.drawable.i1s00,
                GuidePage(ToolsResources.s(R.string.i1s0), R.drawable.i1s0),
                GuidePage(R.drawable.i1s1),
                GuidePage(R.drawable.i1s2),
                GuidePage(R.drawable.i1s3),
                GuidePage(R.drawable.i1s4),
                GuidePage(R.drawable.i1s5),
                GuidePage(R.drawable.i1s6),
                GuidePage(R.drawable.i1s7),
                GuidePage(R.drawable.i1s8),
                GuidePage(R.drawable.i1s9),
                GuidePage(R.drawable.i1s10)))

        subCategories.add(Guide(ToolsResources.s(R.string.i2s00), R.drawable.i2s00,
                GuidePage(ToolsResources.s(R.string.i2s0), R.drawable.i2s0),
                GuidePage(R.drawable.i2s1),
                GuidePage(R.drawable.i2s2),
                GuidePage(R.drawable.i2s3),
                GuidePage(R.drawable.i2s4),
                GuidePage(R.drawable.i2s5),
                GuidePage(R.drawable.i2s6),
                GuidePage(R.drawable.i2s7),
                GuidePage(R.drawable.i2s8),
                GuidePage(R.drawable.i2s9),
                GuidePage(R.drawable.i2s10),
                GuidePage(R.drawable.i2s11),
                GuidePage(R.drawable.i2s12),
                GuidePage(R.drawable.i2s13),
                GuidePage(R.drawable.i2s14),
                GuidePage(R.drawable.i2s15),
                GuidePage(R.drawable.i2s16),
                GuidePage(R.drawable.i2s17),
                GuidePage(R.drawable.i2s18),
                GuidePage(R.drawable.i2s19),
                GuidePage(R.drawable.i2s20),
                GuidePage(R.drawable.i2s21),
                GuidePage(R.drawable.i2s22),
                GuidePage(R.drawable.i2s23),
                GuidePage(R.drawable.i2s24),
                GuidePage(R.drawable.i2s25),
                GuidePage(R.drawable.i2s26),
                GuidePage(R.drawable.i2s27),
                GuidePage(R.drawable.i2s28),
                GuidePage(R.drawable.i2s29),
                GuidePage(R.drawable.i2s30)))

        subCategories.add(Guide(ToolsResources.s(R.string.i3s00), R.drawable.i3s00,
                GuidePage(ToolsResources.s(R.string.i3s0), R.drawable.i3s0),
                GuidePage(R.drawable.i3s1),
                GuidePage(R.drawable.i3s2),
                GuidePage(R.drawable.i3s3),
                GuidePage(R.drawable.i3s4),
                GuidePage(R.drawable.i3s5),
                GuidePage(R.drawable.i3s6),
                GuidePage(R.drawable.i3s7),
                GuidePage(R.drawable.i3s8),
                GuidePage(R.drawable.i3s9),
                GuidePage(R.drawable.i3s10),
                GuidePage(R.drawable.i3s11),
                GuidePage(R.drawable.i3s12),
                GuidePage(R.drawable.i3s13),
                GuidePage(R.drawable.i3s14),
                GuidePage(R.drawable.i3s15),
                GuidePage(R.drawable.i3s16)))

        subCategories.add(Guide(ToolsResources.s(R.string.i4s0), R.drawable.i4s0,
                GuidePage(ToolsResources.s(R.string.i4s1), R.drawable.i4s1),
                GuidePage(R.drawable.i4s2),
                GuidePage(ToolsResources.s(R.string.i4s3), R.drawable.i4s3),
                GuidePage(R.drawable.i4s4),
                GuidePage(R.drawable.i4s5),
                GuidePage(R.drawable.i4s6),
                GuidePage(R.drawable.i4s7),
                GuidePage(R.drawable.i4s8),
                GuidePage(R.drawable.i4s9),
                GuidePage(ToolsResources.s(R.string.i4s10), R.drawable.i4s10),
                GuidePage(R.drawable.i4s11),
                GuidePage(R.drawable.i4s12),
                GuidePage(R.drawable.i4s13),
                GuidePage(R.drawable.i4s14),
                GuidePage(ToolsResources.s(R.string.i4s15), R.drawable.i4s15),
                GuidePage(R.drawable.i4s16),
                GuidePage(R.drawable.i4s17),
                GuidePage(R.drawable.i4s18),
                GuidePage(R.drawable.i4s19),
                GuidePage(R.drawable.i4s20),
                GuidePage(R.drawable.i4s21),
                GuidePage(ToolsResources.s(R.string.i4s22), R.drawable.i4s22),
                GuidePage(ToolsResources.s(R.string.i4s23), R.drawable.i4s23),
                GuidePage(ToolsResources.s(R.string.i4s24), R.drawable.i4s24),
                GuidePage(R.drawable.i4s25),
                GuidePage(R.drawable.i4s26),
                GuidePage(R.drawable.i4s27),
                GuidePage(R.drawable.i4s28),
                GuidePage(R.drawable.i4s29)))

        subCategories.add(Guide(ToolsResources.s(R.string.i5s00), R.drawable.i5s00,
                GuidePage(ToolsResources.s(R.string.i5s0), R.drawable.i5s0),
                GuidePage(R.drawable.i5s1),
                GuidePage(R.drawable.i5s2),
                GuidePage(R.drawable.i5s3),
                GuidePage(R.drawable.i5s4),
                GuidePage(R.drawable.i5s5),
                GuidePage(R.drawable.i5s6),
                GuidePage(R.drawable.i5s7),
                GuidePage(R.drawable.i5s8),
                GuidePage(R.drawable.i5s9),
                GuidePage(R.drawable.i5s10),
                GuidePage(R.drawable.i5s11)))

        categories[category] = subCategories
        return category
    }

    private fun stoneHarbor(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_stone_harbor), R.drawable.z14s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z10s00), R.drawable.z10s00,
                GuidePage(ToolsResources.s(R.string.z10s0), R.drawable.z10s0),
                GuidePage(R.drawable.z10s1),
                GuidePage(R.drawable.z10s2),
                GuidePage(R.drawable.z10s3),
                GuidePage(R.drawable.z10s4),
                GuidePage(R.drawable.z10s5),
                GuidePage(R.drawable.z10s6),
                GuidePage(R.drawable.z10s7),
                GuidePage(R.drawable.z10s8),
                GuidePage(R.drawable.z10s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.z11s00), R.drawable.z11s00,
                GuidePage(ToolsResources.s(R.string.z11s0), R.drawable.z11s0),
                GuidePage(R.drawable.z11s1),
                GuidePage(R.drawable.z11s2),
                GuidePage(R.drawable.z11s3),
                GuidePage(R.drawable.z11s4),
                GuidePage(R.drawable.z11s5),
                GuidePage(R.drawable.z11s6),
                GuidePage(R.drawable.z11s7),
                GuidePage(R.drawable.z11s8),
                GuidePage(R.drawable.z11s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.z12s00), R.drawable.z12s00,
                GuidePage(ToolsResources.s(R.string.z12s0), R.drawable.z12s0),
                GuidePage(R.drawable.z12s1),
                GuidePage(R.drawable.z12s2),
                GuidePage(R.drawable.z12s3),
                GuidePage(R.drawable.z12s4),
                GuidePage(R.drawable.z12s5),
                GuidePage(R.drawable.z12s6),
                GuidePage(R.drawable.z12s7),
                GuidePage(R.drawable.z12s8),
                GuidePage(R.drawable.z12s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.z13s00), R.drawable.z13s00,
                GuidePage(ToolsResources.s(R.string.z13s0), R.drawable.z13s0),
                GuidePage(R.drawable.z13s1),
                GuidePage(R.drawable.z13s2),
                GuidePage(R.drawable.z13s3),
                GuidePage(R.drawable.z13s4),
                GuidePage(R.drawable.z13s5),
                GuidePage(R.drawable.z13s6),
                GuidePage(R.drawable.z13s7),
                GuidePage(R.drawable.z13s8),
                GuidePage(R.drawable.z13s9),
                GuidePage(R.drawable.z13s10),
                GuidePage(R.drawable.z13s11),
                GuidePage(R.drawable.z13s12),
                GuidePage(R.drawable.z13s13),
                GuidePage(R.drawable.z13s14),
                GuidePage(R.drawable.z13s15)))

        subCategories.add(Guide(ToolsResources.s(R.string.z14s00), R.drawable.z14s00,
                GuidePage(ToolsResources.s(R.string.z14s0), R.drawable.z14s0),
                GuidePage(R.drawable.z14s1),
                GuidePage(R.drawable.z14s2),
                GuidePage(R.drawable.z14s3),
                GuidePage(R.drawable.z14s4),
                GuidePage(R.drawable.z14s5),
                GuidePage(R.drawable.z14s6),
                GuidePage(R.drawable.z14s7),
                GuidePage(R.drawable.z14s8),
                GuidePage(R.drawable.z14s9),
                GuidePage(R.drawable.z14s10)))

        categories[category] = subCategories
        return category
    }

    private fun woodenHarbor(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_wooden_harbor), R.drawable.z9s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z5s00), R.drawable.z5s00,
                GuidePage(ToolsResources.s(R.string.z5s0), R.drawable.z5s0),
                GuidePage(R.drawable.z5s1),
                GuidePage(R.drawable.z5s2),
                GuidePage(R.drawable.z5s3),
                GuidePage(R.drawable.z5s4),
                GuidePage(R.drawable.z5s5),
                GuidePage(R.drawable.z5s6)))

        subCategories.add(Guide(ToolsResources.s(R.string.z6s00), R.drawable.z6s00,
                GuidePage(ToolsResources.s(R.string.z6s0), R.drawable.z6s0),
                GuidePage(R.drawable.z6s1),
                GuidePage(R.drawable.z6s2),
                GuidePage(R.drawable.z6s3),
                GuidePage(R.drawable.z6s4),
                GuidePage(R.drawable.z6s5),
                GuidePage(R.drawable.z6s6),
                GuidePage(R.drawable.z6s7),
                GuidePage(R.drawable.z6s8),
                GuidePage(R.drawable.z6s9),
                GuidePage(R.drawable.z6s10),
                GuidePage(R.drawable.z6s11),
                GuidePage(R.drawable.z6s12),
                GuidePage(R.drawable.z6s13),
                GuidePage(R.drawable.z6s14)))

        subCategories.add(Guide(ToolsResources.s(R.string.z7s00), R.drawable.z7s00,
                GuidePage(ToolsResources.s(R.string.z7s0), R.drawable.z7s0),
                GuidePage(R.drawable.z7s1),
                GuidePage(R.drawable.z7s2),
                GuidePage(R.drawable.z7s3),
                GuidePage(R.drawable.z7s4),
                GuidePage(R.drawable.z7s5),
                GuidePage(R.drawable.z7s6),
                GuidePage(R.drawable.z7s7),
                GuidePage(R.drawable.z7s8),
                GuidePage(R.drawable.z7s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.z8s00), R.drawable.z8s00,
                GuidePage(ToolsResources.s(R.string.z8s0), R.drawable.z8s0),
                GuidePage(R.drawable.z8s1),
                GuidePage(R.drawable.z8s2),
                GuidePage(R.drawable.z8s3),
                GuidePage(R.drawable.z8s4),
                GuidePage(R.drawable.z8s5),
                GuidePage(R.drawable.z8s6),
                GuidePage(R.drawable.z8s7),
                GuidePage(R.drawable.z8s8),
                GuidePage(R.drawable.z8s9),
                GuidePage(R.drawable.z8s10),
                GuidePage(R.drawable.z8s11),
                GuidePage(R.drawable.z8s12),
                GuidePage(R.drawable.z8s13),
                GuidePage(R.drawable.z8s14),
                GuidePage(R.drawable.z8s15)))


        subCategories.add(Guide(ToolsResources.s(R.string.z9s00), R.drawable.z9s00,
                GuidePage(ToolsResources.s(R.string.z9s0), R.drawable.z9s0),
                GuidePage(R.drawable.z9s1),
                GuidePage(R.drawable.z9s2),
                GuidePage(R.drawable.z9s3),
                GuidePage(R.drawable.z9s4),
                GuidePage(R.drawable.z9s5),
                GuidePage(R.drawable.z9s6),
                GuidePage(R.drawable.z9s7),
                GuidePage(R.drawable.z9s8),
                GuidePage(R.drawable.z9s9),
                GuidePage(R.drawable.z9s10)))

        categories[category] = subCategories
        return category
    }

    private fun stoneDungeon(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_stone_dungeon), R.drawable.z15s00)
        val subCategories = ArrayList<Guide>()


        subCategories.add(Guide(ToolsResources.s(R.string.z15s00), R.drawable.z15s00,
                GuidePage(ToolsResources.s(R.string.z15s0), R.drawable.z15s0),
                GuidePage(R.drawable.z15s1),
                GuidePage(R.drawable.z15s2),
                GuidePage(R.drawable.z15s3),
                GuidePage(R.drawable.z15s4),
                GuidePage(R.drawable.z15s5),
                GuidePage(R.drawable.z15s6),
                GuidePage(R.drawable.z15s7),
                GuidePage(R.drawable.z15s8),
                GuidePage(R.drawable.z15s9),
                GuidePage(R.drawable.z15s10),
                GuidePage(R.drawable.z15s11)))

        subCategories.add(Guide(ToolsResources.s(R.string.z17s00), R.drawable.z17s00,
                GuidePage(ToolsResources.s(R.string.z17s0), R.drawable.z17s0),
                GuidePage(R.drawable.z17s1),
                GuidePage(R.drawable.z17s2),
                GuidePage(R.drawable.z17s3),
                GuidePage(R.drawable.z17s4),
                GuidePage(R.drawable.z17s5),
                GuidePage(R.drawable.z17s6),
                GuidePage(R.drawable.z17s7),
                GuidePage(R.drawable.z17s8),
                GuidePage(R.drawable.z17s9),
                GuidePage(R.drawable.z17s10),
                GuidePage(R.drawable.z17s11)))

        subCategories.add(Guide(ToolsResources.s(R.string.z18s00), R.drawable.z18s00,
                GuidePage(ToolsResources.s(R.string.z18s0), R.drawable.z18s0),
                GuidePage(R.drawable.z18s1),
                GuidePage(R.drawable.z18s2),
                GuidePage(R.drawable.z18s3),
                GuidePage(R.drawable.z18s4),
                GuidePage(R.drawable.z18s5),
                GuidePage(R.drawable.z18s6),
                GuidePage(R.drawable.z18s7),
                GuidePage(R.drawable.z18s8),
                GuidePage(R.drawable.z18s9),
                GuidePage(R.drawable.z18s10)))

        categories[category] = subCategories
        return category
    }

    private fun woodenDungeon(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_wooden_dungeon), R.drawable.z19s00)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.z19s00), R.drawable.z19s00,
                GuidePage(ToolsResources.s(R.string.z19s0), R.drawable.z19s0),
                GuidePage(R.drawable.z19s1),
                GuidePage(R.drawable.z19s2),
                GuidePage(R.drawable.z19s3),
                GuidePage(R.drawable.z19s4),
                GuidePage(R.drawable.z19s5),
                GuidePage(R.drawable.z19s6),
                GuidePage(R.drawable.z19s7),
                GuidePage(R.drawable.z19s8)))

        subCategories.add(Guide(ToolsResources.s(R.string.z20s00), R.drawable.z20s00,
                GuidePage(ToolsResources.s(R.string.z20s0), R.drawable.z20s0),
                GuidePage(R.drawable.z20s1),
                GuidePage(R.drawable.z20s2),
                GuidePage(R.drawable.z20s3),
                GuidePage(R.drawable.z20s4),
                GuidePage(R.drawable.z20s5),
                GuidePage(R.drawable.z20s6),
                GuidePage(R.drawable.z20s7),
                GuidePage(R.drawable.z20s8),
                GuidePage(R.drawable.z20s9),
                GuidePage(R.drawable.z20s10)))

        subCategories.add(Guide(ToolsResources.s(R.string.z21s00), R.drawable.z21s00,
                GuidePage(ToolsResources.s(R.string.z21s0), R.drawable.z21s0),
                GuidePage(R.drawable.z21s1),
                GuidePage(R.drawable.z21s2),
                GuidePage(R.drawable.z21s3),
                GuidePage(R.drawable.z21s4),
                GuidePage(R.drawable.z21s5),
                GuidePage(R.drawable.z21s6),
                GuidePage(R.drawable.z21s7)))

        categories[category] = subCategories
        return category
    }

    private fun farm(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_farm), R.drawable.i11s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i6s0), R.drawable.i6s0,
                GuidePage(ToolsResources.s(R.string.i6s1), R.drawable.i6s1),
                GuidePage(R.drawable.i6s2),
                GuidePage(R.drawable.i6s3),
                GuidePage(R.drawable.i6s4),
                GuidePage(R.drawable.i6s5),
                GuidePage(R.drawable.i6s6),
                GuidePage(R.drawable.i6s7),
                GuidePage(R.drawable.i6s8),
                GuidePage(R.drawable.i6s9),
                GuidePage(R.drawable.i6s10),
                GuidePage(R.drawable.i6s11),
                GuidePage(R.drawable.i6s12),
                GuidePage(R.drawable.i6s13)))

        subCategories.add(Guide(ToolsResources.s(R.string.i11s0), R.drawable.i11s0,
                GuidePage(ToolsResources.s(R.string.i11s1), R.drawable.i11s1),
                GuidePage(R.drawable.i11s2),
                GuidePage(R.drawable.i11s3),
                GuidePage(R.drawable.i11s4),
                GuidePage(ToolsResources.s(R.string.i11s5), R.drawable.i11s5),
                GuidePage(R.drawable.i11s6),
                GuidePage(R.drawable.i11s7),
                GuidePage(R.drawable.i11s8),
                GuidePage(R.drawable.i11s9),
                GuidePage(R.drawable.i11s10),
                GuidePage(R.drawable.i11s11),
                GuidePage(R.drawable.i11s12)))

        subCategories.add(Guide(ToolsResources.s(R.string.i14s0), R.drawable.i14s0,
                GuidePage(ToolsResources.s(R.string.i14s1), R.drawable.i14s1),
                GuidePage(R.drawable.i14s2),
                GuidePage(R.drawable.i14s3),
                GuidePage(R.drawable.i14s4),
                GuidePage(R.drawable.i14s5),
                GuidePage(R.drawable.i14s6),
                GuidePage(R.drawable.i14s7),
                GuidePage(R.drawable.i14s8),
                GuidePage(R.drawable.i14s9),
                GuidePage(R.drawable.i14s10),
                GuidePage(R.drawable.i14s11),
                GuidePage(R.drawable.i14s12),
                GuidePage(R.drawable.i14s13),
                GuidePage(R.drawable.i14s14),
                GuidePage(R.drawable.i14s15),
                GuidePage(R.drawable.i14s16),
                GuidePage(R.drawable.i14s17),
                GuidePage(R.drawable.i14s18),
                GuidePage(R.drawable.i14s19),
                GuidePage(R.drawable.i14s20),
                GuidePage(R.drawable.i14s21),
                GuidePage(R.drawable.i14s22),
                GuidePage(R.drawable.i14s23),
                GuidePage(R.drawable.i14s24)))

        categories[category] = subCategories
        return category
    }

    private fun houses(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_houses), R.drawable.i15s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i9s0), R.drawable.i9s0,
                GuidePage(ToolsResources.s(R.string.i9s1), R.drawable.i9s1),
                GuidePage(R.drawable.i9s2),
                GuidePage(R.drawable.i9s3),
                GuidePage(R.drawable.i9s4)))

        subCategories.add(Guide(ToolsResources.s(R.string.i12s0), R.drawable.i12s0,
                GuidePage(ToolsResources.s(R.string.i12s1), R.drawable.i12s1),
                GuidePage(R.drawable.i12s2),
                GuidePage(R.drawable.i12s3),
                GuidePage(R.drawable.i12s4),
                GuidePage(R.drawable.i12s5),
                GuidePage(R.drawable.i12s6),
                GuidePage(R.drawable.i12s7),
                GuidePage(R.drawable.i12s8),
                GuidePage(R.drawable.i12s9)))

        subCategories.add(Guide(ToolsResources.s(R.string.i15s0), R.drawable.i15s0,
                GuidePage(ToolsResources.s(R.string.i15s1), R.drawable.i15s1),
                GuidePage(R.drawable.i15s2),
                GuidePage(ToolsResources.s(R.string.i15s3), R.drawable.i15s3),
                GuidePage(R.drawable.i15s4),
                GuidePage(ToolsResources.s(R.string.i15s5), R.drawable.i15s5),
                GuidePage(R.drawable.i15s6),
                GuidePage(R.drawable.i15s7),
                GuidePage(R.drawable.i15s8),
                GuidePage(R.drawable.i15s9),
                GuidePage(R.drawable.i15s10),
                GuidePage(R.drawable.i15s11),
                GuidePage(R.drawable.i15s12),
                GuidePage(R.drawable.i15s13),
                GuidePage(R.drawable.i15s14)))

        categories[category] = subCategories
        return category
    }

    private fun furniture(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_furniture), R.drawable.i7s0)
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.i7s0), R.drawable.i7s0,
                GuidePage(ToolsResources.s(R.string.i7s1), R.drawable.i7s1),
                GuidePage(R.drawable.i7s2),
                GuidePage(ToolsResources.s(R.string.i7s3), R.drawable.i7s3),
                GuidePage(R.drawable.i7s4),
                GuidePage(R.drawable.i7s5),
                GuidePage(ToolsResources.s(R.string.i7s6), R.drawable.i7s6),
                GuidePage(R.drawable.i7s7),
                GuidePage(R.drawable.i7s8),
                GuidePage(R.drawable.i7s9),
                GuidePage(R.drawable.i7s10),
                GuidePage(R.drawable.i7s11),
                GuidePage(R.drawable.i7s12)))

        subCategories.add(Guide(ToolsResources.s(R.string.i8s0), R.drawable.i8s0,
                GuidePage(ToolsResources.s(R.string.i8s1), R.drawable.i8s1),
                GuidePage(ToolsResources.s(R.string.i8s1), R.drawable.i8s1),
                GuidePage(R.drawable.i8s2),
                GuidePage(R.drawable.i8s3),
                GuidePage(R.drawable.i8s4),
                GuidePage(R.drawable.i8s5),
                GuidePage(ToolsResources.s(R.string.i8s6), R.drawable.i8s6),
                GuidePage(R.drawable.i8s7)))


        subCategories.add(Guide(ToolsResources.s(R.string.i10s0), R.drawable.i10s0,
                GuidePage(ToolsResources.s(R.string.i10s1), R.drawable.i10s1),
                GuidePage(ToolsResources.s(R.string.i10s2), R.drawable.i10s2),
                GuidePage(ToolsResources.s(R.string.i10s3), R.drawable.i10s3),
                GuidePage(ToolsResources.s(R.string.i10s4), R.drawable.i10s4),
                GuidePage(ToolsResources.s(R.string.i10s5), R.drawable.i10s5),
                GuidePage(ToolsResources.s(R.string.i10s6), R.drawable.i10s6)))


        subCategories.add(Guide(ToolsResources.s(R.string.i13s0), R.drawable.i13s0,
                GuidePage(ToolsResources.s(R.string.i13s1), R.drawable.i13s1),
                GuidePage(R.drawable.i13s2),
                GuidePage(ToolsResources.s(R.string.i13s3), R.drawable.i13s3),
                GuidePage(R.drawable.i13s4),
                GuidePage(R.drawable.i13s5),
                GuidePage(ToolsResources.s(R.string.i13s6), R.drawable.i13s6)))

        categories[category] = subCategories
        return category
    }

}
