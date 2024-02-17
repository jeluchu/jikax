package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Genre data class.
 */
data class Genre(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for genre.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for genre.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for genre.
     */
    @SerializedName("url")
    val url: String = String.empty()
)