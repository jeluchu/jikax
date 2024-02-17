package com.jeluchu.jikax

import com.google.gson.GsonBuilder
import com.jeluchu.jikax.core.connection.RestClient
import com.jeluchu.jikax.core.utils.InterfaceAdapter
import com.jeluchu.jikax.core.utils.deserialize
import com.jeluchu.jikax.models.anime.Anime
import com.jeluchu.jikax.models.anime.AnimeData
import com.jeluchu.jikax.models.base.Entity
import com.jeluchu.jikax.models.character.Characters
import com.jeluchu.jikax.models.schedule.Day
import com.jeluchu.jikax.models.schedule.Schedule
import com.jeluchu.jikax.models.schedule.ScheduleData
import com.jeluchu.jikax.models.search.Search
import com.jeluchu.jikax.models.staff.Staff

object Jikax {
    var restClient = RestClient()
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
            restClient.request("anime/$id"),
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
            for (page in 2..response.pagination.lastPage) {
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
        sunday = getSchedule(Day.SATURDAY)
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
}