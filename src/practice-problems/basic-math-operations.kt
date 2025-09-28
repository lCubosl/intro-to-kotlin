package `practice-problems`

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val anotherResult2 = sub(firstNumber, secondNumber)
    val anotherResult3 = sub(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $anotherResult2")
    println("$firstNumber - $thirdNumber = $anotherResult3")
}

// Define add() function below this line
fun add(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun sub(n1: Int, n2: Int): Int {
    return n1 - n2
}