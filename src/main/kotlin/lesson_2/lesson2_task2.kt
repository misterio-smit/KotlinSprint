package org.example.lesson_2

fun main() {

    val permanentEmployees = 50
    val permanentSalary = 30_000
    val interns = 30
    val internSalary = 20_000

    val permanentExpenses = permanentEmployees * permanentSalary

    val totalExpenses = permanentExpenses + (interns * internSalary)

    val totalEmployees = permanentEmployees + interns

    val averageSalary = totalExpenses / totalEmployees

    println("Расходы на постоянных сотрудников: $permanentExpenses руб.")
    println("Общие расходы после прихода стажеров: $totalExpenses руб.")
    println("Средняя зарплата после устройства стажеров: $averageSalary руб.")
}