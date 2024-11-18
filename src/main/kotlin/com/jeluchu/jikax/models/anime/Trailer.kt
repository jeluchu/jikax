package com.jeluchu.jikax.models.anime

import com.jeluchu.jikax.core.models.common.ImageFormat
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Trailer data class.
 */
@Serializable
data class Trailer(
    /**
     * Embed url for trailer.
     */
    @SerialName("embed_url")
    val embedUrl: String? = null,

    /**
     * Url for trailer.
     */
    @SerialName("url")
    val url: String? = null,

    /**
     * Youtube id for trailer.
     */
    @SerialName("youtube_id")
    val youtubeId: String? = null,

    /**
     * Images for trailer.
     */
    @SerialName("images")
    val images: ImageFormat? = null
)