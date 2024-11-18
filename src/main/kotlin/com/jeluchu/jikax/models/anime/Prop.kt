package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Prop data class.
 */
@Serializable
data class Prop(
    /**
     * Start date.
     * @see DateProp for the detail.
     */
    @SerialName("from")
    val from: DateProp? = null,

    /**
     * String with date.
     */
    @SerialName("string")
    val string: String? = null,

    /**
     * End date.
     * @see DateProp for the detail.
     */
    @SerialName("to")
    val to: DateProp? = null
)