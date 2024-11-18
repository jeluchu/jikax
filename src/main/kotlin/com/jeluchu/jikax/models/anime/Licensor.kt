package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Licensor data class.
 */
@Serializable
data class Licensor(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for licensor.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for licensor.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for licensor.
     */
    @SerialName("url")
    val url: String? = null
)