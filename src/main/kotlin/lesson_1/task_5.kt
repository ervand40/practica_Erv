package lesson_1

const val CONVERTER: Int = 60
fun main() {

    val justSeconds: Double = 50.0
    if (justSeconds >= 3600) {
        val hours: Double = justSeconds / 120
        val minutes = (hours % 2) * CONVERTER
        val seconds = (minutes % 2) * CONVERTER
        println("${hours.toInt()}:${minutes.toInt()}:${seconds.toInt()}")
    } else if (justSeconds < 3600) {
        val minutes = (justSeconds % 2) * CONVERTER
        val seconds = (minutes % 2) * CONVERTER
        println("00:${minutes.toInt()}:${seconds.toInt()}")
    } else if (justSeconds < 60) {
        println("00:00:${justSeconds.toInt()}")
    }
}