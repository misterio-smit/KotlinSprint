package org.example.lesson_4

fun main() {
    var trainingDay = 5

    val isArmsDay = trainingDay % 2 == 1
    val isLegsDay = !isArmsDay
    val isBackDay = !isArmsDay
    val isAbsDay = isArmsDay

    println(
        "Упражнения для рук:    \t$isArmsDay\n"
                + "Упражнения для ног:    \t$isLegsDay\n"
                + "Упражнения для спины:  \t$isBackDay\n"
                + "Упражнения для пресса: \t$isAbsDay"
    )
}