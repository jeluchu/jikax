package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Studio data class.
 */
@Serializable
data class Studio(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for studio.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for studio.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for studio.
     */
    @SerialName("url")
    val url: String? = null
)