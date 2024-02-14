package com.jeluchu.jikax.core.models.common

import com.google.gson.annotations.SerializedName

data class ImageFormat(
    @SerializedName("image_url")
    val generic: String,

    @SerializedName("small_image_url")
    val small: String,

    @SerializedName("large_image_url")
    val large: String
)