// -- DEFINE AND CALL A FUNCTION --
// calling the function causes the entire code inside it to execute
// println() is part of the kotlin language.
fun main() {
    println("Hello, world!")
    birthdayGreeting()
    birthdayGreeting1()

    val greeting = birthdayGreeting3()
    println(greeting)
    println(birthdayGreeting3())

    println(birthdayGreeting4("PARAMETER"))
    println(birthdayGreeting4("JOHN"))

    println(birthdayGreeting5("Rover", 15))
    println(birthdayGreeting5("Rex", 12))
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

// -- RETURN VALUE FROM FUNCTION --
// Unit type is default return type means function doesn't return value.
// birthdayGreeting() and birthdayGreeting1() are the same
// : Unit is omited in the 1st and specified here in the 2nd
fun birthdayGreeting1(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting3(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

// -- ADD PARAMETERS TO FUNCTION
fun birthdayGreeting4(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

// -- MULTIPLE PARAMETER FUNCTION
fun birthdayGreeting5(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}