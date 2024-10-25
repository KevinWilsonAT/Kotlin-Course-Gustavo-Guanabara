fun main(args: Array<String>) {

    print("Your age: ")
    val age:Int = readLine()!!.toIntOrNull()?:0
    println("Age: $age")
}