package com.jeluchu.jikax.models.schedule

import com.jeluchu.jikax.models.anime.AnimeData
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ScheduleData(
    /**
     * All current season entries scheduled for Monday.
     */
    @SerialName("monday")
    val monday: List<AnimeData>? = null,

    /**
     * All current season entries scheduled for Tuesday.
     */
    @SerialName("tuesday")
    val tuesday: List<AnimeData>? = null,

    /**
     * All current season entries scheduled for Wednesday.
     */
    @SerialName("wednesday")
    val wednesday: List<AnimeData>? = null,

    /**
     * All current season entries scheduled for Thursday.
     */
    @SerialName("thursday")
    val thursday: List<AnimeData>? = null,

    /**
     * All current season entries scheduled for Friday.
     */
    @SerialName("friday")
    val friday: List<AnimeData>? = null,

    /**
     * All current season entries scheduled for Saturday.
     */
    @SerialName("saturday")
    val saturday: List<AnimeData>? = null,

    /**
     * All current season entries scheduled for Sunday.
     */
    @SerialName("sunday")
    val sunday: List<AnimeData>? = null
)