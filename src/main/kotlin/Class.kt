class Emp(val name: String, var age: Int, val address: String = "default address") {

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
    val emp1 = Emp(name="JJ", age=20, address = "Some Address")
    println(emp1)

    val emp2 = Emp("KK", 20, "Address 2")
    println(emp2)

    val emp3 = Emp("LL", 50,)
    println(emp3)

}