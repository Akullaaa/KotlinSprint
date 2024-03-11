package org.example.lesson2

fun main() {

	val totalNumberOfPoints = 3 + 4 + 3 + 5
	val studentsCount = 4

	val averageScore = totalNumberOfPoints.toFloat() / studentsCount

	println("%.2f".format(averageScore))

}