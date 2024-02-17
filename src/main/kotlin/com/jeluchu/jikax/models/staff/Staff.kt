package com.jeluchu.jikax.models.staff

import com.google.gson.annotations.SerializedName

/**
 * Staff data class.
 */
data class Staff(
    /**
     * Data list of all staff found.
     */
    @SerializedName("data")
    val data: List<StaffInfo>
)