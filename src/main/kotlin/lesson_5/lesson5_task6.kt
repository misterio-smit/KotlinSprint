package org.example.lesson_5

import kotlin.math.pow

fun main() {
    print("Введите свой вес в килограммах:")
    val userWeight = readLine()!!.toDouble()

    print("Введите свой рост в сантиметрах:")
    val userHeight = readLine()!!.toFloat() / 100

    val imt = userWeight / userHeight.pow(2)


    if (imt < IMT_MIN)
        println("Ваш ИМТ ${"%.2f".format(imt)}: Недостаточная масса тела")
    else if (IMT_MIN <= imt && imt < IMT_NORMAL)
        println("Ваш ИМТ ${"%.2f".format(imt)}: Нормальная масса тела")
    else if (IMT_NORMAL <= imt && imt < IMT_MAX)
        println("Ваш ИМТ ${"%.2f".format(imt)}: Избыточная масса тела")
    else if (imt >= IMT_MAX)
        println("Ваш ИМТ ${"%.2f".format(imt)}: Ожирение")


}

const val IMT_MIN = 18.5
const val IMT_NORMAL = 25.0
const val IMT_MAX = 30.0