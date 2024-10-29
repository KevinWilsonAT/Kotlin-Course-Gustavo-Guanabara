package exercisesKotlin
import java.time.LocalDateTime

fun main(args: Array<String>) {

    var colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tCURRENT MONTH")
    println("----------------------------------------")

    var currentYear:Int = LocalDateTime.now().year
    var currentMonth:Int = LocalDateTime.now().monthValue
    var currentTrimester:Int = (currentMonth - 1) / 3 + 1
    var currentSemester:Int = 1 + (currentMonth - 1) / 6

    print(colorSet.Green)
    println("Current year:\t\t\t${colorSet.Blue}$currentYear")
    print(colorSet.Green)
    println("Current month:\t\t\t${colorSet.Blue}$currentMonth")
    print(colorSet.Green)
    println("Current semester:\t\t${colorSet.Blue}$currentSemester")
    print(colorSet.Green)
    println("Current trimester:\t\t${colorSet.Blue}$currentTrimester")
    print(colorSet.Green)
    println("----------------------------------------")
}