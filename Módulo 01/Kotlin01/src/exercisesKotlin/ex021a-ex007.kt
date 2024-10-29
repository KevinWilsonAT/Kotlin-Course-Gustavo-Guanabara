package exercisesKotlin
import kotlin.math.abs


fun main(args: Array<String>) {

    val colorSet = Ex021colors()
    val randNumber:Int = (0..5).random()

    print(colorSet.Red)
    println("----------------------------------------")
    println("\t\tGUESSING")
    println("----------------------------------------")

    print(colorSet.Blue)
    println("Insert your guess of a number between 0 and 5")
    print(colorSet.Reset)
    print("Your Guess: > ")
    val yourGuess: Int = readLine()!!.toIntOrNull()?:0
    val dif = randNumber - yourGuess

    print(colorSet.Green)
    println("------------ RESULTS ------------------")
    println("The number: \t\t${colorSet.Blue}$randNumber")
    print(colorSet.Green)
    println("Your guess: \t\t${colorSet.Blue}$yourGuess")
    print(colorSet.Green)
    println("Difference: \t\t${colorSet.Blue}${abs(dif)}")
    print(colorSet.Green)
    println("----------------------------------------")

}