interface MyInterface {
    //Interface can have properties
    val number: Int

    val number2: Int
        get() = number * 100

    fun myFun(str: String): String
}

//Extending an interface
interface MySubInterface : MyInterface {
    fun mySubFun(str: String): String
}

class MyClass : MySubInterface {
    override val number: Int = 25

    override fun mySubFun(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFun(str: String): String {
        TODO("Not yet implemented")
    }
}

open class ParentClass(val srr: String) {

}

//Class can inherit and implement an interface
class ChildClass(val str: String) : ParentClass(str),  MySubInterface{
    override val number: Int = 25

    override fun mySubFun(str: String): String {
        TODO("Not yet implemented")
    }

    override fun myFun(str: String): String {
        TODO("Not yet implemented")
    }

}