package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeStatistics(
    @SerialName("data")
    val data: Statistics? = null
) {
    @Serializable
    data class Statistics(
        @SerialName("completed")
        val completed: Int? = null,

        @SerialName("dropped")
        val dropped: Int? = null,

        @SerialName("on_hold")
        val onHold: Int? = null,

        @SerialName("plan_to_watch")
        val planToWatch: Int? = null,

        @SerialName("scores")
        val scores: List<Score>? = null,

        @SerialName("total")
        val total: Int? = null,

        @SerialName("watching")
        val watching: Int? = null
    )
}