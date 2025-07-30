package org.example.lesson_2


fun main() {
    // количество добытых материалов без баффа
    val crystalsWithoutBuff = 7
    val ironWithBuff = 11
    val buffPercentage = 20

    // Рассчитываем бонусные материалы (20% от исходного количества)
    val cristalBonus = (crystalsWithoutBuff * buffPercentage / 100)
    val ironBonus = (ironWithBuff * buffPercentage / 100)

    println("Бонусные кристаллические руды: $cristalBonus")
    println("Бонусные железные руды: $ironBonus")
}