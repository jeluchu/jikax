package com.jeluchu.jikax.models.episodes

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EpisodeInfo(
    @SerialName("aired")
    val aired: String? = null,

    @SerialName("filler")
    val filler: Boolean? = null,

    @SerialName("forum_url")
    val forumUrl: String? = null,

    @SerialName("mal_id")
    val malId: Int? = null,

    @SerialName("recap")
    val recap: Boolean? = null,

    @SerialName("score")
    val score: Double? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("title_japanese")
    val titleJapanese: String? = null,

    @SerialName("title_romanji")
    val titleRomanji: String? = null,

    @SerialName("url")
    val url: String? = null
)