package ru.netology.thegamemodule.model
import android.os.Parcel
import android.os.Parcelable
// model/Athlete.kt
public final data class Athlete(
    val id: String,
    val name: String,
    val age: Int,
    val height: Float,
    val weight: Float,
    val position: String,
    val team: String,
    val statistics: Statistics
)

data class Statistics(
    val gamesPlayed: Int,
    val scores: Int,
    val assists: Int,
    val progress: List<String> // Заполнить в процессе
)
