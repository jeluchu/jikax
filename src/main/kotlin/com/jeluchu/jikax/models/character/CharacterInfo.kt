package com.jeluchu.jikax.models.character

import com.jeluchu.jikax.models.staff.Person
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characters data class.
 */
@Serializable
data class CharacterInfo(
    /**
     * Character generic info
     * @see Person
     */
    @SerialName("character")
    val character: Person? = null,

    /**
     * Role of the character.
     */
    @SerialName("role")
    val role: String? = null,

    /**
     * Role of the character.
     */
    @SerialName("voice_actors")
    val voiceActor: List<VoiceActor>? = null
)