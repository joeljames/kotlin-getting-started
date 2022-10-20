fun main(args: Array<String>) {

    //Array a fix length. Cannot do .add.
    //Stores collection of objects
    val arr = arrayOf("apple", "ball", "cat", false, 10)
    val intArr = intArrayOf(10, 20)
    val st = "FooBar"
    println(st[0])
    val concatArr = intArrayOf(10, 20) + intArrayOf(20)



    //List is immutable. Cannot do .add
    val lis = listOf("apple", "ball", "cat")

    //ArrayList which stores element in an array and resizes it if necessary
    val arrLis = arrayListOf("apple", "ball", "cat")
    arrLis.add("fox")
    println("The list is: $arrLis")
    val subList = arrLis.subList(1, 4)
    println("The sub list is: $subList")

}