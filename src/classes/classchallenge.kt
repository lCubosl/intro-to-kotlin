package classes

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDeviceChallenge protected constructor(val name: String, val category: String, type: String) {
    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

// SMART TV
open class SmartTvDevice1(deviceName: String,  deviceCategory: String, deviceType: String):
SmartDeviceChallenge(name= deviceName, category = deviceCategory, type = deviceType) {
    override val deviceType = "Smart Tv"
    private var speakerVolume by RangeRegulator1(initialValue = 2, minValue = 0, maxValue = 100)
    private var channelNumber by RangeRegulator1(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Speaker volume increased to $speakerVolume")
    }

    override fun turnOn() {
        super.turnOn()
        deviceStatus = "on"
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        deviceStatus = "off"
        println("$name turned off")
    }
}

// SMART LIGHT DEVICE
class SmartLightDevice1(deviceName: String, deviceCategory: String, deviceType: String):
SmartDeviceChallenge(name= deviceName, category = deviceCategory, type = deviceType) {
    override val deviceType = "Smart Light"
    private var brightnessLevel by RangeRegulator1(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

class SmartHome1(
    val smartTvDevice: SmartTvDevice1,
    val smartLightDevice: SmartLightDevice1
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }
    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }
    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

class RangeRegulator1(
    initialValue:Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {
    var fieldData = initialValue

    override fun getValue(thisRef:Any?, property: KProperty<*>): Int {
        return fieldData
    }
    override fun setValue(thisRef:Any?, property: KProperty<*>, value: Int) {
        if(value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var smartDevice: SmartDeviceChallenge = SmartTvDevice1("Android Tv", "Entertainment", "Cat1")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice1("Google Light","Light","Cat2")
    smartDevice.turnOn()
}