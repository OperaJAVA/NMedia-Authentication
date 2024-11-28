package ru.netology.sportapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AthleteCard(athlete: Int) {
    Card(
        modifier = Modifier.padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)  // Используем cardElevation
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(text = "Имя: ${athlete.name}", style = MaterialTheme.typography.titleLarge)
            Text(text = "Возраст: ${athlete.age}", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Рост: ${athlete.height} см", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Вес: ${athlete.weight} кг", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Позиция: ${athlete.position}", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Команда: ${athlete.team}", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Рейтинг: ${athlete.rating}", style = MaterialTheme.typography.bodyLarge)
        }
    }
}