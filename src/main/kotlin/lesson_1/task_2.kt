package lesson_1

fun main() {

    val pieceOrders: Int = 75
    println("Всего обработано $pieceOrders заказов")

    val gratitudeBuy: String = "Спасибо за покупку! Будем рады видеть Вас!"
    //println(gratitudeBuy)

    var storeEmployees: Int = 2000
    //println("В штате фирмы $storeEmployees человек")

    val willQuitSoon = 1
    storeEmployees = storeEmployees - willQuitSoon
    println("Количество сотрудников с учетом предстоящего уволнения составляет:$storeEmployees")

}