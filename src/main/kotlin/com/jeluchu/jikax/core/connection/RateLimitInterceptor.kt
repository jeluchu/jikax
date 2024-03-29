package com.jeluchu.jikax.core.connection

import okhttp3.Interceptor
import okhttp3.Response

/**
 * See: https://jikan.docs.apiary.io/#introduction/http-response
 */
class RateLimitInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var response = chain.proceed(chain.request())

        if (!response.isSuccessful && response.code == 429) {
            runCatching { Thread.sleep(4000L) }
            response.close()
            response = chain.proceed(chain.request())
        }

        return response
    }
}