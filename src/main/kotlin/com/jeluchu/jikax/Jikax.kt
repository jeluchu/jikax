package com.jeluchu.jikax

import com.google.gson.GsonBuilder
import com.jeluchu.jikax.core.connection.RestClient
import com.jeluchu.jikax.core.models.base.Entity
import com.jeluchu.jikax.core.models.enums.Orders
import com.jeluchu.jikax.core.models.enums.Rating
import com.jeluchu.jikax.core.models.enums.SearchAnimeType
import com.jeluchu.jikax.core.models.enums.SeasonType
import com.jeluchu.jikax.core.models.enums.Sort
import com.jeluchu.jikax.core.models.enums.State
import com.jeluchu.jikax.core.models.enums.TopFilter
import com.jeluchu.jikax.core.utils.InterfaceAdapter
import com.jeluchu.jikax.core.utils.deserialize
import com.jeluchu.jikax.models.anime.Anime
import com.jeluchu.jikax.models.character.Characters
import com.jeluchu.jikax.models.schedule.Day
import com.jeluchu.jikax.models.schedule.Schedule
import com.jeluchu.jikax.models.schedule.ScheduleData
import com.jeluchu.jikax.models.search.Search
import com.jeluchu.jikax.models.seasons.Seasons
import com.jeluchu.jikax.models.staff.Staff

object Jikax {
    private var restClient = RestClient()
    private val gson = GsonBuilder().registerTypeAdapter(
        Entity::class.java, InterfaceAdapter<Entity>()
    ).create()

    /**
     * Function to get anime by it's MyAnimeList id
     * @param id: MyAnimeList id of the anime.
     * @return Anime with given MyAnimeList id.
     */
    suspend fun getAnime(id: Int) =
        gson.deserialize<Anime>(
            restClient.request("anime/$id/full"),
            Anime::class.java
        ).data

    /**
     * Function to get random anime
     * @return Random Anime information.
     */
    suspend fun getRandomAnime() =
        gson.deserialize<Anime>(
            restClient.request("random/anime"),
            Anime::class.java
        ).data

