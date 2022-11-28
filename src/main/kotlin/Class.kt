// Not necessary that the filename should match class name.
// You can have more than one class in a file.
// By default, the class access is public.
// You can use private with classes. Only classes in the same file can use it.

// ACCESS MODIFIERS
// private -> Same file access
// protected -> Can't be used
// public -> Visible to everyone
// internal - Visible within the same module
private class MyPrivateClass()

// Protected constructor then you have to include the word constructor
class EmpProtected protected constructor(val name: String)

// Most of the time you won't need the secondary constructor.
// You could just pass in default value to the properties.
class EmpPrimaryAndSecondaryConstructor(val name: String) {

    var fullTime: Boolean = true

    // Secondary Constructor
    constructor(name: String, fullTime: Boolean) : this(name) {
        this.fullTime = fullTime
    }
}

class EmpPrivateProperties(private val name: String)

class Emp(val name: String, var age: Int, val address: String = "default address") {

    // Not a constructor. Run when the instance is initialized.
    init {
        println("This is the class initializer")
    }

    fun getDisplay(): String {
        return name + age
    }

    override fun toString(): String {
        return "Emp(name='$name', age=$age, address='$address')"
    }
}

// ===========
// Constant
// ===========
// You don't need a class to define a constant
val MY_CONSTANT = 100

// ===========
// Data Class
// ===========
// It comes with nice toString function, equals, hashCode, copy
// data classes cannot be abstract, sealed or inner class
data class Car(val color: String, val model: String, val year: Int)

fun main(args: Array<String>) {
    println(MY_CONSTANT)
    val emp1 = Emp(name = "JJ", age = 20, address = "Some Address")
    println(emp1.age)
    emp1.age = 35
    println(emp1.age)
    println(emp1)

    val emp2 = Emp("KK", 20, "Address 2")
    println(emp2)
    val emp3 = Emp("LL", 50)
    println(emp3)

    println("Data Class")
    val car = Car("Pink", "Honda", 2022)
    println(car)
    val car2 = Car("Pink", "Honda", 2022)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016)
    println(car4)
    val car5 = car.copy(year = 2016, color = "Yellow")
    println(car5)
}
