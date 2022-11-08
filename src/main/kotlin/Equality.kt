fun main(args: Array<String>) {
    val user1 = User("Name1", 1)
    val user2 = User("Name2", 2)
    val user3 = User("Name2", 2)

    println(user1 == user2) // false
    println(user2 == user3) // true (Different from java, false), In Kotlin == operator checks for structural equality
    println(user1.equals(user2)) // false You dont have to call .equals in Kotlin
    println(user2.equals(user3)) // true

    // For referential quality in Kotlin you have to use the ===
    println(user2 === user3) // false
    println(user2 !== user3) // true
    println(user2 != user3) // false
}

class User(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return obj.id == id && name == obj.name
        }
        return false
    }
}
