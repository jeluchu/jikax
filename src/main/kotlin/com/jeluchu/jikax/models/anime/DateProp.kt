package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.zero

/**
 * DateProp data class.
 */
data class DateProp(
    /**
     * Day in date.
     */
    @SerializedName("day")
    val day: Int = Int.zero(),

    /**
     * Month in date.
     */
    @SerializedName("month")
    val month: Int = Int.zero(),

    /**
     * Year in date.
     */
    @SerializedName("year")
    val year: Int = Int.zero()
)