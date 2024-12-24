package com.jeluchu.jikax.models.episodes

import com.jeluchu.jikax.models.search.Pagination
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EpisodesData(
    @SerialName("data")
    val data: List<EpisodeInfo>? = null,

    @SerialName("pagination")
    val pagination: Pagination? = null
)