fun main(args: Array<String>) { // ktlint-disable filename
    val multiLine = """This is the first line.
        This is the second.
        This is the third.
    """.trimIndent()

    println("With trim indent $multiLine")

    val fill = "Some message"
    val multiLineTrimMargin = """This is the first line. $fill
        |This is the second.
        |This is the third.
    """.trimMargin()

    println("With trim margin $multiLineTrimMargin")
}
