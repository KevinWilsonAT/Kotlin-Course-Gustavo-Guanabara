package exercisesKotlin

fun main(args: Array<String>) {

    val colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tSALARY ADJUSTMENT")
    println("----------------------------------------")

    print(colorSet.Reset)
    print("Monthly Income: > ")
    val income:Float = readLine()!!.toFloatOrNull()?:0f
    print("Adjustment: > ")
    val adjustment:Float = readLine()!!.toFloatOrNull()?:0f
    val incomeAdjusted:Float = income + (income * adjustment/100)

    println(colorSet.Green)
    println("-------- RESULTS -----------")
    println("Income :\t\t\t${colorSet.Yellow}$income")
    println("Adjustment :\t\t${colorSet.Yellow}$adjustment")
    println("Income adjusted :\t${colorSet.Yellow}$incomeAdjusted")
    print(colorSet.Green)
    println("----------------------------")
}