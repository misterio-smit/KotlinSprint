package org.example.lesson_5

import java.time.LocalDate

fun main() {

    print("Ведите год вашего рождения :")
    val userInputAge = readln().toInt()
    val currentYear = LocalDate.now().year
    val age = currentYear - userInputAge

    if (age >= AGE_OF_MAJORY) {
        println("Show special content")
    } else {
        println("Back to main screen")
    }
}

const val AGE_OF_MAJORY = 18