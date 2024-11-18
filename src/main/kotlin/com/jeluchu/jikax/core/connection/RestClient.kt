package com.jeluchu.jikax.core.connection

import com.jeluchu.jikax.core.client.JikanClient
import com.jeluchu.jikax.core.exception.JikanException
import com.jeluchu.jikax.core.utils.Log
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.HttpHeaders
import io.ktor.http.headers
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.json.Json

/**
 * Class that handle request.
 * @param isDebug: a boolean that indicate if you run it on debug or not. If yes, it'll throw exception if something happen.
 * @param url: Custom URL, will use default (Jikan URL) if null or empty.
 */
class RestClient(
    private val url: String? = null,
    private val isDebug: Boolean = false
) : JikanClient() {
    private val client = httpClient
    private val json = Json { ignoreUnknownKeys = true }
    private val usedURL = if (url.isNullOrEmpty()) BASE_URL else url

    suspend fun <T> request(
        endPoint: String,
        deserializer: DeserializationStrategy<T>
    ): T {
        return runCatching {
            val response = client.get(usedURL + endPoint) {
                headers { append(HttpHeaders.Accept, "application/json") }
            }

            if (response.status.value !in 200..299) {
                if (response.status.value in 500..599) {
                    val ex = Exception("An internal server error has occurred, code: ${response.status.value}")
                    if (isDebug) throw ex else exceptionHandler(ex)
                } else {
                    val ex = JikanException(
                        "Jikan API returns code ${response.status.value} and body ${response.bodyAsText()}",
                        response.status.value
                    )

                    if (isDebug) throw ex else exceptionHandler(ex)
                }
            }

            json.decodeFromString(deserializer, response.bodyAsText())
        }.getOrElse { throwable -> throw throwable }
    }

    private fun exceptionHandler(ex: Exception, message: String? = null) {
        if (message.isNullOrEmpty()) Log.error("Something went wrong! Exception: ${ex.localizedMessage}")
        else Log.error(ex, "Something went wrong! Exception: ${ex.localizedMessage}")
    }

    companion object {
        const val BASE_URL = "https://api.jikan.moe/v4/"
    }
}