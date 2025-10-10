package classes

class SmartDeviceConstructor(val name: String, val category: String) {
    var deviceStatus = "onlilne"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}

fun main() {
    println()
}