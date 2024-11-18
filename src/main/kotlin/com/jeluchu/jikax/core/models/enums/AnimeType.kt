package com.jeluchu.jikax.core.models.enums

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AnimeType {
    @SerialName("TV")
    TV,

    @SerialName("Movie")
    MOVIE,

    @SerialName("OVA")
    OVA,

    @SerialName("Special")
    SPECIAL,

    @SerialName("ONA")
    ONA,

    @SerialName("Music")
    MUSIC,

    @SerialName("CM")
    CM,

    @SerialName("PV")
    PV,

    @SerialName("TV Special")
    TV_SPECIAL
}