import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
//    println("Completable future example: ")
//    val future: CompletableFuture<Int> = CompletableFuture.supplyAsync { someLongRunningTask(1) }
//        .thenApply {
//            someLongRunningTask(it)
//        }.exceptionally { ex ->
//            println("Something bad happened in the exception here ${ex.message}")
//            0
//        }
//    println("Out of future call. The request is async.")
//    println("The future result is ${future.get()}")
//
//    println("Completable future with exception example: ")
//    val futureWithException: CompletableFuture<Int> = CompletableFuture.supplyAsync { someLongRunningTask(5) }
//        .thenApply {
//            someLongRunningTask(it)
//        }.thenApply {
//            someTaskWithException(null)
//            0
//        }
//        .exceptionally { ex ->
//            println("Something bad happened in the exception here ${ex.message}")
//            0
//        }
//    println("The future with exception result is ${futureWithException.get()}")


    println("Completable futures with join: ")
    val future1: CompletableFuture<Int> = CompletableFuture.supplyAsync { someLongRunningTask(1) }
        .thenApply {
            someLongRunningTask(it)
        }
    val future2: CompletableFuture<Int> = CompletableFuture.supplyAsync { someLongRunningTask(5) }
        .thenApply {
            someLongRunningTask(it)
        }
    println("Started the feature, calling the join to get the feature result.")
    CompletableFuture.allOf(future1, future2).join()
}

fun someLongRunningTask(value: Int): Int {
    TimeUnit.SECONDS.sleep(2)
    println("The input key value is ${value}")
    return value * 2
}

fun someTaskWithException(name: String?) {
    if (name == null) {
        throw IllegalArgumentException("Name required")
    }
}
