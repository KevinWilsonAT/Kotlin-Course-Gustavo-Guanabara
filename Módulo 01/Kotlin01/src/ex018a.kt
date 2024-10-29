fun main(args: Array<String>) {

    val v1 = 5
    val v2 = 8
    val v3 = 3
    val v4 = 2

    val resExp1 = !(v1 < v2) && v2 == v1 + v3

    /*
    *   v1 < v2 -> 5 < 8 =true;
    *   v1 + v3 -> 5 + 3 = 8;
    *   v2 == v3 -> 8 == 8 = true
    *   !(v1 < v2) -> !true = false
    *   true && false = false
    */

    println("The result of the expression is [$resExp1]")

    val resExp2 = v1 > v2 && !(v3 - 1 != v1 / v4)

    /*
    *   v3 - 1 -> 3 - 1 = 2
    *   v1 / v4 -> 5 / 2 = 2 (Integer numbers, Integer divisions.)
    *   2 != 2 = false
    *   !false = true
    *   v1 > v2 -> 5 > 8 = false
    *   false && false = false
    */

    println("The result of the expression is [$resExp2]")
}