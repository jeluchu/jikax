package com.jeluchu.jikax.models.seasons

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData
import com.jeluchu.jikax.models.search.Pagination

/**
 * Season data class.
 */
data class SeasonInfo(
    /**
     * Year for season
     */
    @SerializedName("year")
    val year: Int?,

    /**
     * Seasons in the year
     */
    @SerializedName("seasons")
    val seasons: List<String>?
)