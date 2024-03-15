package org.example.lesson3

fun main() {
    val sequenceNumberOfStroke = "D2-D4;0"

    val (move, nextNumber) = sequenceNumberOfStroke.split(";")
    val (fromPosition, toPosition) = move.split("-")

    println(fromPosition)
    println(toPosition)
    println(nextNumber)
}