package com.jeluchu.jikax.models.character

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.staff.Person

/**
 * VoiceActor data class.
 */
data class VoiceActor(
    /**
     * Person generic info
     * @see Person
     */
    @SerializedName("person")
    val person: Person?,

    /**
     * Language of the person.
     */
    @SerializedName("language")
    val language: String?
)