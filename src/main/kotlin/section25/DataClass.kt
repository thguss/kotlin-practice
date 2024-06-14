package section25

fun main() {

    /**
     * 일반 클래스
     */
    val a = General("소현", 530)

    println(a == General("소현", 530))
    println(a.hashCode())
    println(a)
    println()

    /**
     * 데이터 클래스
     */
    val b = Data("윈터", 111)

    println(b == Data("윈터", 111))
    println(b.hashCode())
    println(b)
    println()

    println(b.copy())
    println(b.copy("써머"))
    println(b.copy(id = 615))
    println()

    /**
     * componentX()
     */
    val list = listOf(
        Data("소현", 530),
        Data("윈터", 111),
        Data("써머", 615)
    )

    for ((comp1, comp2) in list) {
        println("$comp1 / $comp2")
    }
}

class General(
    private val name: String,
    private val id: Int
)

data class Data(
    val name: String,
    val id: Int
)
