package section10

class Dog(
    name: String,
    age: Int
) : Animal(name, age, "개") {

    fun bark() {
        println("멍멍")
    }
}