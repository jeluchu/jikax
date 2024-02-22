package com.jeluchu.jikax

import com.google.gson.GsonBuilder
import com.jeluchu.jikax.core.connection.RestClient
import com.jeluchu.jikax.core.models.base.Entity
import com.jeluchu.jikax.core.utils.InterfaceAdapter
import com.jeluchu.jikax.core.utils.deserialize
import com.jeluchu.jikax.models.anime.Anime
import com.jeluchu.jikax.models.anime.AnimeData
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
     * @param anime: MyAnimeList id of the anime.
     * @return Anime with all animes info.
     */
    suspend fun getSearchAnime(anime: String): List<AnimeData> {
        val response = gson.deserialize<Search>(
            restClient.request("anime?q=$anime"),
            Search::class.java
        )

        return response.data.toMutableList().apply {
            for (page in 2..(response.pagination.lastPage ?: 2)) {
                addAll(
                    gson.deserialize<Search>(
                        restClient.request("anime?q=$anime&page=$page"),
                        Search::class.java
                    ).data
                )
            }
        }
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
        monday = getSchedule(Day.MONDAY),
        tuesday = getSchedule(Day.TUESDAY),
        wednesday = getSchedule(Day.WEDNESDAY),
        thursday = getSchedule(Day.THURSDAY),
        friday = getSchedule(Day.FRIDAY),
        saturday = getSchedule(Day.SATURDAY),
        sunday = getSchedule(Day.SUNDAY)
    )

    /**
     * Function to get all anime schedule in this season filtered by day.
     * @return List of anime that airing on that day.
     */
    suspend fun getSchedule(day: Day) =
        gson.deserialize<Schedule>(
            restClient.request("schedules/${day.name.lowercase()}"),
            Schedule::class.java
        ).data

    /**
     * Function to get all anime ranking .
     * @return List of anime in order by rank.
     */
    suspend fun getAnimeTop(
        filter: String? = null,
        rating: String? = null,
        sfw: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): List<AnimeData> {
        val endpoint = "top/anime"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        rating?.let { params.add("rating=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize<Schedule>(
            restClient.request(fullEndpoint),
            Schedule::class.java
        ).data
    }

    /**
     * Function to get all seasons.
     * @return List of year and seasons.
     */
    suspend fun getSeasons() =
        gson.deserialize<Seasons>(
            restClient.request("seasons"),
            Seasons::class.java
        ).data

    /**
     * Function to get all animes in current season.
     * @return List of animes.
     */
    suspend fun getSeasonNow(
        filter: String? = null,
        sfw: Boolean? = null,
        unapproved: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): List<AnimeData> {
        val endpoint = "seasons/now"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize<Search>(
            restClient.request(fullEndpoint),
            Search::class.java
        ).data
    }

    /**
     * Function to get all animes in current season.
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
    ): List<AnimeData> {
        val endpoint = "seasons/$year/$season"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize<Search>(
            restClient.request(fullEndpoint),
            Search::class.java
        ).data
    }

    /**
     * Function to get all animes upcoming.
     * @return List of animes.
     */
    suspend fun getSeasonUpcoming(
        filter: String? = null,
        sfw: Boolean? = null,
        unapproved: Boolean? = null,
        page: Int? = null,
        limit: Int? = null
    ): List<AnimeData> {
        val endpoint = "seasons/upcoming"
        val params = mutableListOf<String>()

        filter?.let { params.add("filter=$it") }
        unapproved?.let { params.add("unapproved=$it") }
        sfw?.let { params.add("sfw=$it") }
        page?.let { params.add("page=$it") }
        limit?.let { params.add("limit=$it") }

        val fullEndpoint = if (params.isNotEmpty()) "$endpoint?${params.joinToString("&")}"
        else endpoint

        return gson.deserialize<Search>(
            restClient.request(fullEndpoint),
            Search::class.java
        ).data
    }
}