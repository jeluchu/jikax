package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Entry data class.
 */
@Serializable
data class Entry(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for entry.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for entry.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for entry.
     */
    @SerialName("url")
    val url: String? = null
)