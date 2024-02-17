package com.jeluchu.jikax.models.schedule

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData
import com.jeluchu.jikax.models.base.Entity

data class ScheduleData(
    /**
     * All current season entries scheduled for Monday.
     */
    @SerializedName("monday")
    val monday: List<AnimeData> = emptyList(),

    /**
     * All current season entries scheduled for Tuesday.
     */
    @SerializedName("tuesday")
    val tuesday: List<AnimeData> = emptyList(),

    /**
     * All current season entries scheduled for Wednesday.
     */
    @SerializedName("wednesday")
    val wednesday: List<AnimeData> = emptyList(),

    /**
     * All current season entries scheduled for Thursday.
     */
    @SerializedName("thursday")
    val thursday: List<AnimeData> = emptyList(),

    /**
     * All current season entries scheduled for Friday.
     */
    @SerializedName("friday")
    val friday: List<AnimeData> = emptyList(),

    /**
     * All current season entries scheduled for Saturday.
     */
    @SerializedName("saturday")
    val saturday: List<AnimeData> = emptyList(),

    /**
     * All current season entries scheduled for Sunday.
     */
    @SerializedName("sunday")
    val sunday: List<AnimeData> = emptyList()
) : Entity()