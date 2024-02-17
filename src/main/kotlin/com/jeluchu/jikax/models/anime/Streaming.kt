package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Streaming data class.
 */
data class Streaming(
    /**
     * Name of streaming info.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Url of streaming info.
     */
    @SerializedName("url")
    val url: String = String.empty()
)