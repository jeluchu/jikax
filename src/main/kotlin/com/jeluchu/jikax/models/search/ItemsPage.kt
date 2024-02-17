package com.jeluchu.jikax.models.search

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.zero

/**
 * ItemsPage data class.
 */
data class ItemsPage(
    /**
     * Count page.
     */
    @SerializedName("count")
    val count: Int = Int.zero(),

    /**
     * Total items availables.
     */
    @SerializedName("total")
    val total: Int = Int.zero(),

    /**
     * Total items per page.
     */
    @SerializedName("per_page")
    val itemsPerPage: Int = Int.zero()
)