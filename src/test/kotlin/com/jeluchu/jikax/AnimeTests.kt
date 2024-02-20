package com.jeluchu.jikax

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class AnimeTests {
    @Test
    fun `on getAnime pass a query and return animes data`() {
        val malId = 9253
        val title = "Steins;Gate"

        val result = runBlocking { Jikax.getAnime(9253) }
        assertEquals(malId, result.malId)
        assertEquals(title, result.titles)
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getSearchAnime pass a query and return list of animes`() {
        val result = runBlocking { Jikax.getSearchAnime("Steins;Gate") }
        assertTrue(result.isNotEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getStaff pass a query and return list of staff`() {
        val result = runBlocking { Jikax.getStaff(9253) }
        assertTrue(result.isNotEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getCharacters pass a query and return list of characters`() {
        val result = runBlocking { Jikax.getCharacters(9253) }
        assertTrue(result.isNotEmpty())
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