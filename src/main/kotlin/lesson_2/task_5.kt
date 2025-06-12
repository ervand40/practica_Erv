package lesson_2

import kotlin.math.pow

fun main() {
    val initialDepositAmount = 70000 // Размер первоначального вклада
    val depositTerm = 20             // Срок вклада
    val interestRate = 16.7 / 100    // Процентная ставка
    val totalDepositAmount = initialDepositAmount * (1 + interestRate).pow(depositTerm) // Итоговая сумма вклада
    println("Общая сумма, которую получит вкладчик: " + String.format("%.3f", totalDepositAmount))
}