package fundamentals

fun main() {
    var favoriteActor : String? = "Sandra Oh"
    println(favoriteActor?.length)

    favoriteActor = null
    println(favoriteActor?.length)

    var anotherActor : String? = "John No"
    println(anotherActor!!.length)

    favoriteActor = "Sandra Oh"

    if (favoriteActor != null) {
        println("The number of characters in your facorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }

    // or using -> val name = nullable-variable ?. method/property ?: default-type
    val lenghtOfName = favoriteActor?.length ?: 0

    println("The number of characters in your facorite actor's name is ${favoriteActor.length}.")
}