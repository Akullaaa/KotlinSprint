package org.example.lesson2

fun main() {
	val buff = 0.2
	val crystal = 7
	val iron = 11

	val buffCrystal = crystal * buff
	val buffIron = iron * buff

	println("Кристалическая руда: %.0f".format(buffCrystal))
	println("Железная руда: %.0f".format(buffIron))
}