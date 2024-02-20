package com.jeluchu.jikax.core.exception

data class JikanException(override val message: String?, val code: Int? = null) : Exception()