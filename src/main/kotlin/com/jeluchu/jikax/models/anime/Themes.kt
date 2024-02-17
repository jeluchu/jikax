package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Themes data class.
 */
data class Themes(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for themes.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for themes.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for themes.
     */
    @SerializedName("url")
    val url: String = String.empty()
)