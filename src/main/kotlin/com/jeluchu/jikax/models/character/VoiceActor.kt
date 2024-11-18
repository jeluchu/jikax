package com.jeluchu.jikax.models.character

import com.jeluchu.jikax.models.staff.Person
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * VoiceActor data class.
 */
@Serializable
data class VoiceActor(
    /**
     * Person generic info
     * @see Person
     */
    @SerialName("person")
    val person: Person? = null,

    /**
     * Language of the person.
     */
    @SerialName("language")
    val language: String? = null
)