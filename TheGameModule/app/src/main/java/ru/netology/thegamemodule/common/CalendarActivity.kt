package ru.netology.thegamemodule.common

// ui/common/CalendarActivity.kt
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.netology.thegamemodule.databinding.ActivityCalendarBinding


class CalendarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}