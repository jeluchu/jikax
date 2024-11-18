package com.jeluchu.jikax.models.search

import com.jeluchu.jikax.models.anime.AnimeData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Search data class.
 */
@Serializable
data class Search(
    /**
     * Pagination info for request
     */
    @SerialName("pagination")
    val pagination: Pagination,

    /**
     * Data list of all anime found.
     */
    @SerialName("data")
    val data: List<AnimeData>
)