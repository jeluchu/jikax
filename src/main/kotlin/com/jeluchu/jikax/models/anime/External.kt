package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * External data class.
 */
data class External(
    /**
     * Name of external info.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Url of external info.
     */
    @SerializedName("url")
    val url: String?
)