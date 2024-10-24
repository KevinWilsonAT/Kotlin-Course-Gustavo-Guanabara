fun main(args: Array<String>) {
    val reset_color:String = "\u001B[00m"
    val yellow_color:String = "\u001B[33m"
    val red_color:String = "\u001B[31m"

    println("${yellow_color}Hello ${reset_color}world${red_color}!!")
}