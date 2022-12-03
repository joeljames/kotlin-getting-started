class Bike private constructor(val make: String, val model: String?) {

    override fun toString(): String {
        return "make=$make; model=$model"
    }

    data class Builder(
        var make: String? = null,
        var model: String? = null
    ) {
        // apply returns object reference. In this case this
        fun make(make: String) = apply { this.make = make }
        fun model(model: String) = apply { this.model = model }
        fun build() = Bike(make!!, model)
    }
}

fun main(args: Array<String>) {
    val bike = Bike.Builder()
        .make("some bike")
        .model("some model")
        .build()

    println("The bike is $bike")
}
