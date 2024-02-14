package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName

/**
 * Relation data class.
 */
data class Relation(
    /**
     * List of entries for relation in anime.
     * @see Entry for the detail.
     */
    @SerializedName("entry")
    val entry: List<com.jeluchu.jikax.models.anime.Entry>,

    /**
     * Relation for anime
     */
    @SerializedName("relation")
    val relation: String
)