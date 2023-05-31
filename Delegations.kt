///*
// * Copyright (c) 2023. , Sunshine.Code <sunshinethelearningsite@gmail.com>
// *   License: MIT
// * The MIT License (MIT).
// * Copyright © 2023, Sunshine.Code <sunshinethelearningsite@gmail.com>
// *   Permission is hereby granted, free of charge, to any person obtaining a copy   of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: .The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
// *  .
// *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
// */
//
////class Delegations {
////}
//import kotlin.properties.ReadWriteProperty
//import kotlin.reflect.KProperty
//
//open class SmartDevice(val name: StringClass, val category: StringClass) {
//
//    var deviceStatus = "online"
//        protected set
//
//    open val deviceType = "unknown"
//
//    open fun turnOn() {
//        deviceStatus = "on"
//    }
//
//    open fun turnOff() {
//        deviceStatus = "off"
//    }
//}
//
//class SmartTvDevice(deviceName: StringClass, deviceCategory: StringClass) :
//    SmartDevice(name = deviceName, category = deviceCategory) {
//
//    override val deviceType = "Smart TV"
//
//    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
//    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)
//
//    override fun turnOn() {
//        super.turnOn()
//        println(
//            "$name is turned on. Speaker volume set to $speakerVolume and channel number is " +
//                    "set to $channelNumber."
//        )
//    }
//
//    override fun turnOff() {
//        super.turnOff()
//        println("$name turned off")
//    }
//
//    fun increaseSpeakerVolume() {
//        speakerVolume++
//        println("Speaker volume increased to $speakerVolume.")
//    }
//
//    fun nextChannel() {
//        channelNumber++
//        println("Channel number increased to $channelNumber.")
//    }
//}
//
//class SmartLightDevice(deviceName: StringClass, deviceCategory: StringClass) :
//    SmartDevice(name = deviceName, category = deviceCategory) {
//
//    override val deviceType = "Smart Light"
//    private var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
//
//    override fun turnOn() {
//        super.turnOn()
//        brightnessLevel = 2
//        println("$name is turned on. The brightness level is $brightnessLevel.")
//    }
//
//    override fun turnOff() {
//        super.turnOff()
//        brightnessLevel = 0
//        println("$name turned off")
//    }
//
//    fun increaseBrightness() {
//        brightnessLevel++
//        println("Brightness increased to $brightnessLevel.")
//    }
//}
//
//class SmartHome(val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice) {
//
//    var deviceTurnOnCount = 0
//        private set
//
//    fun turnOnTv() {
//        deviceTurnOnCount++
//        smartTvDevice.turnOn()
//    }
//
//    fun turnOffTv() {
//        deviceTurnOnCount--
//        smartTvDevice.turnOff()
//    }
//
//    fun increaseTvVolume() {
//        smartTvDevice.increaseSpeakerVolume()
//    }
//
//    fun changeTvChannelToNext() {
//        smartTvDevice.nextChannel()
//    }
//
//    fun turnOnLight() {
//        deviceTurnOnCount++
//        smartLightDevice.turnOn()
//    }
//
//    fun turnOffLight() {
//        deviceTurnOnCount--
//        smartLightDevice.turnOff()
//    }
//
//    fun increaseLightBrightness() {
//        smartLightDevice.increaseBrightness()
//    }
//
//    fun turnOffAllDevices() {
//        turnOffTv()
//        turnOffLight()
//    }
//}
//
//class RangeRegulator(
//    initialValue: Int,
//    private val minValue: Int,
//    private val maxValue: Int
//) : ReadWriteProperty<Any?, Int> {
//
//    private var fieldData = initialValue
//    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
//        return  fieldData
//    }
//
//    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
//        if (value in minValue..maxValue) {
//            fieldData = value
//        }
//    }
//
//
//}
//
//fun main() {
//    val smartHome = SmartHome(
//        SmartTvDevice(deviceName = "Android TV", deviceCategory = "Entertainment"),
//        SmartLightDevice(deviceName = "Google light", deviceCategory = "Utility")
//    )
//
//    smartHome.turnOnTv()
//    smartHome.turnOnLight()
//    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}")
//    println()
//
//    smartHome.increaseTvVolume()
//    smartHome.changeTvChannelToNext()
//    smartHome.increaseLightBrightness()
//    println()
//
//    smartHome.turnOffAllDevices()
//    println("Total number of devices currently turned on: ${smartHome.deviceTurnOnCount}.")
//}