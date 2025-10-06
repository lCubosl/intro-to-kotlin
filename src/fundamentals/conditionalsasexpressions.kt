package fundamentals

// Note: A when statement doesn't need the else branch to be defined.
// However, in most cases, a when expression requires the else branch
// because when the expression needs to return a value. As such,
// the Kotlin compiler checks whether all the branches are exhaustive.
// An else branch ensures that there won't be a scenario in which the
// variable doesn't get assigned a value.

fun main() {
    val arg1 = "Red"
    val arg2 = "Yellow"
    val arg3 = "Red"

    conditional1(arg3)
    conditional2(arg1)
}

fun conditional1 (arg1 : String) {
    val message =
        if (arg1 == "Red") "STOP"
        else if (arg1 == "Yellow") "Slow down"
        else if (arg1 == "Green") "Go"
        else "Invalid traffic light color"

    println(message)
}

fun conditional2 (arg2: String) {
    val message = when(arg2) {
        "Red" -> "STOP"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}