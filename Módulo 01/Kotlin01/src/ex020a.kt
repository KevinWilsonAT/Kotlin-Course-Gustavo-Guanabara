import java.time.LocalDateTime

fun main(args: Array<String>) {

    println("Current second: ${LocalDateTime.now().second}")
    println("Current minute: ${LocalDateTime.now().minute}")
    println("Current hour: ${LocalDateTime.now().hour}")
    println("Current day by week perspective: ${LocalDateTime.now().dayOfWeek}")
    println("Current day by month perspective: ${LocalDateTime.now().dayOfMonth}")
    println("Current day by year perspective: ${LocalDateTime.now().dayOfYear}")
    println("Current month number: ${LocalDateTime.now().monthValue}")
    println("Current month name: ${LocalDateTime.now().month}")
    println("Current year: ${LocalDateTime.now().year}")

}