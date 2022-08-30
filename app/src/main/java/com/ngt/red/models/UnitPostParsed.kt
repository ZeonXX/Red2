package com.ngt.red.models

import com.dzen.campfire.api.models.publications.post.*
import com.ngt.red.controller.ControllerGuides

class UnitPostParsed(
        val unit: PublicationPost
) {

    fun isCorrect(): Boolean {
        if (ControllerGuides.isFileMode()) {
            if (unit.pages.size != 7) return false
            if (unit.pages[0] !is PageText) return false
            if (unit.pages[1] !is PageImage) return false
            if (unit.pages[2] !is PageText) return false
            if (unit.pages[3] !is PageImage) return false
            if (unit.pages[4] !is PageImage) return false
            if (unit.pages[5] !is PageImage) return false
            if (unit.pages[6] !is PageDownload) return false
        } else {
            if (unit.pages.size < if (unit.isDraft) 2 else 4) return false
            var waitTitle = true
            var waitText = false
            var waitImage = false
            for (p in unit.pages) {
                if (waitTitle && p is PageText && p.size == PageText.SIZE_1) {
                    waitTitle = false
                    waitText = false
                    waitImage = true
                    continue
                }
                if (waitText && p is PageText && p.size == PageText.SIZE_0) {
                    waitTitle = false
                    waitText = false
                    waitImage = true
                    continue
                }
                if (waitImage && p is PageImage) {
                    waitTitle = false
                    waitText = true
                    waitImage = false
                    continue
                }
                return false
            }
        }

        return true
    }

    fun getPages(): Array<UnitPostParsedPage> {
        val array = ArrayList<UnitPostParsedPage>()
        for (i in 2..unit.pages.size step 2) {
            if (i >= unit.pages.size - 1) break
            array.add(UnitPostParsedPage(this,
                    unit.pages[i] as PageText,
                    unit.pages[i + 1] as PageImage)
            )
        }
        return array.toTypedArray()
    }

    fun addPage(pageText: PageText, pageImage: PageImage) {
        unit.pages = Array(unit.pages.size + 2) {
            when {
                it < unit.pages.size -> unit.pages[it]
                it == unit.pages.size -> pageText
                else -> pageImage
            }
        }
    }

    fun removePage(page: UnitPostParsedPage) {
        var arg = 0
        unit.pages = Array(unit.pages.size - 2) {
            while (unit.pages[it + arg] == page.pageText || unit.pages[it + arg] == page.pageImage) {
                arg++
            }
            unit.pages[it + arg]
        }
    }

    fun getTitleText() = (unit.pages[0] as PageText).text

    fun getTitleImage() = (unit.pages[1] as PageImage).imageId

    fun indexOfPage(page: Page): Int {
        for (i in 0 until unit.pages.size) if (page == unit.pages[i]) return i
        return -1
    }

}