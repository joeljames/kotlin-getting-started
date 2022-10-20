fun main(args: Array<String>) {
    //Any is equivalent to Object in java
    val something: Any = UserObj("Foo", 50)

    //is instanceof check
    if (something is UserObj) {
        //casting
        val newUser = something as UserObj
        println("The new casted user is ${newUser}")
    }

}

class UserObj(var name: String, val id: Int) {
    override fun toString(): String {
        return "UserObj(name=$name, id=$id)"
    }
}