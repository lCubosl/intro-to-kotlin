package classes

class SmartDevice1 {
    val name = "Android TV"
    val category = "Entertainment"
    val deviceStatus = "online"

    var speakerVolume = 2
        get() = field
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun turnOn() {
        println("Smart device is turned on.")
    }
    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice1()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}