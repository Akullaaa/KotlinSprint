package org.example.lesson1

fun main() {

	val totalSeconds = 6480
	val secondsPerMinute = 60
	val minutePerHour = 60
	val hours = totalSeconds / (secondsPerMinute * minutePerHour)
	val minutes = totalSeconds % (secondsPerMinute * minutePerHour) / secondsPerMinute
	val seconds = totalSeconds % secondsPerMinute

	println("%02d:%02d:%02d".format(hours,minutes,seconds))

}