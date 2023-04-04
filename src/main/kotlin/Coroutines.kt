import kotlinx.coroutines.delay // ktlint-disable filename
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking

fun main() { // ktlint-disable filename

//    It is conceptually similar to a thread, in the sense that it takes a block of code to run that works concurrently with the rest of the code.
//    However, a coroutine is not bound to any particular thread.
//    It may suspend its execution in one thread and resume in another one.
//    Coroutines are less resource-intensive than JVM threads.
//    Code that exhausts the JVM's available memory when using threads can be expressed using coroutines without hitting resource limits.

//    runBlocking means that the thread that runs it (in this case — the main thread) gets blocked for the duration of the call,
//    until all the coroutines inside runBlocking complete their execution.
    runBlocking { // CoroutineScope
//        println("Coroutine example ")
//        launch { // launch a new coroutine and continue (Code inside this block will be ran async)
//            delay(1000L) // Delay
//            println("World!")
//        }
//        println("Hello ")
//
//        println("Coroutine explicit job..")
//        val job = launch {
//            delay(1000L)
//            println("World!")
//        }
//        println("Hello")
//        job.join() // wait until child coroutine completes
//        println("Done")

//        println("Extract into function and call in launch..")
//        launch { doWorld() }
//        println("Hello")

//        println("Concurrent execution..")
//        // Both pieces of code inside launch blocks execute concurrently
//        launch {
//            delay(2000L)
//            println("World 2")
//        }
//        launch {
//            delay(1000L)
//            println("World 1")
//        }
//        println("Hello")

        println("Span bunch of coroutines to perform computation in parallel..")
        val nums = listOf(1, 2, 3)
        val squaredNums = nums.asFlow().map { num ->
            someTimeIntensiveComputation(num)
        }
            .buffer() // kick off all the requests in parallel
            .toList() // join all the async bits
        println("The val is: $squaredNums")
    }
}

// suspend keyword is required to be used inside coroutines.
// Thy can inturn use other suspending functions e.g., delay
suspend fun doWorld() {
    delay(1000L)
    println("World!")
}

suspend fun someTimeIntensiveComputation(num: Int): Int {
    delay(1000L)
    return num * num
}
