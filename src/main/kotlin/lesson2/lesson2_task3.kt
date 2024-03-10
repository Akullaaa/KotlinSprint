package org.example.lesson2

fun main() {
	val departureHour = 9
	val departureMinute = 39
	val travelTime = 457
	val minutesPerHour = 60

	val arrivalInMinutes = departureHour * minutesPerHour + departureMinute + travelTime
	val arrivalHour = arrivalInMinutes / minutesPerHour
	val arrivalMinute = arrivalInMinutes % minutesPerHour

	println("$arrivalHour:$arrivalMinute")
}