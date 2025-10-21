package kotlinPracticeProblems

fun main() {
    val song1 = Song("title1", "artist1", 1999, 100)

    println("${song1.title}, performed by ${song1.artist}, was released in ${song1.yearPublished}.")
    println(song1.isPopular)
}

class Song(val title: String, val artist: String, val yearPublished: Int, val playCount: Int) {
    val isPopular: Boolean
        get() = playCount >= 1000
}