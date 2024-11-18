package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Broadcast data class.
 */
@Serializable
data class Broadcast(
    /**
     * Day in broadcast.
     */
    @SerialName("day")
    val day: String? = null,

    /**
     * String date in broadcast.
     */
    @SerialName("string")
    val string: String? = null,

    /**
     * Time date in broadcast.
     */
    @SerialName("time")
    val time: String? = null,

    /**
     * Timezone in broadcast.
     */
    @SerialName("timezone")
    val timezone: String? = null
)