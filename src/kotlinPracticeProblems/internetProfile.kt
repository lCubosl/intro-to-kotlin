package kotlinPracticeProblfun

fun main() {
    val amanda = Person("Amanda", 33, "play tenis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("Like s to $hobby")
        }
        if (referrer != null) {
            print("has a referer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}")
            } else {
                print(".")
            }
        } else {
            print("Doesnt have a referrer")
        }
        print("\n")
    }
}