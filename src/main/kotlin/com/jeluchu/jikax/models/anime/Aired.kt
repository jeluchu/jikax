package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Aired data class.
 */
data class Aired(
    /**
     * Start date in ISO8601 format.
     */
    @SerializedName("from")
    val from: String = String.empty(),

    /**
     * @see Prop for the detail.
     */
    @SerializedName("prop")
    val prop: Prop = Prop(),

    /**
     * End date in ISO8601 format.
     */
    @SerializedName("to")
    val to: String = String.empty()
)