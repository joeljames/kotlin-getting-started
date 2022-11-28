fun main(args: Array<String>) { // ktlint-disable filename
    // Array a fix length. Cannot do .add.
    // mix data types in an array. This is a array of Array<Any>
    val mixedArr = arrayOf("apple", "ball", "cat", false, 10, 'C', 20L)

    val intArr = intArrayOf(10, 20)
    val longArr = arrayOf(10L, 20L)
    val longArr2 = arrayOf<Long>(10, 20)
    // even numbers
    val evenNumber = Array(16) { index -> index * 2 }
    // Initialize an array with 1 to 20
    val lotsOfNumber = Array(20) { index -> index + 1 }
    for (i in lotsOfNumber) {
        println("Lots of numbers $i")
    }

    // Special primitive array function
    val concatArr = intArrayOf(10, 20) + intArrayOf(20)

    val st = "FooBar"
    println(st[0])

    // List is immutable. Cannot do .add
    val lis = listOf("apple", "ball", "cat")

    // ArrayList which stores element in an array and resizes it if necessary
    val arrLis = arrayListOf("apple", "ball", "cat")
    arrLis.add("fox")
    println("The list is: $arrLis")
    val subList = arrLis.subList(1, 4)
    println("The sub list is: $subList")
}
