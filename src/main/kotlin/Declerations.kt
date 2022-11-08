typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    // =========
    // Quick diff in Kotlin
    // =========

    // Kotlin does not distinguish between checked and unchecked exceptions.
    // throws keyword does not exist. All exceptions are unchecked and you don't have to declare them.

    // No ternary operator
    // No static keyword
    // No new keyword

    // val -> final (only assign once)
    // var -> non final
    val num: Int
    num = 10

    var num2: Int
    num2 = 10
    num2 = 20

    // val final does not mean you cannot change the instance properties within the object
    // Same with final variables in Java
    val employee = Employee("Foo Bar", 1)
    employee.name = "Foo new name"

    // Type aliases. Assigning a name to an existing type
    val employees: EmployeeSet

    // You can use square brackets
    val names = arrayListOf("John", "Foo")
    println(names[1])
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return obj.id == id && name == obj.name
        }
        return false
    }
}
