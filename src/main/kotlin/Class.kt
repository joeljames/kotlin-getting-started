//Not necessary that the filename should match class name.
//You can have more than one class in a file.
//By default the class access is public.
//You can use private with classes. Only classes in the same file can use it.

//ACCESS MODIFIERS
//private -> Same file access
//protected -> Can't be used
//public -> Visible to everyone
//internal - Visible within the same module
private class MyPrivateClass() {

}

//Protected constructor then you have to include the word constructor
class EmpProtected protected constructor(val name: String) {}


//Most of the time you won't need the secondary constructor.
//You could just pass in default value to the properties.
class EmpPrimaryAndSecondaryConstructor(val name: String) {

    var fullTime: Boolean = true

    //Secondary Constructor
    constructor(name: String, fullTime: Boolean) : this(name) {
        this.fullTime = fullTime
    }
}


class EmpPrivateProperties(private val name: String) {

}

class Emp(val name: String, var age: Int, val address: String = "default address") {

    //Not a constructor. Run when the instance is initialized.
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

fun main(args: Array<String>) {
    val emp1 = Emp(name = "JJ", age = 20, address = "Some Address")
    println(emp1.age)
    emp1.age= 35
    println(emp1.age)
    println(emp1)

    val emp2 = Emp("KK", 20, "Address 2")
    println(emp2)

    val emp3 = Emp("LL", 50)
    println(emp3)

}