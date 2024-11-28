package ru.netology.thegamemodule.parent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.thegamemodule.R
import ru.netology.thegamemodule.model.Parent

// ui/parent/ParentActivity.kt
class ParentActivity : AppCompatActivity() {
    private lateinit var parent: Parent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent)

        // Получение данных родителя и настройка интерфейса
    }
}