package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Studio data class.
 */
data class Studio(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for studio.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for studio.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for studio.
     */
    @SerializedName("url")
    val url: String = String.empty()
)