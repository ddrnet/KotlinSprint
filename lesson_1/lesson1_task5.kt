fun main() {
    // Объявление переменной с количеством секунд, которые Гагарин провел в космосе
    val seconds: Int = 6480

    // Перевод секунд в целые минуты и часы
    val minutes: Int = seconds / 60
    val hours: Int = minutes / 60
    val remainingSeconds: Int = seconds % 60
    val remainingMinutes: Int = minutes % 60

    // Вывод времени, проведенного в космосе в формате [часы:минуты:секунды]
    println("Время, проведенное в космосе: ${"%02d".format(hours)}:${"%02d".format(remainingMinutes)}:${"%02d".format(remainingSeconds)}")
}