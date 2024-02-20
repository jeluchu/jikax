package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * ExplicitGenre data class.
 */
data class ExplicitGenre(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int?,

    /**
     * Name for explicit genre.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Type for explicit genre.
     */
    @SerializedName("type")
    val type: String?,

    /**
     * Url for explicit genre.
     */
    @SerializedName("url")
    val url: String?
)