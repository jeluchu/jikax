package com.jeluchu.jikax

import com.jeluchu.jikax.models.schedule.Day
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test

class ScheduleTests {
    @Test
    fun `om get current schedule`() {
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
    fun `test get friday schedule`() {
        val result = runBlocking { Jikax.getSchedule(Day.FRIDAY) }
        assert(!result.isNullOrEmpty())
        runBlocking { delay(3000) }
    }
}