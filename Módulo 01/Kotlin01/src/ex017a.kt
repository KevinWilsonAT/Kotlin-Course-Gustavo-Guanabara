fun main(args: Array<String>) {

    var n:Int = 7
    println("The value of n was $n")
    n++ // or n ++ or n = n.inc()
    println("Now, the value is $n using n++ or n ++ or inc() \n")

    var x:Int = 4
    var y:Int = x++
    println("The value of x is $x and y is $y, using post increment")

    x = 4
    y = ++x
    println("The value of x is $x and y is $y, using pre increment")
}