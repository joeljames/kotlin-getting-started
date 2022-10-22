import java.time.Year

class Singleton {
}

object CompanyCommunications {
    val currentYear = Year.now().value

    fun getTagLine(): String = "Out company rocks"
    fun getCopyrightLine(): String = "Copyright $currentYear"
}

fun main(args: Array<String>) {
    //We are calling the two functions here
    //Using the class name only creates one instance of the object
    //This is how singleton is done in Kotlin
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}