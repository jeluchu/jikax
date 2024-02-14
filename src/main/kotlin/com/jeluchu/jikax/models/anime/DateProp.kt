package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * DateProp data class.
 */
data class DateProp(
    /**
     * Day in date.
     */
    @SerializedName("day")
    val day: Int,

    /**
     * Month in date.
     */
    @SerializedName("month")
    val month: Int,

    /**
     * Year in date.
     */
    @SerializedName("year")
    val year: Int
)