package com.jeluchu.jikax

import com.jeluchu.jikax.core.models.common.ImageFormat
import com.jeluchu.jikax.core.models.common.Images
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import com.jeluchu.jikax.core.models.enums.AnimeType
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class AnimeTests {
    @Test
    fun `test anime with correct ID`() {
        val expected = com.jeluchu.jikax.models.anime.AnimeData(
            malId = 9253,
            url = "https://myanimelist.net/anime/9253/Steins_Gate",
            images = Images(
                jpg = ImageFormat(
                    generic = "https://cdn.myanimelist.net/images/anime/1935/127974.jpg",
                    small = "https://cdn.myanimelist.net/images/anime/1935/127974t.jpg",
                    large = "https://cdn.myanimelist.net/images/anime/1935/127974l.jpg"
                ),
                webp = ImageFormat(
                    generic = "https://cdn.myanimelist.net/images/anime/1935/127974.webp",
                    small = "https://cdn.myanimelist.net/images/anime/1935/127974t.webp",
                    large = "https://cdn.myanimelist.net/images/anime/1935/127974l.webp"
                )
            ),
            trailer = com.jeluchu.jikax.models.anime.Trailer(
                embedUrl = "https://www.youtube.com/embed/27OZc-ku6is?enablejsapi=1&wmode=opaque&autoplay=1",
                url = "https://www.youtube.com/watch?v=27OZc-ku6is",
                youtubeId = "27OZc-ku6is"
            ),
            titles = listOf(
                com.jeluchu.jikax.models.anime.Title(
                    title = "Steins;Gate",
                    type = "Default"
                ),
                com.jeluchu.jikax.models.anime.Title(
                    title = "STEINS;GATE",
                    type = "Japanese"
                ),
                com.jeluchu.jikax.models.anime.Title(
                    title = "Steins;Gate",
                    type = "English"
                )
            ),
            type = AnimeType.TV,
            source = "Visual novel",
            episodes = 24,
            status = "Finished Airing",
            airing = false
        )

        val result = runBlocking { Jikax.getAnime(9253) }
        assertEquals(expected.malId, result.malId)
        assertEquals(expected.titles, result.titles)
        assertEquals(expected.status, result.status)
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