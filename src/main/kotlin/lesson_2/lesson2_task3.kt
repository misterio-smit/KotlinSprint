package org.example.lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    // Вычисляем общее количество минут с начала дня
    val totalDepartureMinutes = departureHour * 60 + departureMinute
    val totalArrivalMinutes = totalDepartureMinutes + travelTimeMinutes

    // Вычисляем часы и минуты прибытия с учётом перехода через сутки
    val arrivalHour = (totalArrivalMinutes / 60) % 24
    val arrivalMinute = totalArrivalMinutes % 60

    println("Поезд прибывает в ${arrivalHour.toString().padStart(2, '0')}:${arrivalMinute.toString().padStart(2, '0')}")
}