package com.jeluchu.jikax

import com.jeluchu.jikax.models.schedule.Day
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class ScheduleTests {
    @Test
    fun `on getSchedule and return animes on air in the week`() {
        val result = runBlocking { Jikax.getSchedule() }
        assert(!result.monday.isNullOrEmpty())
        assert(!result.tuesday.isNullOrEmpty())
        assert(!result.wednesday.isNullOrEmpty())
        assert(!result.thursday.isNullOrEmpty())
        assert(!result.friday.isNullOrEmpty())
        assert(!result.saturday.isNullOrEmpty())
        assert(!result.sunday.isNullOrEmpty())
        runBlocking { delay(3000) }
    }

    @Test
    fun `on getSchedule with a Friday query and return animes on air in day`() {
        val result = runBlocking { Jikax.getSchedule(Day.FRIDAY) }
        assert(result.isNotEmpty())
        runBlocking { delay(3000) }
    }
}