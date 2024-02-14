package com.jeluchu.jikax

import com.google.gson.GsonBuilder
import com.jeluchu.jikax.core.connection.RestClient
import com.jeluchu.jikax.core.utils.InterfaceAdapter
import com.jeluchu.jikax.core.utils.deserialize
import com.jeluchu.jikax.models.base.Entity

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
        gson.deserialize<com.jeluchu.jikax.models.anime.Anime>(
            restClient.request("anime/$id"),
            com.jeluchu.jikax.models.anime.Anime::class.java
        ).data

    /**
     * Function to get all anime schedule in this season.
     * @return List of day consist of anime list that airing on that day.
     */
    suspend fun getSchedule() = com.jeluchu.jikax.models.schedule.ScheduleData(
        monday = getSchedule(com.jeluchu.jikax.models.schedule.Day.MONDAY),
        tuesday = getSchedule(com.jeluchu.jikax.models.schedule.Day.TUESDAY),
        wednesday = getSchedule(com.jeluchu.jikax.models.schedule.Day.WEDNESDAY),
        thursday = getSchedule(com.jeluchu.jikax.models.schedule.Day.THURSDAY),
        friday = getSchedule(com.jeluchu.jikax.models.schedule.Day.FRIDAY),
        saturday = getSchedule(com.jeluchu.jikax.models.schedule.Day.SATURDAY),
        sunday = getSchedule(com.jeluchu.jikax.models.schedule.Day.SATURDAY)
    )

    /**
     * Function to get all anime schedule in this season filtered by day.
     * @return List of anime that airing on that day.
     */
    suspend fun getSchedule(day: com.jeluchu.jikax.models.schedule.Day) =
        gson.deserialize<com.jeluchu.jikax.models.schedule.Schedule>(
            restClient.request("schedules/${day.name.lowercase()}"),
            com.jeluchu.jikax.models.schedule.Schedule::class.java
        ).data
}