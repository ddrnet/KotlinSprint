const val SECONDS_IN_SPACE: Int = 6480
const val SECONDS_IN_MINUTE: Int = 60
const val MINUTES_IN_HOUR: Int = 60

fun main() {
    // Перевод секунд в целые часы, минуты и секунды
    val hours: Int = SECONDS_IN_SPACE / SECONDS_IN_MINUTE / MINUTES_IN_HOUR
    val remainingMinutes: Int = (SECONDS_IN_SPACE / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR
    val remainingSeconds: Int = SECONDS_IN_SPACE % SECONDS_IN_MINUTE

    // Вывод времени, проведенного в космосе в формате [часы:минуты:секунды]
    println("Время, проведенное в космосе: ${"%02d".format(hours)}:${"%02d".format(remainingMinutes)}:${"%02d".format(remainingSeconds)}")
}
