package exercisesKotlin

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tAGE")
    println("----------------------------------------")

    print(colorSet.Reset)
    println("Birth year: > ")
    val birthYear:Int = readLine()!!.toIntOrNull()?:0
    val currentYear:Int = LocalDateTime.now().year
    val age:Int = currentYear - birthYear

    print(colorSet.Green)
    println("------------ RESULTS ------------------")
    println("Current year:\t\t${colorSet.Yellow}$currentYear")
    print(colorSet.Green)
    println("Birth year:\t\t\t${colorSet.Yellow}$birthYear")
    print(colorSet.Green)
    println("Age:\t\t\t\t${colorSet.Blue}$age")
    print(colorSet.Green)
    println("----------------------------------------")

}