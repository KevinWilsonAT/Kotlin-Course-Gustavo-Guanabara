fun main(args: Array<String>) {

    print("What is your name? > ")
    var name:String = readLine()!!
    println("Nice to meet you, ${name}\n")

    print("How old are you, ${name}? > ")
    var age:Int = readLine()!!.toInt()
    println("So, your name is ${name} and you are ${age} years old")
}