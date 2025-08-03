package org.example.lesson_4

fun main() {

    val favorableConditions = IS_SUNNY_WEATHER && IS_TENT_OPEN && HUMIDITY == 20 && CURREN_SEASON != "не зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}

const val IS_SUNNY_WEATHER = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val CURREN_SEASON = "не зима"