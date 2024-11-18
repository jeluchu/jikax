package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Aired data class.
 */
@Serializable
data class Aired(
    /**
     * Start date in ISO8601 format.
     */
    @SerialName("from")
    val from: String? = null,

    /**
     * @see Prop for the detail.
     */
    @SerialName("prop")
    val prop: Prop? = null,

    /**
     * End date in ISO8601 format.
     */
    @SerialName("to")
    val to: String? = null
)