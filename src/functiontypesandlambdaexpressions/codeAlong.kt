package functiontypesandlambdaexpressions

fun main() {
    val trickFunction = trick
    trickFunction()
}

val trick = {
    println("No treats!")
}