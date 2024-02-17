package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.utils.empty

/**
 * Relation data class.
 */
data class Relation(
    /**
     * List of entries for relation in anime.
     * @see Entry for the detail.
     */
    @SerializedName("entry")
    val entry: List<Entry>,

    /**
     * Relation for anime
     */
    @SerializedName("relation")
    val relation: String = String.empty()
)