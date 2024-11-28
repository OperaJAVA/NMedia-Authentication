package ru.netology.thegamemodule.sport

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.netology.thegamemodule.R
import ru.netology.thegamemodule.model.Athlete

// ui/sport/AthleteActivity.kt
class AthleteActivity : AppCompatActivity() {
    private lateinit var athlete: Athlete

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athlete_card)

        // Предполагается, что данные о спортсмене передаются через Intent
        athlete = intent.getParcelableExtra<Athlete>(/* name = */ "athlete")!!

        findViewById<TextView>(R.id.athleteName).text = athlete.name
        findViewById<TextView>(R.id.athleteAge).text = "Age: ${athlete.age}"
        findViewById<TextView>(R.id.athleteStatistics).text = "Games Played: ${athlete.statistics.gamesPlayed}"
    }
}