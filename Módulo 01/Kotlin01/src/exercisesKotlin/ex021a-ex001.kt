package exercisesKotlin

fun main(args: Array<String>) {

    val colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tESTUDONAUTA REGISTERING")
    println("----------------------------------------")

    print(colorSet.Reset)
    print("Employee name: > ")
    val employeeName:String = readln()
    print("Birth Year: > ")
    val birthYear:Int = readLine()!!.toIntOrNull()?:0
    print("Monthly Income: > ")
    val monthlyIncome:Float = readLine()!!.toFloatOrNull()?:0f
    println("\n")

    print(colorSet.Green)
    println("------------ EMPLOYEE STATUS -----------")
    println("Name:\t\t\t\t$employeeName")
    println("Birth year:\t\t\t$birthYear")
    println("Monthly Income:\t\t$$monthlyIncome")
    println("----------------------------------------")
}