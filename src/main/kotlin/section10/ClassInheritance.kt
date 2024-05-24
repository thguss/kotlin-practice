package section10

fun main() {

    val a = Animal("또리", 5, "개")
    val b = Dog("또리", 5)

    a.introduce()
    b.introduce()

    b.bark()

    val c = Cat("나비", 5)

    c.introduce()
    c.meow()
}