package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Producer data class.
 */
data class Producer(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int,

    /**
     * Name for producer.
     */
    @SerializedName("name")
    val name: String,

    /**
     * Type for producer.
     */
    @SerializedName("type")
    val type: String,

    /**
     * Url for producer.
     */
    @SerializedName("url")
    val url: String
)