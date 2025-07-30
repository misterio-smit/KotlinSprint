package org.example.lesson_2

//процент бафа
const val BUFF_PERCENTAGE = 0.2

fun main() {
    // количество добытых материалов без баффа
    val crystalsWithoutBuff = 7
    val ironWithBuff = 11

    // Рассчитываем бонусные материалы (20% от исходного количества)
    val cristalBonus = (crystalsWithoutBuff * BUFF_PERCENTAGE).toInt()
    val ironBonus = (ironWithBuff * BUFF_PERCENTAGE).toInt()

    println("Бонусные кристаллические руды: $cristalBonus")
    println("Бонусные железные руды: $ironBonus")
}