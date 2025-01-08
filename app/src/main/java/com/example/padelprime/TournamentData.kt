package com.example.padelprime

data class TournamentData(
    val imageResource: Int,
    val name: String,
    val date: String,
    val description: String,
    val level: String,
    val gender: String,
    val duration: String,
    val price: Double,
    val durationInHours: Int,
    val levelInfo: String,
    val genderInfo: String,
    val durationInfo: String,
    val isStarted: Boolean
)
