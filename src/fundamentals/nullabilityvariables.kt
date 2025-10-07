package fundamentals

// Note: While you should use nullable variables for variables that can carry null,
// you should use non-nullable variables for variables that can never carry null
// because the access of nullable variables requires more complex handling.
// You learn about various techniques to handle nullable variables in the next section.

fun main() {
    var favoriteActor : String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)

    var number : Int? = 10
    println(number)

    number = null
    println(number)
}