package com.jeluchu.jikax.models.staff

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.models.common.Images
import com.jeluchu.jikax.core.utils.empty
import com.jeluchu.jikax.core.utils.zero
import com.jeluchu.jikax.models.anime.AnimeData

/**
 * Person  data class.
 */
data class Person(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    val malId: Int = Int.zero(),

    /**
     * Link to person in MAL.
     */
    @SerializedName("url")
    val url: String = String.empty(),

    /**
     * Name of person.
     */
    @SerializedName("name")
    val name: String = String.empty(),

    /**
     * Request hast next page or not.
     */
    @SerializedName("images")
    val images: Images = Images()
)