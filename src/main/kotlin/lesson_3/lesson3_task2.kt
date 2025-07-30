package org.example.lesson_3

fun main() {
    val firstName = "Татьяна"
    val middleName = "Сергеевна"
    val lastNameAt20 = "Андреева"
    val lastNameAt22 = "Сидорова"
    val ageAt20 = 20
    val ageAt22 = 22

    // ФИО до замужества
    val fioAt20 = "$lastNameAt20 $firstName $middleName , $ageAt20"
    println(fioAt20)

    // ФИО после замужества
    val fioAt22 = "$lastNameAt22 $firstName $middleName , $ageAt22"
    println(fioAt22)
}