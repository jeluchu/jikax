package com.jeluchu.jikax.models.seasons

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Season data class.
 */
@Serializable
data class SeasonInfo(
    /**
     * Year for season
     */
    @SerialName("year")
    val year: Int? = null,

    /**
     * Seasons in the year
     */
    @SerialName("seasons")
    val seasons: List<String>? = null
)