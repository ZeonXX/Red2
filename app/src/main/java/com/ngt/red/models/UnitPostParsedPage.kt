package com.ngt.red.models

import com.dzen.campfire.api.models.publications.post.PageImage
import com.dzen.campfire.api.models.publications.post.PageText

class UnitPostParsedPage(
        val guide: UnitPostParsed,
        val pageText:PageText,
        val pageImage:PageImage
){

    fun indexOfImage() = guide.indexOfPage(pageImage)

    fun indexOfText() = guide.indexOfPage(pageText)

}