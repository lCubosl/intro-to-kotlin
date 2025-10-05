package fundamentals

fun main() {
    whenString("Red")
    whenInt(20)
}

fun whenString(trafficLightColor: String) : String {
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
    return trafficLightColor
}

fun whenInt(x: Any) : Any {
    when(x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
    return x
}