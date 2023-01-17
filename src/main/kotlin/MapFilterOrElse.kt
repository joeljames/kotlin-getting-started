fun main(args: Array<String>) {
    val x: Int? = 7 // ofNullable()

    val result = x
        ?.let { it + 3 } // map()
        ?.takeIf { it < 3 } // filter()
        ?: 42 // orElseGet()

    println(result)
}
