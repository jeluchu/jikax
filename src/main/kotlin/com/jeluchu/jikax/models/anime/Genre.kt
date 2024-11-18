package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Genre data class.
 */
@Serializable
data class Genre(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for genre.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for genre.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for genre.
     */
    @SerialName("url")
    val url: String? = null
)