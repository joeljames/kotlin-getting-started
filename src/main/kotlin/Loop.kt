fun main(args: Array<String>) {
    // =========
    // For Loop
    // =========
    // Range is inclusive. Includes 1 and 5.
    // Use until if you don't want to include the end
    val range = 1..5
    val charRange = 'a'..'z'
    val strRange = "ABC".."XYZ"

    println(3 in range)
    println('x' in charRange)
    println("CCC" in strRange)
    println("CCCC" in strRange)

    val backwardRange = 5.downTo(1)

    val stepRage = 3..15
    val stepThree = stepRage.step(3)
    println("stepThree")
    for (i in stepThree) {
        println(i)
    }

    println("until excludes the last from the range")
    for (i in 1 until 5) {
        println(i)
    }

    println("Inline step")
    for (i in 1..15 step 2) {
        println(i)
    }

    println("Inline down to")
    for (i in 20 downTo 15) {
        println(i)
    }

    val str = "My String"
    for (i in str) {
        println(i)
    }

    val seasons = arrayOf("spring", "fall")
    for (i in seasons) {
        println(i)
    }
    for (i in seasons.indices) {
        println(seasons[i])
    }
    // lambda
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is indexed at $index") }

    println("abc" in seasons)
    println("abc" !in seasons)
    println("e" in "abc")

    // Loop through an array
    val lan = listOf("Python", "Java", "Kotlin")
    for ((index, value) in lan.withIndex()) {
        println("Element at $index is value $value")
    }

    // =========
    // While Loop
    // =========
    var x = 10
    while (x > 0) {
        println(x)
        x--
    }

    // =========
    // Giving names to loopsgc
    // =========
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                // The below break  will only break out of inner loop
                // break
                // If you want to break out of the outer loop, then  name the outer loop and call break on it
                break@outer
            }
            println("$i - $j")
        }
    }
}
