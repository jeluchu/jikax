package com.jeluchu.jikax.models.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Pagination data class.
 */
@Serializable
data class Pagination(
    /**
     * Current page available.
     */
    @SerialName("current_page")
    val currentPage: Int? = null,

    /**
     * Last page available.
     */
    @SerialName("last_visible_page")
    val lastPage: Int? = null,

    /**
     * Items information.
     */
    @SerialName("items")
    val itemsPage: ItemsPage? = null,

    /**
     * Request hast next page or not.
     */
    @SerialName("has_next_page")
    val hasNextPage: Boolean? = null
)