package com.jeluchu.jikax.models.seasons

import com.jeluchu.jikax.models.search.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Season data class.
 */
@Serializable
data class Seasons(
    /**
     * Pagination info for request
     */
    @SerialName("pagination")
    val pagination: Pagination? = null,

    /**
     * Data list of all anime found.
     */
    @SerialName("data")
    val data: List<SeasonInfo>? = null
)