package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Title data class.
 */
data class Title(
    /**
     * Title for anime.
     */
    @SerializedName("title")
    val title: String = String.empty(),

    /**
     * Title type for anime.
     */
    @SerializedName("type")
    val type: String = String.empty()
)