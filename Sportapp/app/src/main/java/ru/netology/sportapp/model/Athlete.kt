package ru.netology.sportapp.model

data class Athlete(
    val name: String,
    val age: Int,
    val height: Float,
    val weight: Float,
    val position: String,
    val team: String,
    var rating: Float
)