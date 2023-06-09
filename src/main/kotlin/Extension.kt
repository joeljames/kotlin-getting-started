fun main() {

    fun String.addWorld(): String {
        return "$this:World"
    }
    println("Hello ".addWorld())
}