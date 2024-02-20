package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Studio data class.
 */
data class Studio(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int?,

    /**
     * Name for studio.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Type for studio.
     */
    @SerializedName("type")
    val type: String?,

    /**
     * Url for studio.
     */
    @SerializedName("url")
    val url: String?
)