import java.util.*

fun getCurrentDate(): Date {
    return Date()
}

fun main(args: Array<String>) {
    val dt: Date = getCurrentDate()
    println("Current date is $dt")
}
