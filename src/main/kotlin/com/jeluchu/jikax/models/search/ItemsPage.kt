package com.jeluchu.jikax.models.search

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData

/**
 * ItemsPage data class.
 */
data class ItemsPage(
    /**
     * Count page.
     */
    @SerializedName("count")
    val count: Int,

    /**
     * Total items availables.
     */
    @SerializedName("total")
    val total: Int,

    /**
     * Total items per page.
     */
    @SerializedName("per_page")
    val itemsPerPage: Int
)