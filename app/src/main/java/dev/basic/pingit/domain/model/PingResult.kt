package dev.basic.pingit.domain.model

data class PingResult(
    val responseTimeMs: Long?,
    val statusCode: Int?,
    val timestamp: Long,
    val responded: Boolean
)