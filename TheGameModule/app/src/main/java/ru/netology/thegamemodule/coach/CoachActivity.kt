package ru.netology.thegamemodule.coach

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.thegamemodule.R
import ru.netology.thegamemodule.model.Coach

// ui/coach/CoachActivity.kt
class CoachActivity : AppCompatActivity() {
    private lateinit var coach: Coach

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coach)

        // Получение данных тренера и настройка интерфейса
    }
}