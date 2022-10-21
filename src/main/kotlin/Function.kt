//The default return type of a function is Unit
//fun main(args: Array<String>): Unit {

fun main(args: Array<String>) {
    println(labelMultiply(3, 4, "This is result: "))
    println(labelMultiply(label = "This is result: ", op2 = 3, op1 = 4))
    println(labelMultiply(3, 4))
    println(labelMultiplyShort(3, 4, "This is result: "))

    val t1 = Truck("name1", "Yellow", 2021)
    val t2 = Truck("name2", "Blue", 2000)
    val t3 = Truck("name3", "Red", 1998)
    //=======
    //vararg
    //========
    printColorsWithString(t1, t2, t3, str = "Blah")

    //=======
    //Spread operator
    //========
    val arrTrucks = arrayOf(t1, t2, t3)
    printColors(*arrTrucks)

    val moreTrucks = arrayOf(t3)
    val t4 = Truck("name4", "Pink", 1998)
    val trucks = arrayOf(*arrTrucks, *moreTrucks, t4)


}

fun labelMultiply(op1: Int, op2: Int, label: String = "This is the default label"): String {
    return "$label ${op1 * op2}"
}

fun labelMultiplyShort(op1: Int, op2: Int, label: String) =
    "$label ${op1 * op2}"


data class Truck(val name: String, val color: String, val year: Int) {}

fun printColorsWithString(vararg trucks: Truck, str: String) {
    for (t in trucks) {
        println(t.color)
    }
}

fun printColors(vararg trucks: Truck) {
    for (t in trucks) {
        println(t.color)
    }
}