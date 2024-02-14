package com.jeluchu.jikax.core.exception

open class JikanException(override val message: String?, val code: Int? = null) : Exception()