package com.jeluchu.jikax.models.character

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.models.staff.Person

/**
 * VoiceActor data class.
 */
open class VoiceActor(
    /**
     * Person generic info
     * @see Person
     */
    @SerializedName("person")
    val person: Person = Person(),

    /**
     * Language of the person.
     */
    @SerializedName("language")
    val language: String = String.empty()
)