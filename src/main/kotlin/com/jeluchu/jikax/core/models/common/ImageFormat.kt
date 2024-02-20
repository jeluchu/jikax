package com.jeluchu.jikax.core.models.common

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

data class ImageFormat(
    @SerializedName("image_url")
    val generic: String = String.empty(),

    @SerializedName("small_image_url")
    val small: String = String.empty(),

    @SerializedName("medium_image_url")
    val medium: String = String.empty(),

    @SerializedName("large_image_url")
    val large: String = String.empty(),

    @SerializedName("maximum_image_url")
    val maximum: String = String.empty()
)