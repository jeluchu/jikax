package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * DateProp data class.
 */
@Serializable
data class DateProp(
    /**
     * Day in date.
     */
    @SerialName("day")
    val day: Int? = null,

    /**
     * Month in date.
     */
    @SerialName("month")
    val month: Int? = null,

    /**
     * Year in date.
     */
    @SerialName("year")
    val year: Int? = null
)