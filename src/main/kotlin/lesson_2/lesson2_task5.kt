package org.example.lesson_2

import kotlin.math.pow

fun main() {
    // Начальная сумма вклада (PV)
    val presentValue = 70_000.0

    // Годовая процентная ставка 16.7% (r)
    val rate = 16.7
    val annualRate = rate / 100

    // Срок вклада в годах (n)
    val years = 20

    // Расчёт по формуле сложных процентов: FV = PV * (1 + r)^n
    val finalAmount = presentValue * (1 + annualRate).pow(years)


    println("Размер вклада через $years лет: ${"%.3f".format(finalAmount)} руб.")


}