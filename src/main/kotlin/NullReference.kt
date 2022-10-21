fun main(args: Array<String>) {

    //========
    //?
    //========
    //Variable can be nullable by using ?
    val someString: String? = null
    //No NPE is raised. Since we are using the safety operator
    println("someString: ${someString?.uppercase()}")

    //========
    //?: elvis operator of Kotlin
    //========
    //It lest you assign a default value when an expression evaluates to null
    val newString =  someString?.uppercase() ?: "THIS IS THE DEFAULT"
    println("The elvis operator example $newString")

    //========
    //!! (assert not null)
    //========
    val someString2: String? = "This is not null"
    //!! will a NPE if someString2 is null. Use it if you want NPE to be thrown.
    println("someString2:  ${someString2!!.uppercase()}")

    //========
    //let
    //========
    val someString3: String? = "This is not null"
//    plainText(someString3) //You cannot do this, the fun requires a nun nullable string
    //The below will work, but not a recommended way
    plainText(someString3!!)
    //Use the let function instead(Shorthand). Tis is same as if (someString3 != null) {plainText(someString3)}
    someString3?.let { plainText(it) }







}

fun plainText(text: String) {
    println(text)
}