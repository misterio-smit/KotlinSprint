package org.example.lesson_5

fun main() {
    val firstNumber = 32
    val secondNumber = 15

    println("Добро пожаловать в лотерею!")
    println("Попробуйте угадать два числа от 0 до 42")

    print("Введите первое число: ")
    val userNumber1 = readln().toInt()

    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    val guessedFirst = userNumber1 == firstNumber || userNumber1 == secondNumber
    val guessedSecond = userNumber2 == firstNumber || userNumber2 == secondNumber
    val totalGuessed = guessedFirst && guessedSecond && (userNumber1 != userNumber2)

    val result = when {
        totalGuessed -> "Поздравляем! Вы выиграли главный приз!"
        guessedFirst || guessedSecond -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println("\n$result")
    println("Для выигрыша нужно было угадать числа: $firstNumber и $secondNumber")
}