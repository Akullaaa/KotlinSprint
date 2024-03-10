package org.example.lesson2

fun main() {

	val amountOfPoints = 3 + 4 + 3 + 5
	val studentsCount = 4
	val averageScore = amountOfPoints.toFloat() / studentsCount
	println("%.2f".format(averageScore))
}