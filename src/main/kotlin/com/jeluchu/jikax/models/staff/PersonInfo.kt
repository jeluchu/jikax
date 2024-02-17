package com.jeluchu.jikax.models.staff

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.models.staff.Person


/**
 * PersonInfo data class.
 */
data class PersonInfo(
    /**
     * Character generic info
     * @see Person
     */
    @SerializedName("person")
    val person: Person,

    /**
     * Request hast next page or not.
     */
    @SerializedName("positions")
    val positions: List<String> = emptyList()
)