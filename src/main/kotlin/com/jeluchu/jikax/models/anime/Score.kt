package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

data class Score(
    @SerializedName("percentage")
    val percentage: Double,

    @SerializedName("score")
    val score: Int,

    @SerializedName("votes")
    val votes: Int
)