package com.jeluchu.jikax.models.search

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData

/**
 * Search data class.
 */
data class Search(
    /**
     * Pagination info for request
     */
    @SerializedName("pagination")
    val pagination: Pagination,

    /**
     * Data list of all anime found.
     */
    @SerializedName("data")
    val data: List<AnimeData>
)