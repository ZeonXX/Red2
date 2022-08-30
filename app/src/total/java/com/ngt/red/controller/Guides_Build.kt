package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.ngt.red.models.GuidePage
import com.sup.dev.android.tools.ToolsResources

object Guides_Build {

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

    private fun woodCity(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_wood_city), "build_z3s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_z0s00), "build_z0s00",
                GuidePage(ToolsResources.s(R.string.build_z0s0), "build_z0s0"),
                GuidePage("build_z0s1"),
                GuidePage("build_z0s2"),
                GuidePage("build_z0s3"),
                GuidePage("build_z0s4"),
                GuidePage("build_z0s5"),
                GuidePage("build_z0s6"),
                GuidePage("build_z0s7"),
                GuidePage("build_z0s8"),
                GuidePage("build_z0s9"),
                GuidePage("build_z0s10"),
                GuidePage("build_z0s11"),
                GuidePage("build_z0s12"),
                GuidePage("build_z0s13"),
                GuidePage("build_z0s14"),
                GuidePage("build_z0s15"),
                GuidePage("build_z0s16"),
                GuidePage("build_z0s17")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z1s00), "build_z1s00",
                GuidePage(ToolsResources.s(R.string.build_z0s0), "build_z1s0"),
                GuidePage("build_z1s1"),
                GuidePage("build_z1s2"),
                GuidePage("build_z1s3"),
                GuidePage("build_z1s4"),
                GuidePage("build_z1s5"),
                GuidePage("build_z1s6"),
                GuidePage("build_z1s7"),
                GuidePage("build_z1s8"),
                GuidePage("build_z1s9"),
                GuidePage("build_z1s10"),
                GuidePage("build_z1s11"),
                GuidePage("build_z1s12"),
                GuidePage("build_z1s13"),
                GuidePage("build_z1s14"),
                GuidePage("build_z1s15"),
                GuidePage("build_z1s16"),
                GuidePage("build_z1s17"),
                GuidePage("build_z1s18"),
                GuidePage("build_z1s19"),
                GuidePage("build_z1s20"),
                GuidePage("build_z1s21"),
                GuidePage("build_z1s22")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z2s00), "build_z2s00",
                GuidePage(ToolsResources.s(R.string.build_z2s0), "build_z2s0"),
                GuidePage("build_z2s1"),
                GuidePage("build_z2s2"),
                GuidePage("build_z2s3"),
                GuidePage("build_z2s4"),
                GuidePage("build_z2s5"),
                GuidePage("build_z2s6"),
                GuidePage("build_z2s7"),
                GuidePage("build_z2s8"),
                GuidePage("build_z2s9")))


        subCategories.add(Guide(ToolsResources.s(R.string.build_z3s00), "build_z3s00",
                GuidePage(ToolsResources.s(R.string.build_z3s0), "build_z3s0"),
                GuidePage("build_z3s1"),
                GuidePage("build_z3s2"),
                GuidePage("build_z3s3"),
                GuidePage("build_z3s4"),
                GuidePage("build_z3s5"),
                GuidePage("build_z3s6"),
                GuidePage("build_z3s7"),
                GuidePage("build_z3s8"),
                GuidePage("build_z3s9"),
                GuidePage("build_z3s10"),
                GuidePage("build_z3s11"),
                GuidePage("build_z3s12"),
                GuidePage("build_z3s13"),
                GuidePage("build_z3s14"),
                GuidePage("build_z3s15"),
                GuidePage("build_z3s16"),
                GuidePage("build_z3s17"),
                GuidePage("build_z3s18"),
                GuidePage("build_z3s19"),
                GuidePage("build_z3s20")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z4s00), "build_z4s00",
                GuidePage(ToolsResources.s(R.string.build_z4s0), "build_z4s0"),
                GuidePage("build_z4s1"),
                GuidePage("build_z4s2"),
                GuidePage("build_z4s3"),
                GuidePage("build_z4s4"),
                GuidePage("build_z4s5"),
                GuidePage("build_z4s6"),
                GuidePage("build_z4s7"),
                GuidePage("build_z4s8"),
                GuidePage("build_z4s9")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun stoneCity(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_stone_city), "build_i4s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_i1s00), "build_i1s00",
                GuidePage(ToolsResources.s(R.string.build_i1s0), "build_i1s0"),
                GuidePage("build_i1s1"),
                GuidePage("build_i1s2"),
                GuidePage("build_i1s3"),
                GuidePage("build_i1s4"),
                GuidePage("build_i1s5"),
                GuidePage("build_i1s6"),
                GuidePage("build_i1s7"),
                GuidePage("build_i1s8"),
                GuidePage("build_i1s9"),
                GuidePage("build_i1s10")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i2s00), "build_i2s00",
                GuidePage(ToolsResources.s(R.string.build_i2s0), "build_i2s0"),
                GuidePage("build_i2s1"),
                GuidePage("build_i2s2"),
                GuidePage("build_i2s3"),
                GuidePage("build_i2s4"),
                GuidePage("build_i2s5"),
                GuidePage("build_i2s6"),
                GuidePage("build_i2s7"),
                GuidePage("build_i2s8"),
                GuidePage("build_i2s9"),
                GuidePage("build_i2s10"),
                GuidePage("build_i2s11"),
                GuidePage("build_i2s12"),
                GuidePage("build_i2s13"),
                GuidePage("build_i2s14"),
                GuidePage("build_i2s15"),
                GuidePage("build_i2s16"),
                GuidePage("build_i2s17"),
                GuidePage("build_i2s18"),
                GuidePage("build_i2s19"),
                GuidePage("build_i2s20"),
                GuidePage("build_i2s21"),
                GuidePage("build_i2s22"),
                GuidePage("build_i2s23"),
                GuidePage("build_i2s24"),
                GuidePage("build_i2s25"),
                GuidePage("build_i2s26"),
                GuidePage("build_i2s27"),
                GuidePage("build_i2s28"),
                GuidePage("build_i2s29"),
                GuidePage("build_i2s30")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i3s00), "build_i3s00",
                GuidePage(ToolsResources.s(R.string.build_i3s0), "build_i3s0"),
                GuidePage("build_i3s1"),
                GuidePage("build_i3s2"),
                GuidePage("build_i3s3"),
                GuidePage("build_i3s4"),
                GuidePage("build_i3s5"),
                GuidePage("build_i3s6"),
                GuidePage("build_i3s7"),
                GuidePage("build_i3s8"),
                GuidePage("build_i3s9"),
                GuidePage("build_i3s10"),
                GuidePage("build_i3s11"),
                GuidePage("build_i3s12"),
                GuidePage("build_i3s13"),
                GuidePage("build_i3s14"),
                GuidePage("build_i3s15"),
                GuidePage("build_i3s16")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i4s0), "build_i4s0",
                GuidePage(ToolsResources.s(R.string.build_i4s1), "build_i4s1"),
                GuidePage("build_i4s2"),
                GuidePage(ToolsResources.s(R.string.build_i4s3), "build_i4s3"),
                GuidePage("build_i4s4"),
                GuidePage("build_i4s5"),
                GuidePage("build_i4s6"),
                GuidePage("build_i4s7"),
                GuidePage("build_i4s8"),
                GuidePage("build_i4s9"),
                GuidePage(ToolsResources.s(R.string.build_i4s10), "build_i4s10"),
                GuidePage("build_i4s11"),
                GuidePage("build_i4s12"),
                GuidePage("build_i4s13"),
                GuidePage("build_i4s14"),
                GuidePage(ToolsResources.s(R.string.build_i4s15), "build_i4s15"),
                GuidePage("build_i4s16"),
                GuidePage("build_i4s17"),
                GuidePage("build_i4s18"),
                GuidePage("build_i4s19"),
                GuidePage("build_i4s20"),
                GuidePage("build_i4s21"),
                GuidePage(ToolsResources.s(R.string.build_i4s22), "build_i4s22"),
                GuidePage(ToolsResources.s(R.string.build_i4s23), "build_i4s23"),
                GuidePage(ToolsResources.s(R.string.build_i4s24), "build_i4s24"),
                GuidePage("build_i4s25"),
                GuidePage("build_i4s26"),
                GuidePage("build_i4s27"),
                GuidePage("build_i4s28"),
                GuidePage("build_i4s29")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i5s00), "build_i5s00",
                GuidePage(ToolsResources.s(R.string.build_i5s0), "build_i5s0"),
                GuidePage("build_i5s1"),
                GuidePage("build_i5s2"),
                GuidePage("build_i5s3"),
                GuidePage("build_i5s4"),
                GuidePage("build_i5s5"),
                GuidePage("build_i5s6"),
                GuidePage("build_i5s7"),
                GuidePage("build_i5s8"),
                GuidePage("build_i5s9"),
                GuidePage("build_i5s10"),
                GuidePage("build_i5s11")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun stoneHarbor(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_stone_harbor), "build_z14s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_z10s00), "build_z10s00",
                GuidePage(ToolsResources.s(R.string.build_z10s0), "build_z10s0"),
                GuidePage("build_z10s1"),
                GuidePage("build_z10s2"),
                GuidePage("build_z10s3"),
                GuidePage("build_z10s4"),
                GuidePage("build_z10s5"),
                GuidePage("build_z10s6"),
                GuidePage("build_z10s7"),
                GuidePage("build_z10s8"),
                GuidePage("build_z10s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z11s00), "build_z11s00",
                GuidePage(ToolsResources.s(R.string.build_z11s0), "build_z11s0"),
                GuidePage("build_z11s1"),
                GuidePage("build_z11s2"),
                GuidePage("build_z11s3"),
                GuidePage("build_z11s4"),
                GuidePage("build_z11s5"),
                GuidePage("build_z11s6"),
                GuidePage("build_z11s7"),
                GuidePage("build_z11s8"),
                GuidePage("build_z11s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z12s00), "build_z12s00",
                GuidePage(ToolsResources.s(R.string.build_z12s0), "build_z12s0"),
                GuidePage("build_z12s1"),
                GuidePage("build_z12s2"),
                GuidePage("build_z12s3"),
                GuidePage("build_z12s4"),
                GuidePage("build_z12s5"),
                GuidePage("build_z12s6"),
                GuidePage("build_z12s7"),
                GuidePage("build_z12s8"),
                GuidePage("build_z12s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z13s00), "build_z13s00",
                GuidePage(ToolsResources.s(R.string.build_z13s0), "build_z13s0"),
                GuidePage("build_z13s1"),
                GuidePage("build_z13s2"),
                GuidePage("build_z13s3"),
                GuidePage("build_z13s4"),
                GuidePage("build_z13s5"),
                GuidePage("build_z13s6"),
                GuidePage("build_z13s7"),
                GuidePage("build_z13s8"),
                GuidePage("build_z13s9"),
                GuidePage("build_z13s10"),
                GuidePage("build_z13s11"),
                GuidePage("build_z13s12"),
                GuidePage("build_z13s13"),
                GuidePage("build_z13s14"),
                GuidePage("build_z13s15")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z14s00), "build_z14s00",
                GuidePage(ToolsResources.s(R.string.build_z14s0), "build_z14s0"),
                GuidePage("build_z14s1"),
                GuidePage("build_z14s2"),
                GuidePage("build_z14s3"),
                GuidePage("build_z14s4"),
                GuidePage("build_z14s5"),
                GuidePage("build_z14s6"),
                GuidePage("build_z14s7"),
                GuidePage("build_z14s8"),
                GuidePage("build_z14s9"),
                GuidePage("build_z14s10")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun woodenHarbor(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_wooden_harbor), "build_z9s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_z5s00), "build_z5s00",
                GuidePage(ToolsResources.s(R.string.build_z5s0), "build_z5s0"),
                GuidePage("build_z5s1"),
                GuidePage("build_z5s2"),
                GuidePage("build_z5s3"),
                GuidePage("build_z5s4"),
                GuidePage("build_z5s5"),
                GuidePage("build_z5s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z6s00), "build_z6s00",
                GuidePage(ToolsResources.s(R.string.build_z6s0), "build_z6s0"),
                GuidePage("build_z6s1"),
                GuidePage("build_z6s2"),
                GuidePage("build_z6s3"),
                GuidePage("build_z6s4"),
                GuidePage("build_z6s5"),
                GuidePage("build_z6s6"),
                GuidePage("build_z6s7"),
                GuidePage("build_z6s8"),
                GuidePage("build_z6s9"),
                GuidePage("build_z6s10"),
                GuidePage("build_z6s11"),
                GuidePage("build_z6s12"),
                GuidePage("build_z6s13"),
                GuidePage("build_z6s14")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z7s00), "build_z7s00",
                GuidePage(ToolsResources.s(R.string.build_z7s0), "build_z7s0"),
                GuidePage("build_z7s1"),
                GuidePage("build_z7s2"),
                GuidePage("build_z7s3"),
                GuidePage("build_z7s4"),
                GuidePage("build_z7s5"),
                GuidePage("build_z7s6"),
                GuidePage("build_z7s7"),
                GuidePage("build_z7s8"),
                GuidePage("build_z7s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z8s00), "build_z8s00",
                GuidePage(ToolsResources.s(R.string.build_z8s0), "build_z8s0"),
                GuidePage("build_z8s1"),
                GuidePage("build_z8s2"),
                GuidePage("build_z8s3"),
                GuidePage("build_z8s4"),
                GuidePage("build_z8s5"),
                GuidePage("build_z8s6"),
                GuidePage("build_z8s7"),
                GuidePage("build_z8s8"),
                GuidePage("build_z8s9"),
                GuidePage("build_z8s10"),
                GuidePage("build_z8s11"),
                GuidePage("build_z8s12"),
                GuidePage("build_z8s13"),
                GuidePage("build_z8s14"),
                GuidePage("build_z8s15")))


        subCategories.add(Guide(ToolsResources.s(R.string.build_z9s00), "build_z9s00",
                GuidePage(ToolsResources.s(R.string.build_z9s0), "build_z9s0"),
                GuidePage("build_z9s1"),
                GuidePage("build_z9s2"),
                GuidePage("build_z9s3"),
                GuidePage("build_z9s4"),
                GuidePage("build_z9s5"),
                GuidePage("build_z9s6"),
                GuidePage("build_z9s7"),
                GuidePage("build_z9s8"),
                GuidePage("build_z9s9"),
                GuidePage("build_z9s10")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun stoneDungeon(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_stone_dungeon), "build_z15s00")
        val subCategories = ArrayList<Guide>()


        subCategories.add(Guide(ToolsResources.s(R.string.build_z15s00), "build_z15s00",
                GuidePage(ToolsResources.s(R.string.build_z15s0), "build_z15s0"),
                GuidePage("build_z15s1"),
                GuidePage("build_z15s2"),
                GuidePage("build_z15s3"),
                GuidePage("build_z15s4"),
                GuidePage("build_z15s5"),
                GuidePage("build_z15s6"),
                GuidePage("build_z15s7"),
                GuidePage("build_z15s8"),
                GuidePage("build_z15s9"),
                GuidePage("build_z15s10"),
                GuidePage("build_z15s11")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z17s00), "build_z17s00",
                GuidePage(ToolsResources.s(R.string.build_z17s0), "build_z17s0"),
                GuidePage("build_z17s1"),
                GuidePage("build_z17s2"),
                GuidePage("build_z17s3"),
                GuidePage("build_z17s4"),
                GuidePage("build_z17s5"),
                GuidePage("build_z17s6"),
                GuidePage("build_z17s7"),
                GuidePage("build_z17s8"),
                GuidePage("build_z17s9"),
                GuidePage("build_z17s10"),
                GuidePage("build_z17s11")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z18s00), "build_z18s00",
                GuidePage(ToolsResources.s(R.string.build_z18s0), "build_z18s0"),
                GuidePage("build_z18s1"),
                GuidePage("build_z18s2"),
                GuidePage("build_z18s3"),
                GuidePage("build_z18s4"),
                GuidePage("build_z18s5"),
                GuidePage("build_z18s6"),
                GuidePage("build_z18s7"),
                GuidePage("build_z18s8"),
                GuidePage("build_z18s9"),
                GuidePage("build_z18s10")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun woodenDungeon(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_wooden_dungeon), "build_z19s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_z19s00), "build_z19s00",
                GuidePage(ToolsResources.s(R.string.build_z19s0), "build_z19s0"),
                GuidePage("build_z19s1"),
                GuidePage("build_z19s2"),
                GuidePage("build_z19s3"),
                GuidePage("build_z19s4"),
                GuidePage("build_z19s5"),
                GuidePage("build_z19s6"),
                GuidePage("build_z19s7"),
                GuidePage("build_z19s8")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z20s00), "build_z20s00",
                GuidePage(ToolsResources.s(R.string.build_z20s0), "build_z20s0"),
                GuidePage("build_z20s1"),
                GuidePage("build_z20s2"),
                GuidePage("build_z20s3"),
                GuidePage("build_z20s4"),
                GuidePage("build_z20s5"),
                GuidePage("build_z20s6"),
                GuidePage("build_z20s7"),
                GuidePage("build_z20s8"),
                GuidePage("build_z20s9"),
                GuidePage("build_z20s10")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_z21s00), "build_z21s00",
                GuidePage(ToolsResources.s(R.string.build_z21s0), "build_z21s0"),
                GuidePage("build_z21s1"),
                GuidePage("build_z21s2"),
                GuidePage("build_z21s3"),
                GuidePage("build_z21s4"),
                GuidePage("build_z21s5"),
                GuidePage("build_z21s6"),
                GuidePage("build_z21s7")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun farm(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_farm), "build_i11s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_i6s0), "build_i6s0",
                GuidePage(ToolsResources.s(R.string.build_i6s1), "build_i6s1"),
                GuidePage("build_i6s2"),
                GuidePage("build_i6s3"),
                GuidePage("build_i6s4"),
                GuidePage("build_i6s5"),
                GuidePage("build_i6s6"),
                GuidePage("build_i6s7"),
                GuidePage("build_i6s8"),
                GuidePage("build_i6s9"),
                GuidePage("build_i6s10"),
                GuidePage("build_i6s11"),
                GuidePage("build_i6s12"),
                GuidePage("build_i6s13")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i11s0), "build_i11s0",
                GuidePage(ToolsResources.s(R.string.build_i11s1), "build_i11s1"),
                GuidePage("build_i11s2"),
                GuidePage("build_i11s3"),
                GuidePage("build_i11s4"),
                GuidePage(ToolsResources.s(R.string.build_i11s5), "build_i11s5"),
                GuidePage("build_i11s6"),
                GuidePage("build_i11s7"),
                GuidePage("build_i11s8"),
                GuidePage("build_i11s9"),
                GuidePage("build_i11s10"),
                GuidePage("build_i11s11"),
                GuidePage("build_i11s12")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i14s0), "build_i14s0",
                GuidePage(ToolsResources.s(R.string.build_i14s1), "build_i14s1"),
                GuidePage("build_i14s2"),
                GuidePage("build_i14s3"),
                GuidePage("build_i14s4"),
                GuidePage("build_i14s5"),
                GuidePage("build_i14s6"),
                GuidePage("build_i14s7"),
                GuidePage("build_i14s8"),
                GuidePage("build_i14s9"),
                GuidePage("build_i14s10"),
                GuidePage("build_i14s11"),
                GuidePage("build_i14s12"),
                GuidePage("build_i14s13"),
                GuidePage("build_i14s14"),
                GuidePage("build_i14s15"),
                GuidePage("build_i14s16"),
                GuidePage("build_i14s17"),
                GuidePage("build_i14s18"),
                GuidePage("build_i14s19"),
                GuidePage("build_i14s20"),
                GuidePage("build_i14s21"),
                GuidePage("build_i14s22"),
                GuidePage("build_i14s23"),
                GuidePage("build_i14s24")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun houses(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_houses), "build_i15s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_i9s0), "build_i9s0",
                GuidePage(ToolsResources.s(R.string.build_i9s1), "build_i9s1"),
                GuidePage("build_i9s2"),
                GuidePage("build_i9s3"),
                GuidePage("build_i9s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i12s0), "build_i12s0",
                GuidePage(ToolsResources.s(R.string.build_i12s1), "build_i12s1"),
                GuidePage("build_i12s2"),
                GuidePage("build_i12s3"),
                GuidePage("build_i12s4"),
                GuidePage("build_i12s5"),
                GuidePage("build_i12s6"),
                GuidePage("build_i12s7"),
                GuidePage("build_i12s8"),
                GuidePage("build_i12s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i15s0), "build_i15s0",
                GuidePage(ToolsResources.s(R.string.build_i15s1), "build_i15s1"),
                GuidePage("build_i15s2"),
                GuidePage(ToolsResources.s(R.string.build_i15s3), "build_i15s3"),
                GuidePage("build_i15s4"),
                GuidePage(ToolsResources.s(R.string.build_i15s5), "build_i15s5"),
                GuidePage("build_i15s6"),
                GuidePage("build_i15s7"),
                GuidePage("build_i15s8"),
                GuidePage("build_i15s9"),
                GuidePage("build_i15s10"),
                GuidePage("build_i15s11"),
                GuidePage("build_i15s12"),
                GuidePage("build_i15s13"),
                GuidePage("build_i15s14")))

        ControllerGuides.categories[category] = subCategories
        return category
    }

    private fun furniture(): Guide {
        val category = Guide(ToolsResources.s(R.string.name_furniture), "build_i7s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.build_i7s0), "build_i7s0",
                GuidePage(ToolsResources.s(R.string.build_i7s1), "build_i7s1"),
                GuidePage("build_i7s2"),
                GuidePage(ToolsResources.s(R.string.build_i7s3), "build_i7s3"),
                GuidePage("build_i7s4"),
                GuidePage("build_i7s5"),
                GuidePage(ToolsResources.s(R.string.build_i7s6), "build_i7s6"),
                GuidePage("build_i7s7"),
                GuidePage("build_i7s8"),
                GuidePage("build_i7s9"),
                GuidePage("build_i7s10"),
                GuidePage("build_i7s11"),
                GuidePage("build_i7s12")))

        subCategories.add(Guide(ToolsResources.s(R.string.build_i8s0), "build_i8s0",
                GuidePage(ToolsResources.s(R.string.build_i8s1), "build_i8s1"),
                GuidePage(ToolsResources.s(R.string.build_i8s1), "build_i8s1"),
                GuidePage("build_i8s2"),
                GuidePage("build_i8s3"),
                GuidePage("build_i8s4"),
                GuidePage("build_i8s5"),
                GuidePage(ToolsResources.s(R.string.build_i8s6), "build_i8s6"),
                GuidePage("build_i8s7")))


        subCategories.add(Guide(ToolsResources.s(R.string.build_i10s0), "build_i10s0",
                GuidePage(ToolsResources.s(R.string.build_i10s1), "build_i10s1"),
                GuidePage(ToolsResources.s(R.string.build_i10s2), "build_i10s2"),
                GuidePage(ToolsResources.s(R.string.build_i10s3), "build_i10s3"),
                GuidePage(ToolsResources.s(R.string.build_i10s4), "build_i10s4"),
                GuidePage(ToolsResources.s(R.string.build_i10s5), "build_i10s5"),
                GuidePage(ToolsResources.s(R.string.build_i10s6), "build_i10s6")))


        subCategories.add(Guide(ToolsResources.s(R.string.build_i13s0), "build_i13s0",
                GuidePage(ToolsResources.s(R.string.build_i13s1), "build_i13s1"),
                GuidePage("build_i13s2"),
                GuidePage(ToolsResources.s(R.string.build_i13s3), "build_i13s3"),
                GuidePage("build_i13s4"),
                GuidePage("build_i13s5"),
                GuidePage(ToolsResources.s(R.string.build_i13s6), "build_i13s6")))

        ControllerGuides.categories[category] = subCategories
        return category
    }


}