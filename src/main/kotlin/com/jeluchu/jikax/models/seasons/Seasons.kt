package com.jeluchu.jikax.models.seasons

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.search.Pagination

/**
 * Season data class.
 */
data class Seasons(
    /**
     * Pagination info for request
     */
    @SerializedName("pagination")
    val pagination: Pagination,

    /**
     * Data list of all anime found.
     */
    @SerializedName("data")
    val data: List<SeasonInfo>
)