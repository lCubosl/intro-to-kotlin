package fundamentals

fun main() {
    val trafficLightColor = "Red"

    if (trafficLightColor == "Red") {
        println("STOP")
    } else if (trafficLightColor == "Yellow") {
        println("Slow down")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic light color")
    }
}