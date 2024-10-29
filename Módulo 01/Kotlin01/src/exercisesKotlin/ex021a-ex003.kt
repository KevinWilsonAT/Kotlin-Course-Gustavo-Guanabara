package exercisesKotlin

fun main(args: Array<String>) {

    val colorSet = Ex021colors()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tAVERAGE RANK")
    println("----------------------------------------")

    print(colorSet.Reset)
    print("Rank 1: > ")
    val n1:Float = readLine()!!.toFloatOrNull()?:0f
    print("Rank 2: > ")
    val n2:Float = readLine()!!.toFloatOrNull()?:0f
    println("\n")
    val avg:Float = (n1+n2) / 2

    print(colorSet.Yellow)
    println("------------ RESULTS ------------------")
    println("Rank 1 :\t\t\t\t$n1")
    println("Rank 2 :\t\t\t\t$n2")
    println("Average :\t\t\t\t$avg")
    println("----------------------------------------")
}