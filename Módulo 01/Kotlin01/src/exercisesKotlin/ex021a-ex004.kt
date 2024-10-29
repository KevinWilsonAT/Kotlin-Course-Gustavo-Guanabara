package exercisesKotlin
import kotlin.math.pow

fun main(args: Array<String>) {

    val colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tPOWERING")
    println("----------------------------------------")

    print(colorSet.Reset)
    print("Base: > ")
    val base:Float = readLine()!!.toFloatOrNull()?:0f
    print("Exponent: > ")
    val exponent:Float = readLine()!!.toFloatOrNull()?:0f
    println("\n")
    val power:Double = Math.pow(base.toDouble(), exponent.toDouble())

    print(colorSet.Green)
    println("-------- RESULTS -----------")
    println("Base :\t\t\t\t${colorSet.Blue}$base")
    println("Exponent :\t\t\t${colorSet.Blue}$exponent")
    println("Powering ${colorSet.Blue}${base.toInt()}^${exponent.toInt()} :\t\t${colorSet.Yellow}$power")
    print(colorSet.Green)
    println("----------------------------")
}