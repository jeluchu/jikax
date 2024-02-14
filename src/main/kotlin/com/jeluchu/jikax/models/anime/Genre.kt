package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Genre data class.
 */
data class Genre(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int,

    /**
     * Name for genre.
     */
    @SerializedName("name")
    val name: String,

    /**
     * Type for genre.
     */
    @SerializedName("type")
    val type: String,

    /**
     * Url for genre.
     */
    @SerializedName("url")
    val url: String
)