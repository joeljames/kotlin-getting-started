fun main() { // ktlint-disable filename
    println("When type conversion...")
    val out = when (val duration: Any = "100") {
        is Long -> duration
        is Number -> duration.toLong()
        is String -> duration.toLong()
        else -> duration.toString().toLong()
    }
    println(out)
}
