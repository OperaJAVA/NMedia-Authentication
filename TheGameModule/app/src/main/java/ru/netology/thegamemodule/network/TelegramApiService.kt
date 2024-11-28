package ru.netology.thegamemodule.network

// network/TelegramApiService.kt
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class TelegramApiService(private val token: String) {
    val BASE_URL = "https://api.telegram.org/bot$token"

    fun sendMessage(chatId: String, text: String): Response {
        val url = "$BASE_URL/sendMessage?chat_id=$chatId&text=$text"

        val request = Request.Builder()
            .url(url)
            .build()

        return OkHttpClient().newCall(request).execute()
    }
}
