package org.example.lesson_4

fun main() {
    println("Введите данные для проверки готовности корабля:")

    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crewCount = readln().toInt()

    print("Количество ящиков с провизией: ")
    val foodSupply = readln().toInt()

    print("Благоприятны ли метеоусловия (true/false): ")
    val isWeatherFavorable = readln().toBoolean()

    val canSail = (!hasDamage
            && crewCount in CREW_COUNT_MIN..CREW_COUNT_MAX
            && foodSupply > FOOD_SUPPLY)
            || (hasDamage
            && crewCount == CREW_COUNT_MAX
            && isWeatherFavorable == IS_WEATHER_FAVORABLE
            && foodSupply >= FOOD_SUPPLY)

    println("Корабль может отправиться в плавание: $canSail")
}

const val CREW_COUNT_MIN = 55
const val CREW_COUNT_MAX = 70
const val FOOD_SUPPLY = 50
const val IS_WEATHER_FAVORABLE = true