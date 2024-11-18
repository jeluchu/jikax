package com.jeluchu.jikax.models.schedule

import com.jeluchu.jikax.models.anime.AnimeData
import com.jeluchu.jikax.models.search.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Schedule data class.
 */
@Serializable
data class Schedule(
    /**
     * Pagination info for request
     */
    @SerialName("pagination")
    val pagination: Pagination,

    /**
     * Data for anime requested.
     */
    @SerialName("data")
    val data: List<AnimeData>
)