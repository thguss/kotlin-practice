package section10

class Cat(
    name: String,
    age: Int
) : Animal(name, age, "고양이") {

    fun meow() {
        println("야옹")
    }
}