package com.jeluchu.jikax

import com.jeluchu.jikax.core.models.enums.SeasonType
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class SeasonsTests {
    @Test
    fun `on getSeasons to return list of seasons`() {
        val result = runBlocking { Jikax.getSeasons() }
        assertTrue(result.data.isNotEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getSeasonNow to return list of animes in current season`() {
        val result = runBlocking { Jikax.getSeasonNow() }
        assertTrue(result.data.isNotEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getSeasonNow pass a filter to return list of movies`() {
        val filter = SeasonType.movie
        val result = runBlocking { Jikax.getSeasonNow(filter) }
        assertTrue(result.data.isNotEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getSeason pass a season and filter to return list data of season`() {
        val year = 2024
        val season = "winter"
        val result = runBlocking { Jikax.getSeason(year, season) }
        assertTrue(result.data.isNotEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getSeasonUpcoming pass a season and filter to return list data of season`() {
        val result = runBlocking { Jikax.getSeasonUpcoming() }
        assertTrue(result.data.isNotEmpty())
        runBlocking { delay(3000) }
    }

    companion object {
        @BeforeAll
        @JvmStatic
        internal fun setup() {
            Jikax
        }
    }
}