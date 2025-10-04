package introductionkotlin.practiceproblems

fun main() {
    // time spent on the phone today
    val timeSpentToday = 300
    val timeSpentYesterday = 300

    println(timeSpent(timeSpentToday, timeSpentYesterday))
}

fun timeSpent(today: Int, yesterday: Int): Boolean {
    if (today > yesterday)
        return true
    else
        return false
}