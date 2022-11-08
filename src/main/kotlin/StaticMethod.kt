fun main(args: Array<String>) {
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("Some String")
    val someClass2 = SomeClass.upperOrLowerCase("Some String", true)
    println(someClass2.someString)
    val someClass3 = SomeClass.upperOrLowerCase("Some String", false)
    println(someClass3.someString)
}

// There is no concept of static method in Kotlin.
// But you can kind of achieve that using companion object.
class SomeClass private constructor(val someString: String) {
    private val privateVar = 6

    companion object {
        private val privateVar = 6

        fun accessPrivateVar() = "The private var is: $privateVar"

        // Can be used as a Factory class.
        // Note you have to make the constructor of SomeClass as private constructor so no one can directly create a
        // instance of this class
        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}
