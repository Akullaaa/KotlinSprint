package org.example.lesson2

fun main() {
	val workers = 50
	val workersSalary = 30000
	val interns = 30
	val internsSalary = 20000

	val emploeeSalaryExpenses = workers * workersSalary
	val internSalaryExpenses = interns * internsSalary
	val totalSalaryExpenses = emploeeSalaryExpenses + internSalaryExpenses
	val averageSalary = totalSalaryExpenses / (workers + interns)

	println(emploeeSalaryExpenses)
	println(totalSalaryExpenses)
	println(averageSalary)
}