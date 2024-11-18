package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Themes data class.
 */
@Serializable
data class Themes(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Name for themes.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Type for themes.
     */
    @SerialName("type")
    val type: String? = null,

    /**
     * Url for themes.
     */
    @SerialName("url")
    val url: String? = null
)