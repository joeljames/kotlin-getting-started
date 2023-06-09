fun main(args: Array<String>) { // ktlint-disable filename
    println("When example...")
    val mode = 1
    when (mode) {
        0, 1 -> {
            println("The mode is either 0 or 1")
        }
        2 -> {
            println("The mode is 2")
            println("The mode is busy")
        }
//        is Int -> println("is an instance of int")
        in 1..10 -> println("mode is between 1 and 10")
        !in 20..25 -> println("mode is not between 20 and 25")
        else -> println("I don't know that mode")
    }

    // Using when similar to if else
    val num = 1
    val out = when {
        num %2 == 0 -> "Value is event"
        else -> "Value is odd"
    }
}
