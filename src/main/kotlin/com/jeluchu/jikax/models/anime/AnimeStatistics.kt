package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

data class AnimeStatistics(
    @SerializedName("data")
    val data: Statistics?
) {
    data class Statistics(
        @SerializedName("completed")
        val completed: Int?,

        @SerializedName("dropped")
        val dropped: Int?,

        @SerializedName("on_hold")
        val onHold: Int?,

        @SerializedName("plan_to_watch")
        val planToWatch: Int?,

        @SerializedName("scores")
        val scores: List<Score>?,

        @SerializedName("total")
        val total: Int?,

        @SerializedName("watching")
        val watching: Int?
    )
}