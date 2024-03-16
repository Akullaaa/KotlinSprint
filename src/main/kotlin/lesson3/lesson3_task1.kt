package org.example.lesson3

fun main() {

    val userName = "Груу"
    var greetings: String

    val greetingsForDay = "Добрый день, $userName"
    val greetingsForEvening = "Добрый вечер, $userName"

    greetings = greetingsForDay
    println(greetings)

    greetings = greetingsForEvening
    println(greetings)

}