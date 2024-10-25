import kotlin.math.*

fun main(args: Array<String>) {

    val n:Float = 4.1f
    val a:Int = 7
    val b:Int = 9

    println("Square root of $n: ${sqrt(n)}")
    println("Powering $n: ${n.pow(2)}")
    println("Ceil Rounding $n: ${ceil(n)}")
    println("Common Rounding $n: ${n.roundToInt()}")
    println("Floor Rounding $n: ${floor(n)}")
    println("The lesser value between $a and $b: ${min(a, b)}")
    println("The greater value between $a and $b: ${max(a, b)}")
}