package com.jeluchu.jikax.models.anime

import com.google.gson.annotations.SerializedName
import com.jeluchu.jikax.core.models.common.Images
import com.jeluchu.jikax.core.models.enums.AnimeType
import com.jeluchu.jikax.core.models.enums.Season
import com.jeluchu.jikax.models.base.Entity
import com.jeluchu.jikax.models.base.MalEntity

/**
 * AnimeInfo data class.
 */
data class AnimeData(
    /**
     * ID associated with MyAnimeList.
     */
    @SerializedName("mal_id")
    override val malId: Int,

    /**
     * Anime's MyAnimeList link.
     */
    @SerializedName("url")
    val url: String? = null,

    /**
     * Anime's MyAnimeList cover/image link.
     * @see Images for the detail.
     */
    @SerializedName("images")
    val images: Images? = null,

    /**
     * Anime's official trailer URL.
     * @see Trailer for the detail.
     */
    @SerializedName("trailer")
    val trailer: Trailer? = null,

    /**
     * When entry is pending approval on MAL.
     */
    @SerializedName("approved")
    val approved: Boolean? = null,

    /**
     * Title of the anime.
     * @see Title for the detail.
     */
    @SerializedName("titles")
    val titles: List<Title>? = null,

    /**
     * Title of the anime.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerializedName("title")
    val title: String? = null,

    /**
     * Title of the anime in English.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerializedName("title_english")
    val titleEnglish: String? = null,

    /**
     * Title of the anime in Japanese.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerializedName("title_japanese")
    val titleJapanese: String? = null,

    /**
     * List of anime's synonyms.
     * @return null if there's none.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerializedName("title_synonyms")
    val titleSynonyms: List<String?>? = null,

    /**
     * Type of the anime.
     * @see AnimeType for the detail.
     */
    @SerializedName("type")
    val type: AnimeType? = null,

    /**
     * Source of the anime.
     */
    @SerializedName("source")
    val source: String? = null,

    /**
     * Total episode(s) of the anime.
     */
    @SerializedName("episodes")
    val episodes: Int? = null,

    /**
     * Status of the anime (e.g "Airing", "Not yet airing", etc).
     */
    @SerializedName("status")
    val status: String? = null,

    /**
     * Whether the anime is currently airing or not.
     */
    @SerializedName("airing")
    val airing: Boolean? = null,

    /**
     * Interval of airing time in ISO8601 format.
     * @see Aired for the detail.
     * @return null if there's none
     */
    @SerializedName("aired")
    val aired: Aired? = null,

    /**
     * Duration per episode.
     */
    @SerializedName("duration")
    val duration: String? = null,

    /**
     * Age rating of the anime.
     */
    @SerializedName("rating")
    val rating: String? = null,

    /**
     * Score at MyAnimeList. Formatted up to 2 decimal places.
     */
    @SerializedName("score")
    val score: Float? = null,

    /**
     * Number of people/users that scored the anime.
     */
    @SerializedName("scored_by")
    val scoredBy: Int? = null,

    /**
     * Anime's score rank on MyAnimeList.
     */
    @SerializedName("rank")
    val rank: Int? = null,

    /**
     * Anime's popularity rank on MyAnimeList.
     */
    @SerializedName("popularity")
    val popularity: Int? = null,

    /**
     * Anime's members count on MyAnimeList.
     */
    @SerializedName("members")
    val members: Int? = null,

    /**
     * Anime's favorites count on MyAnimeList.
     */
    @SerializedName("favorites")
    val favorites: Int? = null,

    /**
     * Synopsis of the anime.
     */
    @SerializedName("synopsis")
    val synopsis: String? = null,

    /**
     * Background info of the anime.
     */
    @SerializedName("background")
    val background: String? = null,

    /**
     * Season where anime premiered.
     * @see Season for the detail.
     */
    @SerializedName("season")
    val season: Season? = null,

    /**
     * Year where anime premiered.
     */
    @SerializedName("year")
    val year: Int? = null,

    /**
     * Broadcast date of the anime (day and time).
     * @see Broadcast for the detail.
     */
    @SerializedName("broadcast")
    val broadcast: Broadcast? = null,

    /**
     * List of producers of this anime.
     * @see Producer for the detail.
     */
    @SerializedName("producers")
    val producers: List<Producer?>? = null,

    /**
     * List of licensors of this anime.
     * @see Licensor for the detail.
     */
    @SerializedName("licensors")
    val licensors: List<Licensor?>? = null,

    /**
     * List of studios of this anime.
     * @see Studio for the detail.
     *
     */
    @SerializedName("studios")
    val studios: List<Studio?>? = null,

    /**
     * List of genre of this anime.
     * @see Genre for the detail.
     */
    @SerializedName("genres")
    val genres: List<Genre?>? = null,

    /**
     * List of explicit genre of this anime.
     * @see ExplicitGenre for the detail.
     */
    @SerializedName("explicit_genres")
    val explicitGenres: List<ExplicitGenre?>? = null,

    /**
     * List of themes of this anime.
     * @see Themes for the detail.
     */
    @SerializedName("themes")
    val themes: List<Themes?>? = null,

    /**
     * Demographic of this anime.
     * @see Demographic for the detail.
     */
    @SerializedName("demographics")
    val demographics: List<Demographic?>? = null,

    /**
     * Relation of this anime.
     * @see Relation for the detail.
     */
    @SerializedName("relations")
    val relations: List<Relation?>? = null,

    /**
     * Theme of this anime.
     * @see Theme for the detail.
     */
    @SerializedName("theme")
    val theme: Theme? = null,

    /**
     * Theme of this anime.
     * @see External for the detail.
     */
    @SerializedName("external")
    val external: List<External>? = null,

    /**
     * Theme of this anime.
     * @see Streaming for the detail.
     */
    @SerializedName("streaming")
    val streaming: List<Streaming>? = null
) : Entity(), MalEntity