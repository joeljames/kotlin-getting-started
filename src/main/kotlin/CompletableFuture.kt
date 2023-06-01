import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    println("Completable future example: ")
    val future: CompletableFuture<Int> = CompletableFuture.supplyAsync { someLongRunningTask(1) }
        .thenApply {
            someLongRunningTask(it)
        }.exceptionally { ex ->
            println("Something bad happened in the exception here ${ex.message}")
            0
        }
    println("Out of future call. The request is async.")
    println("The future result is ${future.get()}")

    println("Completable future with exception example: ")
    val futureWithException: CompletableFuture<Int> = CompletableFuture.supplyAsync { someLongRunningTask(5) }
        .thenApply {
            someLongRunningTask(it)
        }.thenApply {
            someTaskWithException(null)
            0
        }
        .exceptionally { ex ->
            println("Something bad happened in the exception here ${ex.message}")
            0
        }
    println("The future with exception result is ${futureWithException.get()}")

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

    println("Completable futures the combine: ")
    // if we want to execute two independent Futures and do something with their results.
    // We can use the thenCombine.
    val featureWithCombine = CompletableFuture.supplyAsync { someLongRunningTask(4) }
        .thenCombine(CompletableFuture.supplyAsync { someLongRunningTask(5) }) { t1, t2 ->
            t1 + t2
        }
    println("Getting the result of feature with thenCombine ${featureWithCombine.get()}.")

    //###############
    //thenCompose()
    //###############
    // Use thenCompose(flatMap) when you have a chain of computation steps.
    // Use thenApply(map) when you have to work with the result of the previous call. So, this method is useful when we want to transform the result of a CompletableFuture call
    val composeResultFeature = CompletableFuture.supplyAsync { "Hello" }
        .thenCompose { CompletableFuture.supplyAsync { "$it World" } }
        .thenCompose { CompletableFuture.supplyAsync { "$it!" } }
    println("composeResultFeature: ${composeResultFeature.get()}")
}

fun someLongRunningTask(value: Int): Int {
    TimeUnit.SECONDS.sleep(2)
    println("The input key value is $value")
    return value * 2
}

fun someTaskWithException(name: String?) {
    if (name == null) {
        throw IllegalArgumentException("Name required")
    }
}
