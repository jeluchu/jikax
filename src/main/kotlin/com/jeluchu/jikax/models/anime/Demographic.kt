package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Demographic data class.
 */
@Serializable
data class Demographic(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for demographic.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for demographic.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for demographic.
     */
    @SerialName("url")
    val url: String? = null
)