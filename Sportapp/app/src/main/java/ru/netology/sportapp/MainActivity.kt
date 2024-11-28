@file:Suppress("UNUSED_PARAMETER")

package ru.netology.sportapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import ru.netology.sportapp.model.Athlete
import ru.netology.sportapp.ui.AthleteCard

class MainActivity<LazyItemScope> : AppCompatActivity() {
    class SportAppTheme(function: @Composable Function<Unit>) {

    }

    private fun items(count: List<Athlete>, itemContent: @Composable LazyItemScope.(index: Int) -> Unit) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        SportAppTheme {
            Surface(color = MaterialTheme.colorScheme.background) {
                val athletes = listOf(
                    Athlete("Иван", 14, 160f, 50f, "Нападающий", "Команда А", 4.5f),
                    Athlete("Сергей", 15, 170f, 55f, "Защитник", "Команда Б", 4.7f),
                )
                LazyColumn {
                    items(athletes) { athlete ->
                        AthleteCard(athlete)


                    }
                }
            }
        }
    }
}