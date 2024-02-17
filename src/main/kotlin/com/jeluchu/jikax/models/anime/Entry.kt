package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Entry data class.
 */
data class Entry(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for entry.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for entry.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for entry.
     */
    @SerializedName("url")
    val url: String = String.empty()
)