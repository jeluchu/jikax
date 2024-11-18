package com.jeluchu.jikax.models.staff

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Staff data class.
 */
@Serializable
data class Staff(
    /**
     * Data list of all staff found.
     */
    @SerialName("data")
    val data: List<StaffInfo>
)