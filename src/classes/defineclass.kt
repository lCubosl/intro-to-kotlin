package classes

// Note: When you define the variable with the val keyword to reference the object, the variable itself is read-only,
// but the class object remains mutable. This means that you can't reassign another object to the variable,
// but you can change the object's state when you update its properties' values.

class SmartDevice {
    fun turnOn() {
        println("smart device is turned on.")
    }

    fun turnOff() {
        println("smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}
