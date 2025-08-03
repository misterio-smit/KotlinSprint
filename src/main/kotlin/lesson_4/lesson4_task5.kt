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

    val canSail = (!hasDamage && crewCount
            in 55..70 &&
            foodSupply > 50 &&
            (isWeatherFavorable || !isWeatherFavorable)) ||
            (hasDamage && crewCount == 70 && isWeatherFavorable && foodSupply >= 50)

    println("Корабль может отправиться в плавание: $canSail")
}