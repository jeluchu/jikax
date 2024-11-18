package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Streaming data class.
 */
@Serializable
data class Streaming(
    /**
     * Name of streaming info.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Url of streaming info.
     */
    @SerialName("url")
    val url: String? = null
)