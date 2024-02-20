package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Streaming data class.
 */
data class Streaming(
    /**
     * Name of streaming info.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Url of streaming info.
     */
    @SerializedName("url")
    val url: String?
)