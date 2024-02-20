package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Prop data class.
 */
data class Prop(
    /**
     * Start date.
     * @see DateProp for the detail.
     */
    @SerializedName("from")
    val from: DateProp?,

    /**
     * String with date.
     */
    @SerializedName("string")
    val string: String?,

    /**
     * End date.
     * @see DateProp for the detail.
     */
    @SerializedName("to")
    val to: DateProp?
)