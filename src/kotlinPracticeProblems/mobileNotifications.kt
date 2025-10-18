package kotlinPracticeProblems

fun main() {
    val morningNotifications = 51
    val eveningNotifications = 135

    printNotificationSummary(morningNotifications)
    printNotificationSummary(eveningNotifications)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 99) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("You have 99+ notifications.")
    }
}