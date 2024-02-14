package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Demographic data class.
 */
data class Demographic(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int,

    /**
     * Name for demographic.
     */
    @SerializedName("name")
    val name: String,

    /**
     * Type for demographic.
     */
    @SerializedName("type")
    val type: String,

    /**
     * Url for demographic.
     */
    @SerializedName("url")
    val url: String
)