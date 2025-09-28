package `practice-problems`

fun main() {
    println(weather("Ankara", 27, 31, 82))
    println(weather("Tokyo", 32, 36, 10))
    println(weather("Cape Town", 59, 64, 2))
    println(weather("Guatemala City", 50, 55, 7))
}

fun weather(city: String, lowTemp: Int, highTemp: Int, rainChance: Int): String {
    return "City: $city\nLow temperature: $lowTemp, High temperature: $highTemp\nChance of rain: $rainChance\n"
}