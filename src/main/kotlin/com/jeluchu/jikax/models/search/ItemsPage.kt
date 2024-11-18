package com.jeluchu.jikax.models.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * ItemsPage data class.
 */
@Serializable
data class ItemsPage(
    /**
     * Count page.
     */
    @SerialName("count")
    val count: Int? = null,

    /**
     * Total items availables.
     */
    @SerialName("total")
    val total: Int? = null,

    /**
     * Total items per page.
     */
    @SerialName("per_page")
    val itemsPerPage: Int? = null
)