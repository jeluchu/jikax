package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Prop data class.
 */
data class Prop(
    /**
     * Start date.
     * @see DateProp for the detail.
     */
    @SerializedName("from")
    val from: DateProp = DateProp(),

    /**
     * String with date.
     */
    @SerializedName("string")
    val string: String = String.empty(),

    /**
     * End date.
     * @see DateProp for the detail.
     */
    @SerializedName("to")
    val to: DateProp = DateProp()
)