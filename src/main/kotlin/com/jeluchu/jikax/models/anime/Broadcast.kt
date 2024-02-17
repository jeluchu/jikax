package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Broadcast data class.
 */
data class Broadcast(
    /**
     * Day in broadcast.
     */
    @SerializedName("day")
    val day: String = String.empty(),

    /**
     * String date in broadcast.
     */
    @SerializedName("string")
    val string: String = String.empty(),

    /**
     * Time date in broadcast.
     */
    @SerializedName("time")
    val time: String = String.empty(),

    /**
     * Timezone in broadcast.
     */
    @SerializedName("timezone")
    val timezone: String = String.empty()
)