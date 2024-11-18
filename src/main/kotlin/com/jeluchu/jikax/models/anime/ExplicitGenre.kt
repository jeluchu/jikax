package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * ExplicitGenre data class.
 */
@Serializable
data class ExplicitGenre(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for explicit genre.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for explicit genre.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for explicit genre.
     */
    @SerialName("url")
    val url: String? = null
)