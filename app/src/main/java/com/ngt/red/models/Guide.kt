package com.ngt.red.models

import com.sup.dev.java.tools.ToolsCollections

class Guide{

    var title: String = ""
    var tag: String = ""
    var imageId = 0L
    var imageTag = ""
    var pages: Array<GuidePage> = emptyArray()

    constructor() {

    }

    constructor(title: String, imageId: Long) {
        this.title = title
        this.imageId = imageId
    }

    constructor(title: String, imageId: Int) {
        this.title = title
        this.imageId = imageId.toLong()
    }

    constructor(title: String, imageId: Int, tag:String) {
        this.title = title
        this.tag = tag
        this.imageId = imageId.toLong()
    }

    constructor(title: String, imageId: Int, vararg pages: GuidePage) {
        this.title = title
        this.imageId = imageId.toLong()
        resetPages(*pages)
    }

    constructor(title: String, imageTag: String, vararg pages: GuidePage) {
        this.title = title
        this.imageTag = imageTag
        resetPages(*pages)
    }

    fun resetPages(vararg pages: GuidePage) {
        this.pages = Array(pages.size) { GuidePage() }
        for (i in 0 until pages.size) this.pages[i] = pages[i]
    }

    fun addPage(page:GuidePage){
        pages = ToolsCollections.add(page, pages)
    }


}