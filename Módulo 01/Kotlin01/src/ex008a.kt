fun main(args: Array<String>) {
    var name:String?
    name = null
    println(name)
    print("\n")

    var a1:Int?
    var b1:Int
    a1 = null
    b1 = a1?:0
    println(a1)
    println(b1)
    print("\n")

    var a2:Int? = 50
    var b2:Int
    b2 = a2?:0
    println(a2)
    println(b2)
    print("\n")

    var a3:Int?
    var b3:Int = 0
    a3 = null
    try {
        b3 = a3!!
    }
    catch (e: NullPointerException) {
        println("Exception found")
    }
    finally {
        println("a = " + a3)
        println("b = " + b3)
    }
}