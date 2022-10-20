fun main(args: Array<String>) {
    //For Loop
    //This will print form 1 to 10
    for (i in 1..10) {
        println(i)
    }

    println("Printing in opposite order")
    for (i in 10 downTo 0) {
        println(i)
    }


    //Loop through an array
    val lan = listOf("Python", "Java", "Kotlin")
    for (elements in lan) {
        println(elements)
    }

    for ((index, value) in lan.withIndex()) {
        println("Element at $index is value $value")
    }

    //=========
    //While Loop
    //=========
    var x = 10
    while (x > 0) {
        println(x)
        x--
    }

    //=========
    //Giving names to loopsgc
    //=========
    outer@ for(i in 1..10) {
        for (j in 1..10) {
            if (i -j == 5) {
                //The below break  will only break out of inner loop
                //break
                //If you want to break out of the outer loop, then  name the outer loop and call break on it
                break@outer
            }
            println("$i - $j")
        }
    }
}
