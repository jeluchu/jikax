package com.jeluchu.jikax

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class TopTests {
    @Test
    fun `on getTop pass an anime type and filter return 25 anime top`() {
        val filter = "airing"
        val result = runBlocking { Jikax.getAnimeTop(filter) }
        assertEquals(25, result.size)
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getTop pass an anime type, filter and rating return 25 anime top`() {
        val filter = "airing"
        val rating = "pg13"
        val result = runBlocking { Jikax.getAnimeTop(filter, rating) }
        assertEquals(25, result.size)
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