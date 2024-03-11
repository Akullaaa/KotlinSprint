package org.example.lesson2

import kotlin.math.pow

fun main() {

	val amountOfDeposit = 70000
	val interestRate = 16.7
	val depositPeriodInYears = 20

	val totalAmountOfDeposit = amountOfDeposit * (1 + interestRate/100).pow(depositPeriodInYears)

	println("%.3f".format(totalAmountOfDeposit))

}