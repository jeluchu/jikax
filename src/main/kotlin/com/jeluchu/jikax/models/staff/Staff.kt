package com.jeluchu.jikax.models.staff

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.anime.AnimeData
import com.jeluchu.jikax.models.search.Pagination

/**
 * Staff data class.
 */
data class Staff(
    /**
     * Data list of all staff found.
     */
    @SerializedName("data")
    val data: List<PersonInfo>
)