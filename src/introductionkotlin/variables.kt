package introductionkotlin

fun main() {
    println("--------------------------------------------------------")
    // -- DEFINE AND USE VARIABLES --
    // declaration
    val count: Int = 2
    println(count)
    // you can turn count into its actual value by adding $ before
    println("You have count unread messages")
    // the template expression $ turns the next word into a string template
    println("You have $count unread messages")

    // You can also do basic math operations
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")

    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")

    println("--------------------------------------------------------")
    // -- UPDATE VARIABLES --
    // cannot update variables type "val" since VAL cannot be reasigned.
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")

    println("--------------------------------------------------------")
    // -- DATA TYPES --
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    println("--------------------------------------------------------")
    // -- OTHER DATA TYPES --
    // string concatenation
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    // placing characters need to be preceded by \
    println("Say \"hello\"")

    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}