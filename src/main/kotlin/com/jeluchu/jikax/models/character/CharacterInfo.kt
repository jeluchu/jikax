package com.jeluchu.jikax.models.character

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.models.staff.Person


/**
 * Characters data class.
 */
data class CharacterInfo(
    /**
     * Character generic info
     * @see Person
     */
    @SerializedName("character")
    val character: Person = Person(),

    /**
     * Role of the character.
     */
    @SerializedName("role")
    val role: String = String.empty(),

    /**
     * Role of the character.
     */
    @SerializedName("voice_actors")
    val voiceActor: List<VoiceActor> = emptyList()
)