package com.jeluchu.jikax.models.schedule

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData

/**
 * Schedule data class.
 */
data class Schedule(

    /**
     * Data for anime requested.
     */
    @SerializedName("data")
    val data: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,
)