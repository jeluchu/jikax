package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Licensor data class.
 */
data class Licensor(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int?,

    /**
     * Name for licensor.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Type for licensor.
     */
    @SerializedName("type")
    val type: String?,

    /**
     * Url for licensor.
     */
    @SerializedName("url")
    val url: String?
)