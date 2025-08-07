package org.example.lesson_5

fun main() {
    print("Введите расстояние поездки (км): ")
    val travelDistance = readLine()!!.toFloat()
    print("Введите расход топлива на 100 км (л): ")
    val fuelConsumption = readLine()!!.toFloat()
    print("Введите текущую цену за литр топлива: ")
    val fuelPrice = readLine()!!.toFloat()

    val fuelPerTrip = (travelDistance * fuelConsumption) / 100
    val totalPrice = fuelPerTrip * fuelPrice

    println("\nРезультаты расчета:")
    println("Необходимое количество топлива: ${"%.2f".format(fuelPerTrip)} л")
    println("Общая стоимость поездки: ${"%.2f".format(totalPrice)}")
}