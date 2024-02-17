package com.jeluchu.jikax.models.staff

import com.google.gson.annotations.SerializedName


/**
 * PersonInfo data class.
 */
data class StaffInfo(
    /**
     * Character generic info
     * @see Person
     */
    @SerializedName("person")
    val person: Person = Person(),

    /**
     * Request hast next page or not.
     */
    @SerializedName("positions")
    val positions: List<String> = emptyList()
)