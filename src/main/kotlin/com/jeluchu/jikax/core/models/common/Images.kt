package com.jeluchu.jikax.core.models.common

import com.google.gson.annotations.SerializedName

/**
 * Images data class.
 */
data class Images(
    /**
     * Images for jpg image type.
     */
    @SerializedName("jpg")
    val jpg: ImageFormat = ImageFormat(),

    /**
     * Images for webp image type.
     */
    @SerializedName("webp")
    val webp: ImageFormat = ImageFormat()
)