package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Theme data class.
 */
@Serializable
data class Theme(
    /**
     * List of endings.
     */
    @SerialName("endings")
    val endings: List<String>? = null,

    /**
     * List of openings.
     */
    @SerialName("openings")
    val openings: List<String>? = null
)