fun main() { // ktlint-disable filename
    //
    println("Partition int.max an int.min into equal buckets.")
    val min = Int.MIN_VALUE
    val max = Int.MAX_VALUE
    val range = max.toLong() - min.toLong()
    val partition = 3
    val sizePerPartition = range / partition

    // Returns a sequence of Pair for each bucket.
    val partitionedBucketSequence = (1..3).asSequence().map {
        when (it) {
            // First bucket
            1 -> {
                val first = min
                val second = (min.toLong() + (it * sizePerPartition)).toInt()
                first to second
            }
            // Last bucket
            partition -> {
                val first = (min.toLong() + ((partition - 1) * sizePerPartition)).toInt()
                val second = max
                first to second
            }
            // Intermediate bucket
            else -> {
                val first = (min.toLong() + ((it - 1) * sizePerPartition)).toInt()
                val second = (min.toLong() + (it * sizePerPartition)).toInt()
                first to second
            }
        }
    }
    partitionedBucketSequence.forEach {
        println("First: ${it.first}, Second: ${it.second}")
    }
}
