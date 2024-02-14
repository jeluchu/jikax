package com.jeluchu.jikax.models.schedule

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.base.Entity
import com.jeluchu.jikax.models.anime.AnimeData

data class ScheduleData(
    /**
     * All current season entries scheduled for Monday.
     */
    @SerializedName("monday")
    val monday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,

    /**
     * All current season entries scheduled for Tuesday.
     */
    @SerializedName("tuesday")
    val tuesday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,

    /**
     * All current season entries scheduled for Wednesday.
     */
    @SerializedName("wednesday")
    val wednesday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,

    /**
     * All current season entries scheduled for Thursday.
     */
    @SerializedName("thursday")
    val thursday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,

    /**
     * All current season entries scheduled for Friday.
     */
    @SerializedName("friday")
    val friday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,

    /**
     * All current season entries scheduled for Saturday.
     */
    @SerializedName("saturday")
    val saturday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null,

    /**
     * All current season entries scheduled for Sunday.
     */
    @SerializedName("sunday")
    val sunday: List<com.jeluchu.jikax.models.anime.AnimeData?>? = null
) : Entity()