fun main(args: Array<String>) {
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)
    println(Short.SIZE_BITS)
    println(Short.SIZE_BYTES)

    var name:String = "Testing"
    println(name.length)

    var x:Int = 10
    var y = 20f
    println(y is Float)

    var n:Any
    n = 20
    println(n)
    n = "Kotlin"
    println(n)
}