package com.jeluchu.jikax.models.character

import com.google.gson.annotations.SerializedName


/**
 * Characters data class.
 */
data class Characters(
    /**
     * Data list of all staff found.
     */
    @SerializedName("data")
    val data: List<CharacterInfo>
)