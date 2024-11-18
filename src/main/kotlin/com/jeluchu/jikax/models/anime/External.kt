package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * External data class.
 */
@Serializable
data class External(
    /**
     * Name of external info.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Url of external info.
     */
    @SerialName("url")
    val url: String? = null
)