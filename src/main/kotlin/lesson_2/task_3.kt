package lesson_2


import java.time.LocalTime

const val CONVERT = 60
fun main() {
    val travelTime = 120                            // минут в пути
    val timeOutHour = 9                             // час убытия
    val timeOutMinutes = 39                         // минут убытия
    val timeOutInMinutes = timeOutHour * CONVERT + timeOutMinutes // время убытия в минутах
    val sumMinutes = travelTime + timeOutInMinutes  // сумма минут
    val timeHour = sumMinutes / CONVERT             // время прибытия час
    val timeMinutes = sumMinutes % CONVERT          // время прибытия минут
    val time = LocalTime.now()
    val arrivalTime = LocalTime.of(timeHour, timeMinutes)
    println("Время прибытия - $arrivalTime")
}