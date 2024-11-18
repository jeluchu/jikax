package com.jeluchu.jikax.models.anime

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Relation data class.
 */
@Serializable
data class Relation(
    /**
     * List of entries for relation in anime.
     * @see Entry for the detail.
     */
    @SerialName("entry")
    val entry: List<Entry>? = null,

    /**
     * Relation for anime
     */
    @SerialName("relation")
    val relation: String? = null
)