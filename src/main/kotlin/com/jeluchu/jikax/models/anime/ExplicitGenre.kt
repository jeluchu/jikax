package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * ExplicitGenre data class.
 */
data class ExplicitGenre(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for explicit genre.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for explicit genre.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for explicit genre.
     */
    @SerializedName("url")
    val url: String = String.empty()
)