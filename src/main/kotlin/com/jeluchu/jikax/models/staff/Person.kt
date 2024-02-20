package com.jeluchu.jikax.models.staff

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.models.common.Images

/**
 * Person  data class.
 */
data class Person(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int?,

    /**
     * Link to person in MAL.
     */
    @SerializedName("url")
    val url: String?,

    /**
     * Name of person.
     */
    @SerializedName("name")
    val name: String?,

    /**
     * Request hast next page or not.
     */
    @SerializedName("images")
    val images: Images?
)