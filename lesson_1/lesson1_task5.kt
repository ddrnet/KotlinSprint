const val SECONDS_IN_SPACE: Int = 6480
const val SECONDS_IN_MINUTE: Int = 60
const val MINUTES_IN_HOUR: Int = 60

fun main() {
    val hours: Int = SECONDS_IN_SPACE / SECONDS_IN_MINUTE / MINUTES_IN_HOUR
    val remainingMinutes: Int = (SECONDS_IN_SPACE / SECONDS_IN_MINUTE) % MINUTES_IN_HOUR
    val remainingSeconds: Int = SECONDS_IN_SPACE % SECONDS_IN_MINUTE
    println("Время, проведенное в космосе: %02d:%02d:%02d".format(hours, remainingMinutes, remainingSeconds))
}