    /**
     * Function to get search animes by name
     * @param title Is a [String] Anime Title.
     * @param type Is a [SearchAnimeType] Available Anime types.
     * @param sfw Is a [Boolean] 'Safe For Work'. This is a flag.
     * @param unapproved Is a [Boolean] This is a flag. When supplied it will
     * include entries which are unapproved. Unapproved entries on MyAnimeList
     * are those that are user submitted and have not yet been approved by MAL
     * to show up on other pages. They will have their own specific pages and are
     * often removed resulting in a 404 error. You do not need to pass a value to it.
     * @param score Is a [Int] For search by score of anime.
     * @param minScore Is a [Int] Set a minimum score for results.
     * @param maxScore Is a [Int] Set a maximum score for results.
     * @param status Is a enum of [State] Available Anime statuses.
     * @param rating Is a enum of [Rating] Available Anime audience ratings.
     * @param genres Is a list of [String] Filter by genre(s) IDs. Can pass multiple
     * with a comma as a delimiter.
     * @param genresExclude Is a list of [String] Exclude genre(s) IDs. Can pass multiple
     * with a comma as a delimiter.
     * @param orderBy Is a enum of [Orders] Available Anime order_by properties.
     * @param sort Is a enum of [Sort] Search query sort direction.
     * @param letter Is a [String] Return entries starting with the given letter.
     * @param producers Is a [String] Filter by producer(s) IDs.
     * @param startDate Is a [String] Filter by starting date. Format: YYYY-MM-DD.
     * @param endDate Is a [String] Filter by ending date. Format: YYYY-MM-DD.
     * @param page Is a [Int] Page of request.
     *
     * @return Anime with all animes info.
     * @see Search
     */
    suspend fun getSearchAnime(
        title: String,
        type: SearchAnimeType? = null,
        sfw: Boolean? = null,
        unapproved: Boolean? = null,
        score: Int? = null,
        minScore: Int? = null,
        maxScore: Int? = null,
        status: State? = null,
        rating: Rating? = null,
        genres: List<String>? = null,
        genresExclude: List<String>? = null,
        orderBy: Orders? = null,
        sort: Sort? = null,
        letter: String? = null,
        producers: String? = null,
        startDate: String? = null,
        endDate: String? = null,
        page: Int = 1,
        limit: Int? = null,
    ): Search {
        val endpoint = "anime?q=$title"
        val params = mutableListOf<String>()

        type?.let { params.add("type=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        score?.let { params.add("score=$it") }
        minScore?.let { params.add("min_score=$it") }
        maxScore?.let { params.add("max_score=$it") }
        status?.let { params.add("status=$it") }
        rating?.let { params.add("rating=$it") }
        genres?.let { params.add("genres=${it.joinToString(separator = ",")}") }
        genresExclude?.let { params.add("genres_exclude=${it.joinToString(separator = ",")}") }
        orderBy?.let { params.add("order_by=$it") }
        sort?.let { params.add("sort=$it") }
        letter?.let { params.add("letter=$it") }
        producers?.let { params.add("producers=$it") }
        startDate?.let { params.add("start_date=$it") }
        endDate?.let { params.add("end_date=$it") }
        limit?.let { params.add("limit=$it") }
        params.add("page=$page")

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize(
            restClient.request(fullEndpoint),
            Search::class.java
        )
    }

    /**
     * Function to get staff of anime by it's MyAnimeList id
     * @param id: MyAnimeList id of the anime.
     * @return List of staff in anime.
     */
    suspend fun getStaff(id: Int) =
        gson.deserialize<Staff>(
            restClient.request("anime/$id/staff"),
            Staff::class.java
        ).data

    /**
     * Function to get characters of anime by it's MyAnimeList id
     * @param id: MyAnimeList id of the anime.
     * @return List of characters in anime.
     */
    suspend fun getCharacters(id: Int) =
        gson.deserialize<Characters>(
            restClient.request("anime/$id/characters"),
            Characters::class.java
        ).data

    /**
     * Function to get all anime schedule in this season.
     * @return List of day consist of anime list that airing on that day.
     */
    suspend fun getSchedule() = ScheduleData(
        monday = getSchedule(Day.MONDAY).data,
        tuesday = getSchedule(Day.TUESDAY).data,
        wednesday = getSchedule(Day.WEDNESDAY).data,
        thursday = getSchedule(Day.THURSDAY).data,
        friday = getSchedule(Day.FRIDAY).data,
        saturday = getSchedule(Day.SATURDAY).data,
        sunday = getSchedule(Day.SUNDAY).data
    )

    /**
     * Function to get all anime schedule in this season filtered by day.
     * @param day Is a [Day] to get all animes by day request.
     * @return List of anime that airing on that day.
     */
    suspend fun getSchedule(day: Day) =
        gson.deserialize<Schedule>(
            restClient.request("schedules/${day.name.lowercase()}"),
            Schedule::class.java
        )

    /**
     * Function to get all anime ranking.
     * @param filter Is a [TopFilter] Top items filter types.
     * @param type Is a [SearchAnimeType] Available Anime types.
     * @param rating Is a [Rating] Available Anime audience ratings.
     * @param sfw Is a [Boolean] Filter out Adult entries.
     * @param page Is a [Int] Page of request.
     * @param limit Is a [Int] Max elements for page.
     *
     * @return List of anime in order by rank.
     */
    suspend fun getAnimeTop(
        filter: TopFilter? = null,
        type: SearchAnimeType? = null,
        rating: Rating? = null,
        sfw: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): Search {
        val endpoint = "top/anime"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        type?.let { params.add("type=$it") }
        rating?.let { params.add("rating=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize(
            restClient.request(fullEndpoint),
            Search::class.java
        )
    }

    /**
     * Function to get all seasons.
     * @return List of year and seasons.
     */
    suspend fun getSeasons() =
        gson.deserialize<Seasons>(
            restClient.request("seasons"),
            Seasons::class.java
        )

    /**
     * Function to get all animes in current season.
     * @param filter Is a [SeasonType] Top items filter types.
     * @param sfw Is a [Boolean] Filter out Adult entries.
     * @param unapproved Is a [Boolean] This is a flag. When supplied it will
     * include entries which are unapproved. Unapproved entries on MyAnimeList
     * are those that are user submitted and have not yet been approved by MAL
     * to show up on other pages. They will have their own specific pages and are
     * often removed resulting in a 404 error. You do not need to pass a value to it.
     * @param page Is a [Int] Page of request.
     * @param limit Is a [Int] Max elements for page.
     *
     * @return List of animes.
     */
    suspend fun getSeasonNow(
        filter: SeasonType? = null,
        sfw: Boolean? = null,
        unapproved: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): Search {
        val endpoint = "seasons/now"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize(
            restClient.request(fullEndpoint),
            Search::class.java
        )
    }

    /**
     * Function to get all animes in current season.
     * @param year Is a [Int] Year of the season.
     * @param season Is a [String] Type of season (winter, spring, summer or fall).
     * @param filter Is a [SeasonType] Season items filter types.
     * @param sfw Is a [Boolean] Filter out Adult entries.
     * @param unapproved Is a [Boolean] This is a flag. When supplied it will
     * include entries which are unapproved. Unapproved entries on MyAnimeList
     * are those that are user submitted and have not yet been approved by MAL
     * to show up on other pages. They will have their own specific pages and are
     * often removed resulting in a 404 error. You do not need to pass a value to it.
     * @param page Is a [Int] Page of request.
     * @param limit Is a [Int] Max elements for page.
     *
     * @return List of animes.
     */
    suspend fun getSeason(
        year: Int,
        season: String,
        filter: String? = null,
        sfw: Boolean? = null,
        unapproved: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): Search {
        val endpoint = "seasons/$year/$season"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize(
            restClient.request(fullEndpoint),
            Search::class.java
        )
    }

    /**
     * Function to get all animes upcoming.
     * @param filter Is a [SeasonType] Season items filter types.
     * @param sfw Is a [Boolean] Filter out Adult entries.
     * @param unapproved Is a [Boolean] This is a flag. When supplied it will
     * include entries which are unapproved. Unapproved entries on MyAnimeList
     * are those that are user submitted and have not yet been approved by MAL
     * to show up on other pages. They will have their own specific pages and are
     * often removed resulting in a 404 error. You do not need to pass a value to it.
     * @param page Is a [Int] Page of request.
     * @param limit Is a [Int] Max elements for page.
     *
     * @return List of animes.
     */
    suspend fun getSeasonUpcoming(
        filter: String? = null,
        sfw: Boolean? = null,
        unapproved: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): Search {
        val endpoint = "seasons/upcoming"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize(
            restClient.request(fullEndpoint),
            Search::class.java
        )
    }
}