package lesson_2

fun main() {
    val assessmentsEnglish = listOf(3, 4, 3, 5)
    val averageEnglish = assessmentsEnglish.sum() / assessmentsEnglish.size.toDouble()
    println(String.format("%.2f", averageEnglish))
}