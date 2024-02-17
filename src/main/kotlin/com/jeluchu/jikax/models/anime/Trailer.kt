package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Trailer data class.
 */
data class Trailer(
    /**
     * Embed url for trailer.
     */
    @SerializedName("embed_url")
    val embedUrl: String = String.empty(),

    /**
     * Url for trailer.
     */
    @SerializedName("url")
    val url: String = String.empty(),

    /**
     * Youtube id for trailer.
     */
    @SerializedName("youtube_id")
    val youtubeId: String = String.empty()
)