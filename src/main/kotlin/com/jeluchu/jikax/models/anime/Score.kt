package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Score(
    @SerialName("percentage")
    val percentage: Double,

    @SerialName("score")
    val score: Int,

    @SerialName("votes")
    val votes: Int
)