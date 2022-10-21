fun main(args: Array<String>) {
    //Variable can be nullable by using ?
    val someString: String? = null
    //No NPE is raised. Since we are using the safety operator
    println("What happens when we do this ${someString?.uppercase()}")

    //?: elvis operator of Kotlin
    //It lest you assign a default value when an expression evaluates to null
    val newString =  someString?.uppercase() ?: "THIS IS THE DEFAULT"
    println("The elvis operator example $newString")


}