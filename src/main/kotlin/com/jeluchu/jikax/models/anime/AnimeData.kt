package com.jeluchu.jikax.models.anime

import com.jeluchu.jikax.core.models.common.Images
import com.jeluchu.jikax.core.models.enums.AnimeType
import com.jeluchu.jikax.core.models.enums.Season
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * AnimeInfo data class.
 */
@Serializable
data class AnimeData(
    /**
     * ID associated with MyAnimeList.
     */
    @SerialName("mal_id")
    val malId: Int? = null,

    /**
     * Anime's MyAnimeList link.
     */
    @SerialName("url")
    val url: String? = null,

    /**
     * Anime's MyAnimeList cover/image link.
     * @see Images for the detail.
     */
    @SerialName("images")
    val images: Images? = null,

    /**
     * Anime's official trailer URL.
     * @see Trailer for the detail.
     */
    @SerialName("trailer")
    val trailer: Trailer? = null,

    /**
     * When entry is pending approval on MAL.
     */
    @SerialName("approved")
    val approved: Boolean? = null,

    /**
     * Title of the anime.
     * @see Title for the detail.
     */
    @SerialName("titles")
    val titles: List<Title>? = null,

    /**
     * Title of the anime.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerialName("title")
    val title: String? = null,

    /**
     * Title of the anime in English.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerialName("title_english")
    val titleEnglish: String? = null,

    /**
     * Title of the anime in Japanese.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerialName("title_japanese")
    val titleJapanese: String? = null,

    /**
     * List of anime's synonyms.
     * @return null if there's none.
     */
    @Deprecated("Use 'titles: List<Title>' to get the title")
    @SerialName("title_synonyms")
    val titleSynonyms: List<String>? = null,

    /**
     * Type of the anime.
     * @see AnimeType for the detail.
     */
    @SerialName("type")
    val type: AnimeType? = null,

    /**
     * Source of the anime.
     */
    @SerialName("source")
    val source : String? = null,

    /**
     * Total episode(s) of the anime.
     */
    @SerialName("episodes")
    val episodes: Int? = null,

    /**
     * Status of the anime (e.g "Airing", "Not yet airing", etc).
     */
    @SerialName("status")
    val status : String? = null,

    /**
     * Whether the anime is currently airing or not.
     */
    @SerialName("airing")
    val airing: Boolean? = null,

    /**
     * Interval of airing time in ISO8601 format.
     * @see Aired for the detail.
     * @return null if there's none
     */
    @SerialName("aired")
    val aired: Aired? = null,

    /**
     * Duration per episode.
     */
    @SerialName("duration")
    val duration : String? = null,

    /**
     * Age rating of the anime.
     */
    @SerialName("rating")
    val rating : String? = null,

    /**
     * Score at MyAnimeList. Formatted up to 2 decimal places.
     */
    @SerialName("score")
    val score: Float? = null,

    /**
     * Number of people/users that scored the anime.
     */
    @SerialName("scored_by")
    val scoredBy: Int? = null,

    /**
     * Anime's score rank on MyAnimeList.
     */
    @SerialName("rank")
    val rank: Int? = null,

    /**
     * Anime's popularity rank on MyAnimeList.
     */
    @SerialName("popularity")
    val popularity: Int? = null,

    /**
     * Anime's members count on MyAnimeList.
     */
    @SerialName("members")
    val members: Int? = null,

    /**
     * Anime's favorites count on MyAnimeList.
     */
    @SerialName("favorites")
    val favorites: Int? = null,

    /**
     * Synopsis of the anime.
     */
    @SerialName("synopsis")
    val synopsis : String? = null,

    /**
     * Background info of the anime.
     */
    @SerialName("background")
    val background : String? = null,

    /**
     * Season where anime premiered.
     * @see Season for the detail.
     */
    @SerialName("season")
    val season: Season? = null,

    /**
     * Year where anime premiered.
     */
    @SerialName("year")
    val year: Int? = null,

    /**
     * Broadcast date of the anime (day and time).
     * @see Broadcast for the detail.
     */
    @SerialName("broadcast")
    val broadcast: Broadcast? = null,

    /**
     * List of producers of this anime.
     * @see Producer for the detail.
     */
    @SerialName("producers")
    val producers: List<Producer>? = null,

    /**
     * List of licensors of this anime.
     * @see Licensor for the detail.
     */
    @SerialName("licensors")
    val licensors: List<Licensor>? = null,

    /**
     * List of studios of this anime.
     * @see Studio for the detail.
     *
     */
    @SerialName("studios")
    val studios: List<Studio>? = null,

    /**
     * List of genre of this anime.
     * @see Genre for the detail.
     */
    @SerialName("genres")
    val genres: List<Genre>? = null,

    /**
     * List of explicit genre of this anime.
     * @see ExplicitGenre for the detail.
     */
    @SerialName("explicit_genres")
    val explicitGenres: List<ExplicitGenre>? = null,

    /**
     * List of themes of this anime.
     * @see Themes for the detail.
     */
    @SerialName("themes")
    val themes: List<Themes>? = null,

    /**
     * Demographic of this anime.
     * @see Demographic for the detail.
     */
    @SerialName("demographics")
    val demographics: List<Demographic>? = null,

    /**
     * Relation of this anime.
     * @see Relation for the detail.
     */
    @SerialName("relations")
    val relations: List<Relation>? = null,

    /**
     * Theme of this anime.
     * @see Theme for the detail.
     */
    @SerialName("theme")
    val theme: Theme? = null,

    /**
     * Theme of this anime.
     * @see External for the detail.
     */
    @SerialName("external")
    val external: List<External>? = null,

    /**
     * Theme of this anime.
     * @see Streaming for the detail.
     */
    @SerialName("streaming")
    val streaming: List<Streaming>? = null
)