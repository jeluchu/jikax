package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Broadcast data class.
 */
data class Broadcast(
    /**
     * Day in broadcast.
     */
    @SerializedName("day")
    val day: String,

    /**
     * String date in broadcast.
     */
    @SerializedName("string")
    val string: String,

    /**
     * Time date in broadcast.
     */
    @SerializedName("time")
    val time: String,

    /**
     * Timezone in broadcast.
     */
    @SerializedName("timezone")
    val timezone: String
)