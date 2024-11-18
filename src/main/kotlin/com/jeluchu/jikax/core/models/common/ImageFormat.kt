package com.jeluchu.jikax.core.models.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageFormat(
    @SerialName("image_url")
    val generic: String? = null,

    @SerialName("small_image_url")
    val small: String? = null,

    @SerialName("medium_image_url")
    val medium: String? = null,

    @SerialName("large_image_url")
    val large: String? = null,

    @SerialName("maximum_image_url")
    val maximum: String? = null
)