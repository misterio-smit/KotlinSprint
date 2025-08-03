package org.example.lesson_4

fun main() {
    val isSunnyToday = true
    val isTentOpen = true
    val currentHumidity = 20
    val currentSeason = "зима"

    val favorableConditions = isSunnyToday == IS_SUNNY_TODAY
            && isTentOpen == IS_TENT_OPEN
            && currentHumidity == REQUIRED_HUMIDITY
            && currentSeason != UNFAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val IS_SUNNY_TODAY = true
const val IS_TENT_OPEN = true
const val REQUIRED_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"