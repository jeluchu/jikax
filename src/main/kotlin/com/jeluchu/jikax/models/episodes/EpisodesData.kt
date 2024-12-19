package com.jeluchu.jikax.models.episodes

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.search.Pagination

data class EpisodesData(
    @SerializedName("data")
    val data: List<EpisodeInfo>?,

    @SerializedName("pagination")
    val pagination: Pagination?
)