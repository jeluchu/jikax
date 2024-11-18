package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Anime data class.
 */
@Serializable
data class Anime(

    /**
     * Data for anime requested.
     */
    @SerialName("data")
    val data: AnimeData
)