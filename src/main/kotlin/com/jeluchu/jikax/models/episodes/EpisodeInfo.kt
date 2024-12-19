package com.jeluchu.jikax.models.episodes

import com.google.gson.annotations.SerializedName

data class EpisodeInfo(
    @SerializedName("aired")
    val aired: String?,

    @SerializedName("filler")
    val filler: Boolean?,

    @SerializedName("forum_url")
    val forum_url: String?,

    @SerializedName("mal_id")
    val mal_id: Int?,

    @SerializedName("recap")
    val recap: Boolean?,

    @SerializedName("score")
    val score: Double?,

    @SerializedName("title")
    val title: String?,

    @SerializedName("title_japanese")
    val titleJapanese: String?,

    @SerializedName("title_romanji")
    val titleRomanji: String?,

    @SerializedName("url")
    val url: String?
)