//Only leave variables open which you want to override in the child class.
open class Person(open val name: String, var age: Int) {

    init {
        println("This is the class initializer")
    }

    fun getDisplay(): String {
        val display = name + age
        println("The display is $display")
        return display
    }

    fun speak() {
        println("Hi there!")
    }
}

//Child class Student inheriting Person.
//Can take in new arguments e.g., studentId
class Student(override val name: String, val studentId: Long) : Person(name, 40) {

    fun isIntelligent() = true

}

//Compiler will create the class for you. You don't need to declare a class
fun main(args: Array<String>) {
    val p1 = Person(name = "Joe Person", age = 10)
    p1.getDisplay()

    val s1 = Student(name = "Joe Student", studentId = 10)
    s1.speak()
    s1.getDisplay()
}