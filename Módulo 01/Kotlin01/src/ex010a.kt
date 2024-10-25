fun main(args: Array<String>) {
    val resetColor:String = "\u001B[00m"
    val yellowColor:String = "\u001B[33m"
    val redColor:String = "\u001B[31m"

    println("${yellowColor}Hello ${resetColor}world${redColor}!!")
}