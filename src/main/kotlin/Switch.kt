fun main(args: Array<String>) {
    val mode: Int = 2
    when(mode) {
        1 -> println("The mode is 1")
        2 -> {
            println("The mode is 2")
            println("The mode is busy")
        }
        in 1..10 -> println("mode is between 1 and 10")
        !in 20..25 -> println("mode is not between 20 and 25")
        else -> println("I don't know that mode")
    }
}