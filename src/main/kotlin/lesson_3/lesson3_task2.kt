package org.example.lesson_3

fun main() {
    val firstName = "Татьяна"
    val middleName = "Сергеевна"
    var lastName = "Андреева"
    var age = 20

    var fio = "$lastName $firstName $middleName , $age"
    println(fio)
    
    lastName = "Сидорова"
    age = 22
    fio = "$lastName $firstName $middleName , $age"
    println(fio)
}