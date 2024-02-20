package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Themes data class.
 */
data class Themes(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int?,

    /**
     * Name for themes.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Type for themes.
     */
    @SerializedName("type")
    val type: String?,

    /**
     * Url for themes.
     */
    @SerializedName("url")
    val url: String?
)