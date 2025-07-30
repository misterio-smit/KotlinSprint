package org.example.lesson_2


const val MINUTE_IN_HOURS = 60
const val HOURS_PER_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    // Вычисляем общее количество минут с начала дня
    val totalDepartureMinutes = departureHour * MINUTE_IN_HOURS + departureMinute
    val totalArrivalMinutes = totalDepartureMinutes + travelTimeMinutes

    // Вычисляем часы и минуты прибытия с учётом перехода через сутки
    val arrivalHour = (totalArrivalMinutes / MINUTE_IN_HOURS) % HOURS_PER_DAY
    val arrivalMinute = totalArrivalMinutes % MINUTE_IN_HOURS

    println("Поезд прибывает в ${arrivalHour.toString().padStart(2, '0')}:${arrivalMinute.toString().padStart(2, '0')}")
}