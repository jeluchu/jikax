package com.jeluchu.jikax.models.search

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData

/**
 * Pagination data class.
 */
data class Pagination(
    /**
     * Current page available.
     */
    @SerializedName("current_page")
    val currentPage: Int,

    /**
     * Last page available.
     */
    @SerializedName("last_visible_page")
    val lastPage: Int,

    /**
     * Items information.
     */
    @SerializedName("items")
    val itemsPage: ItemsPage,

    /**
     * Request hast next page or not.
     */
    @SerializedName("has_next_page")
    val hasNextPage: Boolean
)