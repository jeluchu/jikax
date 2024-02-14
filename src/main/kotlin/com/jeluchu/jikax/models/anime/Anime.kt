package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Anime data class.
 */
data class Anime(

    /**
     * Data for anime requested.
     */
    @SerializedName("data")
    val data: com.jeluchu.jikax.models.anime.AnimeData
)