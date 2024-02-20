package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Theme data class.
 */
data class Theme(
    /**
     * List of endings.
     */
    @SerializedName("endings")
    val endings: List<String>?,

    /**
     * List of openings.
     */
    @SerializedName("openings")
    val openings: List<String>?
)