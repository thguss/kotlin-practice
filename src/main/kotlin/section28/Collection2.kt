package section28

fun main() {

    val personList = listOf(
        Person("카리나", 2000),
        Person("윈터", 2001),
        Person("유나", 1992),
        Person("조이", 1996)
    )

    println(personList.associateBy { it.birthYear })
    println(personList.groupBy { it.name })

    val (over98, under98) = personList.partition { it.birthYear < 1998 }
    println(over98)
    println(under98)

    println()

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)
}

data class Person(
    val name: String,
    val birthYear: Int
) {

}
