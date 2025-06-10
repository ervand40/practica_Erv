package lesson_2

fun main() {
    val stateEmployees = 50;
    val stateSalary = 30000
    val intern = 30;
    val internSalary = 20000

    val paymentsStateEmployees = stateEmployees * stateSalary // оплата штатным сотрудникам
    val paymentsIntern = intern * internSalary // оплата стажерам
    val totalPayments = paymentsStateEmployees + paymentsIntern // всего требуется оплатить
    val averageSalary = totalPayments / (stateEmployees + intern) // средняя месячная зарплата одного сотрудника

    println("Штатных сотрудников:$stateEmployees; Стажеров: $intern;\nВсего требуется оплатить: $totalPayments;")
    println("Cредняя месячная зарплата одного сотрудника: $averageSalary")
}