package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Producer data class.
 */
@Serializable
data class Producer(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for producer.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for producer.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for producer.
     */
    @SerialName("url")
    val url: String? = null
)