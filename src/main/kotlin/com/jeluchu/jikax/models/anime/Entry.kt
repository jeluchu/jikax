package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Entry data class.
 */
data class Entry(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int,

    /**
     * Name for entry.
     */
    @SerializedName("name")
    val name: String,

    /**
     * Type for entry.
     */
    @SerializedName("type")
    val type: String,

    /**
     * Url for entry.
     */
    @SerializedName("url")
    val url: String
)