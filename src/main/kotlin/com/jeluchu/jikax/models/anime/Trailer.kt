package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.models.common.ImageFormat

/**
 * Trailer data class.
 */
data class Trailer(
    /**
     * Embed url for trailer.
     */
    @SerializedName("embed_url")
    val embedUrl: String?,

    /**
     * Url for trailer.
     */
    @SerializedName("url")
    val url: String?,

    /**
     * Youtube id for trailer.
     */
    @SerializedName("youtube_id")
    val youtubeId: String?,

    /**
     * Images for trailer.
     */
    @SerializedName("images")
    val images: ImageFormat?
)