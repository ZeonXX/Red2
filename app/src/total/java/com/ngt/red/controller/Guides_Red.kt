package com.ngt.red.controller

import com.ngt.red.R
import com.ngt.red.models.Guide
import com.ngt.red.models.GuidePage
import com.sup.dev.android.tools.ToolsResources

object Guides_Red {

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

    private fun fundamentalsAndCrafts(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_craft), "red_z32s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_z24s00), "red_z24s00",
                GuidePage(ToolsResources.s(R.string.red_z24s0), "red_z24s0"),
                GuidePage(ToolsResources.s(R.string.red_z24s1), "red_z24s1"),
                GuidePage(ToolsResources.s(R.string.red_z24s2), "red_z24s2"),
                GuidePage(ToolsResources.s(R.string.red_z24s3), "red_z24s3"),
                GuidePage(ToolsResources.s(R.string.red_z24s4), "red_z24s4"),
                GuidePage(ToolsResources.s(R.string.red_z24s5), "red_z24s5"),
                GuidePage(ToolsResources.s(R.string.red_z24s6), "red_z24s6"),
                GuidePage(ToolsResources.s(R.string.red_z24s7), "red_z24s7"),
                GuidePage(ToolsResources.s(R.string.red_z24s8), "red_z24s8"),
                GuidePage(ToolsResources.s(R.string.red_z24s9), "red_z24s9"),
                GuidePage(ToolsResources.s(R.string.red_z24s10), "red_z24s10"),
                GuidePage(ToolsResources.s(R.string.red_z24s11), "red_z24s11"),
                GuidePage(ToolsResources.s(R.string.red_z24s12), "red_z24s12"),
                GuidePage(ToolsResources.s(R.string.red_z24s13), "red_z24s13"),
                GuidePage(ToolsResources.s(R.string.red_z24s14), "red_z24s14"),
                GuidePage(ToolsResources.s(R.string.red_z24s15), "red_z24s15"),
                GuidePage(ToolsResources.s(R.string.red_z24s16), "red_z24s16"),
                GuidePage(ToolsResources.s(R.string.red_z24s17), "red_z24s17")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z25s00), "red_z25s00",
                GuidePage(ToolsResources.s(R.string.red_z25s0), "red_z25s1"),
                GuidePage(ToolsResources.s(R.string.red_z25s1), "red_z25s1"),
                GuidePage(ToolsResources.s(R.string.red_z25s2), "red_z25s2"),
                GuidePage(ToolsResources.s(R.string.red_z25s3), "red_z25s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z26s00), "red_z26s00",
                GuidePage(ToolsResources.s(R.string.red_z26s0), "red_z26s0"),
                GuidePage(ToolsResources.s(R.string.red_z26s1), "red_z26s1"),
                GuidePage(ToolsResources.s(R.string.red_z26s2), "red_z26s2"),
                GuidePage(ToolsResources.s(R.string.red_z26s3), "red_z26s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z27s00), "red_z27s00",
                GuidePage(ToolsResources.s(R.string.red_z27s0), "red_z27s0"),
                GuidePage(ToolsResources.s(R.string.red_z27s1), "red_z27s1")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z28s00), "red_z28s00",
                GuidePage(ToolsResources.s(R.string.red_z28s0), "red_z28s0"),
                GuidePage(ToolsResources.s(R.string.red_z28s1), "red_z28s1"),
                GuidePage(ToolsResources.s(R.string.red_z28s2), "red_z28s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z29s00), "red_z29s00",
                GuidePage(ToolsResources.s(R.string.red_z29s0), "red_z29s0"),
                GuidePage(ToolsResources.s(R.string.red_z29s1), "red_z29s1"),
                GuidePage(ToolsResources.s(R.string.red_z29s2), "red_z29s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z30s00), "red_z30s00",
                GuidePage(ToolsResources.s(R.string.red_z30s0), "red_z30s0"),
                GuidePage(ToolsResources.s(R.string.red_z30s1), "red_z30s1")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z31s00), "red_z31s00",
                GuidePage(ToolsResources.s(R.string.red_z31s0), "red_z24s15"),
                GuidePage(ToolsResources.s(R.string.red_z31s1), "red_z31s1"),
                GuidePage(ToolsResources.s(R.string.red_z31s2), "red_z31s2"),
                GuidePage(ToolsResources.s(R.string.red_z31s3), "red_z31s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z32s00), "red_z32s00",
                GuidePage(ToolsResources.s(R.string.red_z32s0), "red_z24s5"),
                GuidePage(ToolsResources.s(R.string.red_z32s1), "red_z32s1"),
                GuidePage(ToolsResources.s(R.string.red_z32s2), "red_z32s2"),
                GuidePage(ToolsResources.s(R.string.red_z32s3), "red_z32s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i30s0), "red_i30s0",
                GuidePage(ToolsResources.s(R.string.red_i30s1), "red_i30s1"),
                GuidePage(ToolsResources.s(R.string.red_i30s2), "red_i30s2"),
                GuidePage(ToolsResources.s(R.string.red_i30s3), "red_i30s3"),
                GuidePage(ToolsResources.s(R.string.red_i30s4), "red_i30s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i31s0), "red_i31s0",
                GuidePage(ToolsResources.s(R.string.red_i31s1), "red_i31s1"),
                GuidePage(ToolsResources.s(R.string.red_i31s2), "red_i31s2"),
                GuidePage(ToolsResources.s(R.string.red_i31s3), "red_i31s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i32s0), "red_i32s0",
                GuidePage(ToolsResources.s(R.string.red_i32s1), "red_i32s1"),
                GuidePage(ToolsResources.s(R.string.red_i32s2), "red_i32s2"),
                GuidePage(ToolsResources.s(R.string.red_i32s3), "red_i32s3"),
                GuidePage(ToolsResources.s(R.string.red_i32s4), "red_i32s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i33s0), "red_i33s0",
                GuidePage(ToolsResources.s(R.string.red_i33s1), "red_i33s1"),
                GuidePage(ToolsResources.s(R.string.red_i33s2), "red_i33s2"),
                GuidePage(ToolsResources.s(R.string.red_i33s3), "red_i33s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i34s0), "red_i34s0",
                GuidePage(ToolsResources.s(R.string.red_i34s1), "red_i34s1"),
                GuidePage(ToolsResources.s(R.string.red_i34s2), "red_i34s2"),
                GuidePage(ToolsResources.s(R.string.red_i34s3), "red_i34s3"),
                GuidePage(ToolsResources.s(R.string.red_i34s4), "red_i34s4"),
                GuidePage(ToolsResources.s(R.string.red_i34s5), "red_i34s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i35s0), "red_i35s0",
                GuidePage(ToolsResources.s(R.string.red_i35s1), "red_i35s1"),
                GuidePage(ToolsResources.s(R.string.red_i35s2), "red_i35s2"),
                GuidePage(ToolsResources.s(R.string.red_i35s3), "red_i35s3"),
                GuidePage(ToolsResources.s(R.string.red_i35s4), "red_i35s4")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun basics(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_root), "red_i12s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_i4s0), "red_i4s0",
                GuidePage(ToolsResources.s(R.string.red_i4s1), "red_i4s1"),
                GuidePage(ToolsResources.s(R.string.red_i4s2), "red_i4s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i5s0), "red_i5s0",
                GuidePage(ToolsResources.s(R.string.red_i5s1), "red_i5s1"),
                GuidePage(ToolsResources.s(R.string.red_i5s2), "red_i5s2"),
                GuidePage(ToolsResources.s(R.string.red_i5s3), "red_i5s3"),
                GuidePage(ToolsResources.s(R.string.red_i5s4), "red_i5s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i6s0), "red_i6s0",
                GuidePage(ToolsResources.s(R.string.red_i6s1), "red_i6s1"),
                GuidePage(ToolsResources.s(R.string.red_i6s2), "red_i6s2"),
                GuidePage(ToolsResources.s(R.string.red_i6s3), "red_i6s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i7s0), "red_i7s0",
                GuidePage(ToolsResources.s(R.string.red_i7s1), "red_i7s1"),
                GuidePage(ToolsResources.s(R.string.red_i7s2), "red_i7s2"),
                GuidePage(ToolsResources.s(R.string.red_i7s3), "red_i7s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i8s0), "red_i8s0",
                GuidePage(ToolsResources.s(R.string.red_i8s1), "red_i8s1"),
                GuidePage(ToolsResources.s(R.string.red_i8s2), "red_i8s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i9s0), "red_i9s0",
                GuidePage(ToolsResources.s(R.string.red_i9s1), "red_i9s1"),
                GuidePage(ToolsResources.s(R.string.red_i9s2), "red_i9s2"),
                GuidePage(ToolsResources.s(R.string.red_i9s3), "red_i9s3"),
                GuidePage(ToolsResources.s(R.string.red_i9s4), "red_i9s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i10s0), "red_i10s0",
                GuidePage(ToolsResources.s(R.string.red_i10s1), "red_i10s1"),
                GuidePage(ToolsResources.s(R.string.red_i10s2), "red_i10s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i11s0), "red_i11s0",
                GuidePage(ToolsResources.s(R.string.red_i11s1), "red_i11s1"),
                GuidePage(ToolsResources.s(R.string.red_i11s2), "red_i11s2"),
                GuidePage(ToolsResources.s(R.string.red_i11s3), "red_i11s3"),
                GuidePage(ToolsResources.s(R.string.red_i11s4), "red_i11s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i12s0), "red_i12s0",
                GuidePage(ToolsResources.s(R.string.red_i12s1), "red_i12s1"),
                GuidePage(ToolsResources.s(R.string.red_i12s2), "red_i12s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i13s0), "red_i13s0",
                GuidePage(ToolsResources.s(R.string.red_i13s1), "red_i13s1"),
                GuidePage(ToolsResources.s(R.string.red_i13s2), "red_i13s2"),
                GuidePage(ToolsResources.s(R.string.red_i13s3), "red_i13s3"),
                GuidePage(ToolsResources.s(R.string.red_i13s4), "red_i13s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i18s0), "red_i18s0",
                GuidePage(ToolsResources.s(R.string.red_i18s1), "red_i18s1"),
                GuidePage(ToolsResources.s(R.string.red_i18s2), "red_i18s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i19s0), "red_i19s0",
                GuidePage(ToolsResources.s(R.string.red_i19s1), "red_i19s1"),
                GuidePage(ToolsResources.s(R.string.red_i19s2), "red_i19s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i23s0), "red_i23s0",
                GuidePage(ToolsResources.s(R.string.red_i23s1), "red_i23s1"),
                GuidePage(ToolsResources.s(R.string.red_i23s2), "red_i23s2")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide

    }

    private fun farms(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_farm), "red_i1s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_i1s0), "red_i1s0",
                GuidePage(ToolsResources.s(R.string.red_i1s1), "red_i1s1"),
                GuidePage(ToolsResources.s(R.string.red_i1s2), "red_i1s2"),
                GuidePage(ToolsResources.s(R.string.red_i1s3), "red_i1s3"),
                GuidePage(ToolsResources.s(R.string.red_i1s4), "red_i1s4"),
                GuidePage(ToolsResources.s(R.string.red_i1s5), "red_i1s5"),
                GuidePage(ToolsResources.s(R.string.red_i1s6), "red_i1s6"),
                GuidePage(ToolsResources.s(R.string.red_i1s7), "red_i1s7")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i2s0), "red_i2s0",
                GuidePage(ToolsResources.s(R.string.red_i2s1), "red_i2s1"),
                GuidePage(ToolsResources.s(R.string.red_i2s2), "red_i2s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i3s0), "red_i3s0",
                GuidePage(ToolsResources.s(R.string.red_i3s1), "red_i3s1"),
                GuidePage(ToolsResources.s(R.string.red_i3s2), "red_i3s2"),
                GuidePage(ToolsResources.s(R.string.red_i3s3), "red_i3s3"),
                GuidePage(ToolsResources.s(R.string.red_i3s4), "red_i3s4"),
                GuidePage(ToolsResources.s(R.string.red_i3s5), "red_i3s5"),
                GuidePage(ToolsResources.s(R.string.red_i3s6), "red_i3s6"),
                GuidePage(ToolsResources.s(R.string.red_i3s7), "red_i3s7"),
                GuidePage(ToolsResources.s(R.string.red_i3s8), "red_i3s8"),
                GuidePage(ToolsResources.s(R.string.red_i3s9), "red_i3s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z16s00), "red_z16s00",
                GuidePage(ToolsResources.s(R.string.red_z16s0), "red_z16s0"),
                GuidePage(ToolsResources.s(R.string.red_z16s1), "red_z16s1"),
                GuidePage(ToolsResources.s(R.string.red_z16s2), "red_z16s2"),
                GuidePage(ToolsResources.s(R.string.red_z16s3), "red_z16s3"),
                GuidePage(ToolsResources.s(R.string.red_z16s4), "red_z16s4"),
                GuidePage(ToolsResources.s(R.string.red_z16s5), "red_z16s5"),
                GuidePage(ToolsResources.s(R.string.red_z16s6), "red_z16s6"),
                GuidePage(ToolsResources.s(R.string.red_z16s7), "red_z16s7")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i24s0), "red_i24s0",
                GuidePage(ToolsResources.s(R.string.red_i24s1), "red_i24s1"),
                GuidePage(ToolsResources.s(R.string.red_i24s2), "red_i24s2"),
                GuidePage(ToolsResources.s(R.string.red_i24s3), "red_i24s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i25s0), "red_i25s0",
                GuidePage(ToolsResources.s(R.string.red_i25s1), "red_i25s1"),
                GuidePage(ToolsResources.s(R.string.red_i25s2), "red_i25s2"),
                GuidePage(ToolsResources.s(R.string.red_i25s3), "red_i25s3"),
                GuidePage(ToolsResources.s(R.string.red_i25s4), "red_i25s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i26s0), "red_i26s0",
                GuidePage(ToolsResources.s(R.string.red_i26s1), "red_i26s1"),
                GuidePage(ToolsResources.s(R.string.red_i26s2), "red_i26s2"),
                GuidePage(ToolsResources.s(R.string.red_i26s3), "red_i26s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i36s0), "red_i36s0",
                GuidePage(ToolsResources.s(R.string.red_i36s1), "red_i36s1"),
                GuidePage(ToolsResources.s(R.string.red_i36s2), "red_i36s2"),
                GuidePage(ToolsResources.s(R.string.red_i36s3), "red_i36s3"),
                GuidePage(ToolsResources.s(R.string.red_i36s4), "red_i36s4"),
                GuidePage(ToolsResources.s(R.string.red_i36s5), "red_i36s5"),
                GuidePage(ToolsResources.s(R.string.red_i36s6), "red_i36s6")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun doors(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_door), "red_z1s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_z0s00), "red_z0s00",
                GuidePage(ToolsResources.s(R.string.red_z0s0), "red_z0s0"),
                GuidePage(ToolsResources.s(R.string.red_z0s1), "red_z0s1"),
                GuidePage(ToolsResources.s(R.string.red_z0s2), "red_z0s2"),
                GuidePage(ToolsResources.s(R.string.red_z0s3), "red_z0s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z1s00), "red_z1s00",
                GuidePage(ToolsResources.s(R.string.red_z1s0), "red_z1s0"),
                GuidePage(ToolsResources.s(R.string.red_z1s1), "red_z1s1"),
                GuidePage(ToolsResources.s(R.string.red_z1s2), "red_z1s2"),
                GuidePage(ToolsResources.s(R.string.red_z1s3), "red_z1s3"),
                GuidePage(ToolsResources.s(R.string.red_z1s4), "red_z1s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z5s00), "red_z5s00",
                GuidePage(ToolsResources.s(R.string.red_z5s0), "red_z5s0"),
                GuidePage(ToolsResources.s(R.string.red_z5s1), "red_z5s1"),
                GuidePage(ToolsResources.s(R.string.red_z5s2), "red_z5s2"),
                GuidePage(ToolsResources.s(R.string.red_z5s3), "red_z5s3"),
                GuidePage(ToolsResources.s(R.string.red_z5s4), "red_z5s4"),
                GuidePage(ToolsResources.s(R.string.red_z5s5), "red_z5s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z6s00), "red_z6s00",
                GuidePage(ToolsResources.s(R.string.red_z6s0), "red_z6s0"),
                GuidePage(ToolsResources.s(R.string.red_z6s1), "red_z6s1"),
                GuidePage(ToolsResources.s(R.string.red_z6s2), "red_z6s2"),
                GuidePage(ToolsResources.s(R.string.red_z6s3), "red_z6s3"),
                GuidePage(ToolsResources.s(R.string.red_z6s4), "red_z6s4"),
                GuidePage(ToolsResources.s(R.string.red_z6s5), "red_z6s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z10s00), "red_z10s00",
                GuidePage(ToolsResources.s(R.string.red_z10s0), "red_z10s0"),
                GuidePage(ToolsResources.s(R.string.red_z10s1), "red_z10s1"),
                GuidePage(ToolsResources.s(R.string.red_z10s2), "red_z10s2"),
                GuidePage(ToolsResources.s(R.string.red_z10s3), "red_z10s3"),
                GuidePage(ToolsResources.s(R.string.red_z10s4), "red_z10s4"),
                GuidePage(ToolsResources.s(R.string.red_z10s5), "red_z10s5"),
                GuidePage(ToolsResources.s(R.string.red_z10s6), "red_z10s6"),
                GuidePage(ToolsResources.s(R.string.red_z10s7), "red_z10s7"),
                GuidePage(ToolsResources.s(R.string.red_z10s8), "red_z10s8"),
                GuidePage(ToolsResources.s(R.string.red_z10s9), "red_z10s9"),
                GuidePage(ToolsResources.s(R.string.red_z10s10), "red_z10s10"),
                GuidePage(ToolsResources.s(R.string.red_z10s11), "red_z10s11"),
                GuidePage(ToolsResources.s(R.string.red_z10s12), "red_z10s12")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z11s00), "red_z11s00",
                GuidePage(ToolsResources.s(R.string.red_z11s0), "red_z11s0"),
                GuidePage(ToolsResources.s(R.string.red_z11s1), "red_z11s1"),
                GuidePage(ToolsResources.s(R.string.red_z11s2), "red_z11s2"),
                GuidePage(ToolsResources.s(R.string.red_z11s3), "red_z11s3"),
                GuidePage(ToolsResources.s(R.string.red_z11s4), "red_z11s4"),
                GuidePage(ToolsResources.s(R.string.red_z11s5), "red_z11s5"),
                GuidePage(ToolsResources.s(R.string.red_z11s6), "red_z11s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z7s00), "red_z7s00",
                GuidePage(ToolsResources.s(R.string.red_z7s0), "red_z7s0"),
                GuidePage(ToolsResources.s(R.string.red_z7s1), "red_z7s1"),
                GuidePage(ToolsResources.s(R.string.red_z7s2), "red_z7s2"),
                GuidePage(ToolsResources.s(R.string.red_z7s3), "red_z7s3"),
                GuidePage(ToolsResources.s(R.string.red_z7s4), "red_z7s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i28s0), "red_i28s0",
                GuidePage(ToolsResources.s(R.string.red_i28s1), "red_i28s1"),
                GuidePage(ToolsResources.s(R.string.red_i28s2), "red_i28s2"),
                GuidePage(ToolsResources.s(R.string.red_i28s3), "red_i28s3"),
                GuidePage(ToolsResources.s(R.string.red_i28s4), "red_i28s4"),
                GuidePage(ToolsResources.s(R.string.red_i28s5), "red_i28s5"),
                GuidePage(ToolsResources.s(R.string.red_i28s6), "red_i28s6"),
                GuidePage(ToolsResources.s(R.string.red_i28s7), "red_i28s7"),
                GuidePage(ToolsResources.s(R.string.red_i28s8), "red_i28s8"),
                GuidePage(ToolsResources.s(R.string.red_i28s9), "red_i28s9"),
                GuidePage(ToolsResources.s(R.string.red_i28s10), "red_i28s10")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i42s0), "red_i42s0",
                GuidePage(ToolsResources.s(R.string.red_i42s1), "red_i42s1"),
                GuidePage(ToolsResources.s(R.string.red_i42s2), "red_i42s2"),
                GuidePage(ToolsResources.s(R.string.red_i42s3), "red_i42s3"),
                GuidePage(ToolsResources.s(R.string.red_i42s4), "red_i42s4"),
                GuidePage(ToolsResources.s(R.string.red_i42s5), "red_i42s5"),
                GuidePage(ToolsResources.s(R.string.red_i42s6), "red_i42s6"),
                GuidePage(ToolsResources.s(R.string.red_i42s7), "red_i42s7"),
                GuidePage(ToolsResources.s(R.string.red_i42s8), "red_i42s8")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun bridges(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_bridges), "red_z4s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_z2s00), "red_z2s00",
                GuidePage(ToolsResources.s(R.string.red_z2s0), "red_z2s0"),
                GuidePage(ToolsResources.s(R.string.red_z2s1), "red_z2s1"),
                GuidePage(ToolsResources.s(R.string.red_z2s2), "red_z2s2"),
                GuidePage(ToolsResources.s(R.string.red_z2s3), "red_z2s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z3s00), "red_z3s00",
                GuidePage(ToolsResources.s(R.string.red_z3s0), "red_z3s0"),
                GuidePage(ToolsResources.s(R.string.red_z3s1), "red_z3s1"),
                GuidePage(ToolsResources.s(R.string.red_z3s2), "red_z3s2"),
                GuidePage(ToolsResources.s(R.string.red_z3s3), "red_z3s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z4s00), "red_z4s00",
                GuidePage(ToolsResources.s(R.string.red_z4s0), "red_z4s0"),
                GuidePage(ToolsResources.s(R.string.red_z4s1), "red_z4s1"),
                GuidePage(ToolsResources.s(R.string.red_z4s2), "red_z4s2"),
                GuidePage(ToolsResources.s(R.string.red_z4s3), "red_z4s3"),
                GuidePage(ToolsResources.s(R.string.red_z4s4), "red_z4s4"),
                GuidePage(ToolsResources.s(R.string.red_z4s5), "red_z4s5"),
                GuidePage(ToolsResources.s(R.string.red_z4s6), "red_z4s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z9s00), "red_z9s00",
                GuidePage(ToolsResources.s(R.string.red_z9s0), "red_z9s0"),
                GuidePage(ToolsResources.s(R.string.red_z9s1), "red_z9s1"),
                GuidePage(ToolsResources.s(R.string.red_z9s2), "red_z9s2"),
                GuidePage(ToolsResources.s(R.string.red_z9s3), "red_z9s3"),
                GuidePage(ToolsResources.s(R.string.red_z9s4), "red_z9s4"),
                GuidePage(ToolsResources.s(R.string.red_z9s5), "red_z9s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z8s00), "red_z8s00",
                GuidePage(ToolsResources.s(R.string.red_z8s0), "red_z8s0"),
                GuidePage(ToolsResources.s(R.string.red_z8s1), "red_z8s1"),
                GuidePage(ToolsResources.s(R.string.red_z8s2), "red_z8s2"),
                GuidePage(ToolsResources.s(R.string.red_z8s3), "red_z8s3"),
                GuidePage(ToolsResources.s(R.string.red_z8s4), "red_z8s4"),
                GuidePage(ToolsResources.s(R.string.red_z8s5), "red_z8s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i41s0), "red_i41s0",
                GuidePage(ToolsResources.s(R.string.red_i41s1), "red_i41s1"),
                GuidePage(ToolsResources.s(R.string.red_i41s2), "red_i41s2"),
                GuidePage(ToolsResources.s(R.string.red_i41s3), "red_i41s3"),
                GuidePage(ToolsResources.s(R.string.red_i41s4), "red_i41s4"),
                GuidePage(ToolsResources.s(R.string.red_i41s5), "red_i41s5"),
                GuidePage(ToolsResources.s(R.string.red_i41s6), "red_i41s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i44s0), "red_i44s0",
                GuidePage(ToolsResources.s(R.string.red_i44s1), "red_i44s1"),
                GuidePage(ToolsResources.s(R.string.red_i44s2), "red_i44s2"),
                GuidePage(ToolsResources.s(R.string.red_i44s3), "red_i44s3"),
                GuidePage(ToolsResources.s(R.string.red_i44s4), "red_i44s4"),
                GuidePage(ToolsResources.s(R.string.red_i44s5), "red_i44s5"),
                GuidePage(ToolsResources.s(R.string.red_i44s6), "red_i44s6"),
                GuidePage(ToolsResources.s(R.string.red_i44s7), "red_i44s7"),
                GuidePage(ToolsResources.s(R.string.red_i44s8), "red_i44s8"),
                GuidePage(ToolsResources.s(R.string.red_i44s9), "red_i44s9"),
                GuidePage(ToolsResources.s(R.string.red_i44s10), "red_i44s10"),
                GuidePage(ToolsResources.s(R.string.red_i44s11), "red_i44s11"),
                GuidePage(ToolsResources.s(R.string.red_i44s12), "red_i44s12"),
                GuidePage(ToolsResources.s(R.string.red_i44s13), "red_i44s13"),
                GuidePage(ToolsResources.s(R.string.red_i44s14), "red_i44s14"),
                GuidePage(ToolsResources.s(R.string.red_i44s15), "red_i44s15")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun mechanisms(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_meh), "red_z14s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_z12s00), "red_z12s00",
                GuidePage(ToolsResources.s(R.string.red_z12s0), "red_z12s0"),
                GuidePage(ToolsResources.s(R.string.red_z12s1), "red_z12s1"),
                GuidePage(ToolsResources.s(R.string.red_z12s2), "red_z12s2"),
                GuidePage(ToolsResources.s(R.string.red_z12s3), "red_z12s3"),
                GuidePage(ToolsResources.s(R.string.red_z12s4), "red_z12s4"),
                GuidePage(ToolsResources.s(R.string.red_z12s5), "red_z12s5"),
                GuidePage(ToolsResources.s(R.string.red_z12s6), "red_z12s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z13s00), "red_z13s00",
                GuidePage(ToolsResources.s(R.string.red_z13s0), "red_z13s0"),
                GuidePage(ToolsResources.s(R.string.red_z13s1), "red_z13s1"),
                GuidePage(ToolsResources.s(R.string.red_z13s2), "red_z13s2"),
                GuidePage(ToolsResources.s(R.string.red_z13s3), "red_z13s3"),
                GuidePage(ToolsResources.s(R.string.red_z13s4), "red_z13s4"),
                GuidePage(ToolsResources.s(R.string.red_z13s5), "red_z13s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z14s00), "red_z14s00",
                GuidePage(ToolsResources.s(R.string.red_z14s0), "red_z14s0"),
                GuidePage(ToolsResources.s(R.string.red_z14s1), "red_z14s1"),
                GuidePage(ToolsResources.s(R.string.red_z14s2), "red_z14s2"),
                GuidePage(ToolsResources.s(R.string.red_z14s3), "red_z14s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z15s00), "red_z15s00",
                GuidePage(ToolsResources.s(R.string.red_z15s0), "red_z15s0"),
                GuidePage(ToolsResources.s(R.string.red_z15s1), "red_z15s1"),
                GuidePage(ToolsResources.s(R.string.red_z15s2), "red_z15s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z17s00), "red_z17s00",
                GuidePage(ToolsResources.s(R.string.red_z17s0), "red_z17s0"),
                GuidePage(ToolsResources.s(R.string.red_z17s1), "red_z17s1"),
                GuidePage(ToolsResources.s(R.string.red_z17s2), "red_z17s2"),
                GuidePage(ToolsResources.s(R.string.red_z17s3), "red_z17s3"),
                GuidePage(ToolsResources.s(R.string.red_z17s4), "red_z17s4"),
                GuidePage(ToolsResources.s(R.string.red_z17s5), "red_z17s5"),
                GuidePage(ToolsResources.s(R.string.red_z17s6), "red_z17s6"),
                GuidePage(ToolsResources.s(R.string.red_z17s7), "red_z17s7"),
                GuidePage(ToolsResources.s(R.string.red_z17s8), "red_z17s8"),
                GuidePage(ToolsResources.s(R.string.red_z17s9), "red_z17s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z18s00), "red_z18s00",
                GuidePage(ToolsResources.s(R.string.red_z18s0), "red_z18s0"),
                GuidePage(ToolsResources.s(R.string.red_z18s1), "red_z18s1"),
                GuidePage(ToolsResources.s(R.string.red_z18s2), "red_z18s2"),
                GuidePage(ToolsResources.s(R.string.red_z18s3), "red_z18s3"),
                GuidePage(ToolsResources.s(R.string.red_z18s4), "red_z18s4"),
                GuidePage(ToolsResources.s(R.string.red_z18s5), "red_z18s5"),
                GuidePage(ToolsResources.s(R.string.red_z18s6), "red_z18s6"),
                GuidePage(ToolsResources.s(R.string.red_z18s7), "red_z18s7")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i14s0), "red_i14s0",
                GuidePage(ToolsResources.s(R.string.red_i14s1), "red_i14s1"),
                GuidePage(ToolsResources.s(R.string.red_i14s2), "red_i14s2"),
                GuidePage(ToolsResources.s(R.string.red_i14s3), "red_i14s3"),
                GuidePage(ToolsResources.s(R.string.red_i14s4), "red_i14s4"),
                GuidePage(ToolsResources.s(R.string.red_i14s5), "red_i14s5"),
                GuidePage(ToolsResources.s(R.string.red_i14s6), "red_i14s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i29s0), "red_i29s0",
                GuidePage(ToolsResources.s(R.string.red_i29s1), "red_i29s1"),
                GuidePage(ToolsResources.s(R.string.red_i29s2), "red_i29s2"),
                GuidePage(ToolsResources.s(R.string.red_i29s3), "red_i29s3"),
                GuidePage(ToolsResources.s(R.string.red_i29s4), "red_i29s4"),
                GuidePage(ToolsResources.s(R.string.red_i29s5), "red_i29s5"),
                GuidePage(ToolsResources.s(R.string.red_i29s6), "red_i29s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i16s0), "red_i16s0",
                GuidePage(ToolsResources.s(R.string.red_i16s1), "red_i16s1"),
                GuidePage(ToolsResources.s(R.string.red_i16s2), "red_i16s2"),
                GuidePage(ToolsResources.s(R.string.red_i16s3), "red_i16s3"),
                GuidePage(ToolsResources.s(R.string.red_i16s4), "red_i16s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z35s00), "red_z35s00",
                GuidePage(ToolsResources.s(R.string.red_z35s0), "red_z35s0"),
                GuidePage(ToolsResources.s(R.string.red_z35s1), "red_z35s1"),
                GuidePage(ToolsResources.s(R.string.red_z35s2), "red_z35s2"),
                GuidePage(ToolsResources.s(R.string.red_z35s3), "red_z35s3"),
                GuidePage(ToolsResources.s(R.string.red_z35s4), "red_z35s4"),
                GuidePage(ToolsResources.s(R.string.red_z35s5), "red_z35s5"),
                GuidePage(ToolsResources.s(R.string.red_z35s6), "red_z35s6"),
                GuidePage(ToolsResources.s(R.string.red_z35s7), "red_z35s7"),
                GuidePage(ToolsResources.s(R.string.red_z35s8), "red_z35s8")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z36s00), "red_z36s00",
                GuidePage(ToolsResources.s(R.string.red_z36s0), "red_z36s0"),
                GuidePage(ToolsResources.s(R.string.red_z36s1), "red_z36s1"),
                GuidePage(ToolsResources.s(R.string.red_z36s2), "red_z36s2"),
                GuidePage(ToolsResources.s(R.string.red_z36s3), "red_z36s3"),
                GuidePage(ToolsResources.s(R.string.red_z36s4), "red_z36s4"),
                GuidePage(ToolsResources.s(R.string.red_z36s5), "red_z36s5"),
                GuidePage(ToolsResources.s(R.string.red_z36s6), "red_z36s6"),
                GuidePage(ToolsResources.s(R.string.red_z36s7), "red_z36s7"),
                GuidePage(ToolsResources.s(R.string.red_z36s8), "red_z36s8")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z39s00), "red_z39s00",
                GuidePage(ToolsResources.s(R.string.red_z39s0), "red_z39s0"),
                GuidePage(ToolsResources.s(R.string.red_z39s1), "red_z39s1"),
                GuidePage(ToolsResources.s(R.string.red_z39s2), "red_z39s2")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun traps(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_trap), "red_z21s00")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_z19s00), "red_z19s00",
                GuidePage(ToolsResources.s(R.string.red_z19s0), "red_z19s0"),
                GuidePage(ToolsResources.s(R.string.red_z19s1), "red_z19s1"),
                GuidePage(ToolsResources.s(R.string.red_z19s2), "red_z19s2"),
                GuidePage(ToolsResources.s(R.string.red_z19s3), "red_z19s3"),
                GuidePage(ToolsResources.s(R.string.red_z19s4), "red_z19s4"),
                GuidePage(ToolsResources.s(R.string.red_z19s5), "red_z19s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z20s00), "red_z20s00",
                GuidePage(ToolsResources.s(R.string.red_z20s0), "red_z20s0"),
                GuidePage(ToolsResources.s(R.string.red_z20s1), "red_z20s1"),
                GuidePage(ToolsResources.s(R.string.red_z20s2), "red_z20s2")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z21s00), "red_z21s00",
                GuidePage(ToolsResources.s(R.string.red_z21s0), "red_z21s0"),
                GuidePage(ToolsResources.s(R.string.red_z21s1), "red_z21s1"),
                GuidePage(ToolsResources.s(R.string.red_z21s2), "red_z21s2"),
                GuidePage(ToolsResources.s(R.string.red_z21s3), "red_z21s3"),
                GuidePage(ToolsResources.s(R.string.red_z21s4), "red_z21s4"),
                GuidePage(ToolsResources.s(R.string.red_z21s5), "red_z21s5")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z22s00), "red_z22s00",
                GuidePage(ToolsResources.s(R.string.red_z22s0), "red_z22s0"),
                GuidePage(ToolsResources.s(R.string.red_z22s1), "red_z22s1"),
                GuidePage(ToolsResources.s(R.string.red_z22s2), "red_z22s2"),
                GuidePage(ToolsResources.s(R.string.red_z22s3), "red_z22s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i15s0), "red_i15s0",
                GuidePage(ToolsResources.s(R.string.red_i15s1), "red_i15s1"),
                GuidePage(ToolsResources.s(R.string.red_i15s2), "red_i15s2"),
                GuidePage(ToolsResources.s(R.string.red_i15s3), "red_i15s3"),
                GuidePage(ToolsResources.s(R.string.red_i15s4), "red_i15s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i22s0), "red_i22s0",
                GuidePage(ToolsResources.s(R.string.red_i22s1), "red_i22s1"),
                GuidePage(ToolsResources.s(R.string.red_i22s2), "red_i22s2"),
                GuidePage(ToolsResources.s(R.string.red_i22s3), "red_i22s3"),
                GuidePage(ToolsResources.s(R.string.red_i22s4), "red_i22s4"),
                GuidePage(ToolsResources.s(R.string.red_i22s5), "red_i22s5"),
                GuidePage(ToolsResources.s(R.string.red_i22s6), "red_i22s6"),
                GuidePage(ToolsResources.s(R.string.red_i22s7), "red_i22s7"),
                GuidePage(ToolsResources.s(R.string.red_i22s8), "red_i22s8")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z23s00), "red_z23s00",
                GuidePage(ToolsResources.s(R.string.red_z23s0), "red_z23s0"),
                GuidePage(ToolsResources.s(R.string.red_z23s1), "red_z23s1"),
                GuidePage(ToolsResources.s(R.string.red_z23s2), "red_z23s2"),
                GuidePage(ToolsResources.s(R.string.red_z23s3), "red_z23s3"),
                GuidePage(ToolsResources.s(R.string.red_z23s4), "red_z23s4"),
                GuidePage(ToolsResources.s(R.string.red_z23s5), "red_z23s5"),
                GuidePage(ToolsResources.s(R.string.red_z23s6), "red_z23s6"),
                GuidePage(ToolsResources.s(R.string.red_z23s7), "red_z23s7"),
                GuidePage(ToolsResources.s(R.string.red_z23s8), "red_z23s8"),
                GuidePage(ToolsResources.s(R.string.red_z23s9), "red_z23s9"),
                GuidePage(ToolsResources.s(R.string.red_z23s10), "red_z23s10"),
                GuidePage(ToolsResources.s(R.string.red_z23s11), "red_z23s11"),
                GuidePage(ToolsResources.s(R.string.red_z23s12), "red_z23s12"),
                GuidePage(ToolsResources.s(R.string.red_z23s13), "red_z23s13"),
                GuidePage(ToolsResources.s(R.string.red_z23s14), "red_z23s14"),
                GuidePage(ToolsResources.s(R.string.red_z23s15), "red_z23s15"),
                GuidePage(ToolsResources.s(R.string.red_z23s16), "red_z23s16"),
                GuidePage(ToolsResources.s(R.string.red_z23s17), "red_z23s17"),
                GuidePage(ToolsResources.s(R.string.red_z23s18), "red_z23s18"),
                GuidePage(ToolsResources.s(R.string.red_z23s19), "red_z23s19"),
                GuidePage(ToolsResources.s(R.string.red_z23s20), "red_z23s20"),
                GuidePage(ToolsResources.s(R.string.red_z23s21), "red_z23s21")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun buildings(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_links), "red_i20s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_i20s0), "red_i20s0",
                GuidePage(ToolsResources.s(R.string.red_i20s1), "red_i20s1"),
                GuidePage(ToolsResources.s(R.string.red_i20s2), "red_i20s2"),
                GuidePage(ToolsResources.s(R.string.red_i20s3), "red_i20s3"),
                GuidePage(ToolsResources.s(R.string.red_i20s4), "red_i20s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i21s0), "red_i21s0",
                GuidePage(ToolsResources.s(R.string.red_i21s1), "red_i21s1"),
                GuidePage(ToolsResources.s(R.string.red_i21s2), "red_i21s2"),
                GuidePage(ToolsResources.s(R.string.red_i21s3), "red_i21s3"),
                GuidePage(ToolsResources.s(R.string.red_i21s4), "red_i21s4")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i27s0), "red_i27s0",
                GuidePage(ToolsResources.s(R.string.red_i27s1), "red_i27s1"),
                GuidePage(ToolsResources.s(R.string.red_i27s2), "red_i27s2"),
                GuidePage(ToolsResources.s(R.string.red_i27s3), "red_i27s3"),
                GuidePage(ToolsResources.s(R.string.red_i27s4), "red_i27s4")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }

    private fun wring(): Guide {
        val Guide = Guide(ToolsResources.s(R.string.name_building), "red_i17s0")
        val subCategories = ArrayList<Guide>()

        subCategories.add(Guide(ToolsResources.s(R.string.red_i17s0), "red_i17s0",
                GuidePage(ToolsResources.s(R.string.red_i17s1), "red_i17s1"),
                GuidePage(ToolsResources.s(R.string.red_i17s2), "red_i17s2"),
                GuidePage(ToolsResources.s(R.string.red_i17s3), "red_i17s3"),
                GuidePage(ToolsResources.s(R.string.red_i17s4), "red_i17s4"),
                GuidePage(ToolsResources.s(R.string.red_i17s5), "red_i17s5"),
                GuidePage(ToolsResources.s(R.string.red_i17s6), "red_i17s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z33s00), "red_z33s00",
                GuidePage(ToolsResources.s(R.string.red_z33s0), "red_z33s0"),
                GuidePage(ToolsResources.s(R.string.red_z33s1), "red_z33s1"),
                GuidePage(ToolsResources.s(R.string.red_z33s2), "red_z33s2"),
                GuidePage(ToolsResources.s(R.string.red_z33s3), "red_z33s3"),
                GuidePage(ToolsResources.s(R.string.red_z33s4), "red_z33s4"),
                GuidePage(ToolsResources.s(R.string.red_z33s5), "red_z33s5"),
                GuidePage(ToolsResources.s(R.string.red_z33s6), "red_z33s6")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z34s00), "red_z34s00",
                GuidePage(ToolsResources.s(R.string.red_z34s0), "red_z34s0"),
                GuidePage(ToolsResources.s(R.string.red_z34s1), "red_z34s1"),
                GuidePage(ToolsResources.s(R.string.red_z34s2), "red_z34s2"),
                GuidePage(ToolsResources.s(R.string.red_z34s3), "red_z34s3")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z37s00), "red_z37s00",
                GuidePage(ToolsResources.s(R.string.red_z37s0), "red_z37s0"),
                GuidePage(ToolsResources.s(R.string.red_z37s1), "red_z37s1"),
                GuidePage(ToolsResources.s(R.string.red_z37s2), "red_z37s2"),
                GuidePage(ToolsResources.s(R.string.red_z37s3), "red_z37s3"),
                GuidePage(ToolsResources.s(R.string.red_z37s4), "red_z37s4"),
                GuidePage(ToolsResources.s(R.string.red_z37s5), "red_z37s5"),
                GuidePage(ToolsResources.s(R.string.red_z37s6), "red_z37s6"),
                GuidePage(ToolsResources.s(R.string.red_z37s7), "red_z37s7"),
                GuidePage(ToolsResources.s(R.string.red_z37s8), "red_z37s8")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_z38s00), "red_z38s00",
                GuidePage(ToolsResources.s(R.string.red_z38s0), "red_z38s0"),
                GuidePage(ToolsResources.s(R.string.red_z38s1), "red_z38s1"),
                GuidePage(ToolsResources.s(R.string.red_z38s2), "red_z38s2"),
                GuidePage(ToolsResources.s(R.string.red_z38s3), "red_z38s3"),
                GuidePage(ToolsResources.s(R.string.red_z38s4), "red_z38s4"),
                GuidePage(ToolsResources.s(R.string.red_z38s5), "red_z38s5"),
                GuidePage(ToolsResources.s(R.string.red_z38s6), "red_z38s6"),
                GuidePage(ToolsResources.s(R.string.red_z38s7), "red_z38s7"),
                GuidePage(ToolsResources.s(R.string.red_z38s8), "red_z38s8"),
                GuidePage(ToolsResources.s(R.string.red_z38s9), "red_z38s9"),
                GuidePage(ToolsResources.s(R.string.red_z38s10), "red_z38s10")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i40s0), "red_i40s0",
                GuidePage(ToolsResources.s(R.string.red_i40s1), "red_i40s1"),
                GuidePage(ToolsResources.s(R.string.red_i40s2), "red_i40s2"),
                GuidePage(ToolsResources.s(R.string.red_i40s3), "red_i40s3"),
                GuidePage(ToolsResources.s(R.string.red_i40s4), "red_i40s4"),
                GuidePage(ToolsResources.s(R.string.red_i40s5), "red_i40s5"),
                GuidePage(ToolsResources.s(R.string.red_i40s6), "red_i40s6"),
                GuidePage(ToolsResources.s(R.string.red_i40s7), "red_i40s7"),
                GuidePage(ToolsResources.s(R.string.red_i40s8), "red_i40s8"),
                GuidePage(ToolsResources.s(R.string.red_i40s9), "red_i40s9")))

        subCategories.add(Guide(ToolsResources.s(R.string.red_i43s0), "red_i43s0",
                GuidePage(ToolsResources.s(R.string.red_i43s1), "red_i43s1"),
                GuidePage(ToolsResources.s(R.string.red_i43s2), "red_i43s2"),
                GuidePage(ToolsResources.s(R.string.red_i43s3), "red_i43s3"),
                GuidePage(ToolsResources.s(R.string.red_i43s4), "red_i43s4"),
                GuidePage(ToolsResources.s(R.string.red_i43s5), "red_i43s5"),
                GuidePage(ToolsResources.s(R.string.red_i43s6), "red_i43s6"),
                GuidePage(ToolsResources.s(R.string.red_i43s7), "red_i43s7"),
                GuidePage(ToolsResources.s(R.string.red_i43s8), "red_i43s8")))

        ControllerGuides.categories[Guide] = subCategories
        return Guide
    }


}