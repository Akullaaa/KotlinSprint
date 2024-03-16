package org.example.lesson4

fun  main() {
    val countOfReservation = 13
    val todayReservation = 13
    val tomorrowReservation = 9

    println("[Доступность столиков на сегодня: ${countOfReservation > todayReservation}]")
    println("[Доступность столиков на завтра: ${countOfReservation > tomorrowReservation}")
}