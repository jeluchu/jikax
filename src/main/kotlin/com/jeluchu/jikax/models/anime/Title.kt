package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Title data class.
 */
data class Title(
    /**
     * Title for anime.
     */
    @SerializedName("title")
    val title: String,

    /**
     * Title type for anime.
     */
    @SerializedName("type")
    val type: String
)