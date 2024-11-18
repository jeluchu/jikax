package com.jeluchu.jikax.models.staff

import com.jeluchu.jikax.core.models.common.Images
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Person  data class.
 */
@Serializable
data class Person(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Link to person in MAL.
     */
    @SerialName("url")
    val url: String? = null,

    /**
     * Name of person.
     */
    @SerialName("name")
    val name: String? = null,

    /**
     * Request hast next page or not.
     */
    @SerialName("images")
    val images: Images? = null
)