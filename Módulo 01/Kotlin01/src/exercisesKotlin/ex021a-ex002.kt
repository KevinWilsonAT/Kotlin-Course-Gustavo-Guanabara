package exercisesKotlin

fun main(args: Array<String>) {

    val colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tTWO VALUES")
    println("----------------------------------------")

    print(colorSet.Reset)
    print("Value 1: > ")
    val n1:Int = readLine()!!.toIntOrNull()?:0
    print("Value 2: > ")
    val n2:Int = readLine()!!.toIntOrNull()?:0
    println("\n")

    print(colorSet.Green)
    println("------------ RESULTS ------------------")
    println("Addition:\t\t\t\t${colorSet.Blue}$n1 + $n2 = ${colorSet.Green}${n1+n2}")
    println("Subtraction:\t\t\t${colorSet.Blue}$n1 - $n2 = ${colorSet.Green}${n1-n2}")
    println("Multiplication:\t\t\t${colorSet.Blue}$n1 * $n2 = ${colorSet.Green}${n1*n2}")
    println("Division:\t\t\t\t${colorSet.Blue}$n1 / $n2 = ${colorSet.Green}${n1.toFloat()/n2.toFloat()}")
    println("Module:\t\t\t\t\t${colorSet.Blue}$n1 % $n2 = ${colorSet.Green}${n1%n2}")
    println("----------------------------------------")
}