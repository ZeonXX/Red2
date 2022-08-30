package com.ngt.red.models

import com.sup.dev.java.libs.json.Json
import com.sup.dev.java.libs.json.JsonParsable

class GuidePage{

    var text = ""
    var imageId = 0L
    var imageTag = ""
    var commandText = ""

    constructor() {

    }

    constructor(imageTag: String) {
        this.imageTag = imageTag
    }

    constructor(imageId: Int) {
        this.imageId = imageId.toLong()
    }

    constructor(imageId: Long) {
        this.imageId = imageId
    }

    constructor(text: String, imageId: Int) {
        this.text = text
        this.imageId = imageId.toLong()
    }
    constructor(text: String, imageTag: String) {
        this.text = text
        this.imageTag = imageTag
    }

    constructor(text: String, imageId: Long) {
        this.text = text
        this.imageId = imageId
    }

}
