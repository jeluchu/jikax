package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Aired data class.
 */
data class Aired(
    /**
     * Start date in ISO8601 format.
     */
    @SerializedName("from")
    val from: String,

    /**
     * @see Prop for the detail.
     */
    @SerializedName("prop")
    val prop: com.jeluchu.jikax.models.anime.Prop,

    /**
     * End date in ISO8601 format.
     */
    @SerializedName("to")
    val to: String
)