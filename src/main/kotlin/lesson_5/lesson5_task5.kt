package org.example.lesson_5

fun main() {

    val winningNumbers = List(3) { (0..48).random() }.sorted()

    println("Добро пожаловать в лотерею 'Три из сорока двух'!")
    println("Попробуйте угадать три числа от 0 до 42.")
    println("Введите три числа, каждое с новой строки:")

    val userNumbers = List(3) {
        print("Число ${it + 1}: ")
        readln().toInt()
    }.sorted()

    val matches = winningNumbers.intersect(userNumbers).size

    println("\nРезультаты:")
    when (matches) {
        3 -> println("Поздравляем! Вы угадали все три числа и выиграли ДЖЕКПОТ!")
        2 -> println("Отличный результат! Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("\nВыигрышные числа: ${winningNumbers.joinToString(", ")}")
    println("Ваши числа: ${userNumbers.joinToString(", ")}")
    println("\nСпасибо за участие! Попробуйте удачу в следующий раз!")
}