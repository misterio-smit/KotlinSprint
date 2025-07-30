package org.example.lesson_1


const val SECOND_IN_HOURS = 3600
const val MINUTE_IN_HOURS = 60

fun main() {

    val seconds: Int = 6480
    println("Время в полете ${formatDuration(seconds)}")
}

fun formatDuration(seconds: Int): String {
    val hours = seconds / SECOND_IN_HOURS
    val minutes = (seconds % SECOND_IN_HOURS) / MINUTE_IN_HOURS

    return "%d:%02d".format(hours, minutes)
}