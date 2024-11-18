package com.jeluchu.jikax.models.character

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characters data class.
 */
@Serializable
data class Characters(
    /**
     * Data list of all staff found.
     */
    @SerialName("data")
    val data: List<CharacterInfo>
)