package com.jeluchu.jikax.models.staff

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * PersonInfo data class.
 */
@Serializable
data class StaffInfo(
    /**
     * Character generic info
     * @see Person
     */
    @SerialName("person")
    val person: Person? = null,

    /**
     * Request hast next page or not.
     */
    @SerialName("positions")
    val positions: List<String>? = null
)