package lesson_2

fun main() {
    val ironOreNoBuff = 11                  // Железная руды в наличии
    val crystalOreNoBuff = 7                // Кристаллическая руды в наличии
    val buffPercentage: Double = 20.0 / 100 // Процент бафа
    val ironBuff = ironOreNoBuff * buffPercentage         // Железная руда баф
    val crystalBuff = crystalOreNoBuff * buffPercentage  // Кристаллическая руда баф
    println("Железной руды бонус - ${ironBuff.toInt()} Итого: ${(ironOreNoBuff + ironBuff).toInt()}")
    println("Кристаллической руды бонус - ${crystalBuff.toInt()} Итого: ${(crystalOreNoBuff + crystalBuff).toInt()}")
}