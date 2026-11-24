package dev.basic.pingit.domain.model

data class PingConfig(
    val website: Website,
    val intervalSeconds: Int,
    val durationSeconds: Int?
)