package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero

/**
 * Licensor data class.
 */
data class Licensor(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Name for licensor.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Type for licensor.
     */
    @SerializedName("type")
    val type: String = String.empty(),

    /**
     * Url for licensor.
     */
    @SerializedName("url")
    val url: String = String.empty()
)