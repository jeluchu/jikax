package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Demographic data class.
 */
data class Demographic(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for demographic.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for demographic.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for demographic.
     */
    @SerializedName("url")
    val url: String = String.empty()
)