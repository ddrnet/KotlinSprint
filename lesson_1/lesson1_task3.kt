fun main() {
    // Объявление переменных
    val year: Int = 1961 // год полета Гагарина в космос

    var hour: Int = 9 // час взлета
    var minute: Int = 7 // минута взлета

    // Вывод времени взлета
    println("Время взлета:")
    println("Год: $year")
    println("Час: $hour")
    println("Минута: $minute")

    // Изменение времени на время посадки
    hour = 10
    minute = 55

    // Вывод времени посадки
    println("Время посадки:")
    print("$hour:$minute")
}