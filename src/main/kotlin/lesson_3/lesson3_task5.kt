package org.example.lesson_3

fun main() {

    val dataString = "D2-D4;0"
    val dataSplit = dataString.split("-", ";")
    val from = dataSplit[0]
    val to = dataSplit[1]
    val moveNumber = dataSplit[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}