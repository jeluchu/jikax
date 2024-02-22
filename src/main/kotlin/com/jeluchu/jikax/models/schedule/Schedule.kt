package com.jeluchu.jikax.models.schedule

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData
import com.jeluchu.jikax.models.search.Pagination

/**
 * Schedule data class.
 */
data class Schedule(
    /**
     * Pagination info for request
     */
    @SerializedName("pagination")
    val pagination: Pagination,

    /**
     * Data for anime requested.
     */
    @SerializedName("data")
    val data: List<AnimeData>
)