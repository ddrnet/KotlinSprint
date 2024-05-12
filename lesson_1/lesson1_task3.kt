fun main() {
    // Объявление переменных с явным указанием типа
    val year: String = "1961" // год полета Гагарина в космос

    var hour: String = "09" // час взлета
    var minute: String = "07" // минута взлета

    // Вывод времени взлета
    println("Время взлета:")
    println("Год: $year")
    println("Час: $hour")
    println("Минута: $minute")

    // Изменение времени на время посадки
    hour = "10"
    minute = "55"

    // Вывод времени посадки
    print("Время посадки: ")
    println("$hour:$minute")
}
