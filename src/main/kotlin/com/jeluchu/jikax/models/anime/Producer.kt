package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Producer data class.
 */
data class Producer(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for producer.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for producer.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for producer.
     */
    @SerializedName("url")
    val url: String = String.empty()
)