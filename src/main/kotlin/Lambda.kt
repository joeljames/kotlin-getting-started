fun main() {

    // Type defined within the lambda block
    val sumLambda = { num1: Int, num2: Int -> num1 + num2 }
    println("sumLambda: ${sumLambda(2, 4)}")

    // Type defined within the lambda block
    val multiplyLambda: (Int, Int) -> Int = { num1, num2 -> num1 * num2 }
    println("sumLambda: ${multiplyLambda(2, 4)}")

    // Lambda as extension
    // this: keyword is the string
    // it: is the int param passed in
    val lambdaExt: String.(Int) -> String = { this + it }
    println("lambdaExt: ${"My String".lambdaExt(2)}")

    // Returning values from lambda.
    // This is similar to the regular function except that the name of the function is omitted.
    val isEvenLambda = fun(num: Int): Boolean {
        if (num % 2 == 0) {
            return true
        }
        return false
    }
    println("isEvenLambda: ${isEvenLambda(2)}")
}