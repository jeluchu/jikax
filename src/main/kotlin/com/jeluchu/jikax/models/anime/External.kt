package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * External data class.
 */
data class External(
    /**
     * Name of external info.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Url of external info.
     */
    @SerializedName("url")
    val url: String = String.empty()
)