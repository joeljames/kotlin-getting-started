

fun main(args: Array<String>) {
//    // Sequence is similar to stream in Java.
//
//    println("sequenceOf....")
//    val seq = sequenceOf("abc", "def", "hij")
//    seq.forEach { println(it) }
//
//    println("Create infinite sequence....")
//    generateSequence(Instant.now()) { it.plusSeconds(1) }
//
//    println("Create sequence from chunks and limit....")
//    // l chunks produce elements one after another. If you have infinite collection generator, put it at the end.
//    val seqFromChunks = sequence {
//        yield(1)
//        yieldAll((1..20).toList())
//    }
//        .take(10)
//
//    println("Create sequence from collection....")
//    val seqFromCollection = (1..10).asSequence()
//
//    println("Sequence lazy vs eager....")
//    val eager = (1..10).filter { it % 2 == 1 }.map { it * 2 }.toList()
//    val lazy = (1..10).asSequence().filter { it % 2 == 1 }.map { it * 2 }.toList()
//    // In the eager example, each operator introduces an intermediate collection.
//    // So, all ten elements pass to a map() function.
//    // In the second example, there are no intermediate collections introduced, thus map() function has only five elements as input.

    println("Generate sequence of odd numbers....")
    // Seed is the first element in the sequence
    val oddNumbers = generateSequence(1) { it + 2 } // `it` is the previous element
    println(oddNumbers.take(5).toList())

    println("Generate sequence with start and step....")
    val step = 20
    val start = 100
    val seqWithStep = generateSequence(0) { it + 1 }
        .map { i ->
            start + i * step
        }
    println(seqWithStep.take(5).toList())
}
