package lesson_3

import java.util.Date

fun main() {
    val user = "Игорь! "
    val helloDay = "Добрый день! Вход в Сбербанк"
    val helloEvening = "Добрый вечер! Вход в Сбербанк"
    val time = 17
    val hello = if (time >= 18) println(user + helloEvening) else println(user + helloDay)

}