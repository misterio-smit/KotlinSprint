package org.example.lesson_3

fun main() {

    // Первый ход: E2 -> E4
    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    val moveString = "[$from-$to;$moveNumber]"
    println(moveString)

    // Следующий ход белых: D2 -> D3
    from = "D2"
    to = "D3"
    moveNumber = 2

    val nextMoveString = "[$from-$to;$moveNumber]"
    println(nextMoveString)
}