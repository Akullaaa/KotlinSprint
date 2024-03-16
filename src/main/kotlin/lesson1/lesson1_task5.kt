package org.example.lesson1

fun main() {

	val totalSecondsOfFly = 6480
	val secondsPerMinute = 60
	val minutePerHour = 60
	val hours = totalSecondsOfFly / (secondsPerMinute * minutePerHour)
	val minutes = totalSecondsOfFly % (secondsPerMinute * minutePerHour) / secondsPerMinute
	val seconds = totalSecondsOfFly % secondsPerMinute

	println("%02d:%02d:%02d".format(hours,minutes,seconds))

}