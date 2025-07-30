package org.example.lesson_2

fun main() {
    // количество добытых материалов без баффа
    val crystalsWithoutBuff = 7
    val ironWithBuff = 11

    // Рассчитываем бонусные материалы (20% от исходного количества)
    val cristalBonus = (crystalsWithoutBuff * 0.2).toInt()
    val ironBonus = (ironWithBuff * 0.2).toInt()

    println("Бонусные кристаллические руды: $cristalBonus")
    println("Бонусные железные руды: $ironBonus")
}