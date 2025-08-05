package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(1, 11)
    val number2 = Random.nextInt(1, 11)
    val correctAnswer = number1 + number2

    print("Докажите, что вы не бот. Решите пример: $number1 + $number2 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}