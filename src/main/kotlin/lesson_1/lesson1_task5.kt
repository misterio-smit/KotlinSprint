package org.example.lesson_1

fun main() {

    val seconds: Int = 6480
    println("Время в полете ${formatDuration(seconds)}")
}

fun formatDuration(seconds: Int): String {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secs = seconds % 60
    return "%d:%02d:%02d".format(hours, minutes, secs)
}