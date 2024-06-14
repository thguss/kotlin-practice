package section22

fun main() {

    val cola1 = Product("콜라", 1000)
    val cola2 = Product("콜라", 1000)
    val cola3 = cola1
    val cider = Product("사이다", 1000)

    println(cola1 == cola2) // 내용의 동일성
    println(cola1 === cola2) // 객체의 동일성
    println()

    println(cola1 == cola3)
    println(cola1 === cola3)
    println()

    println(cola1 == cider)
    println(cola1 === cider)

}

class Product(
    private val name: String,
    private val price: Int
) {
    override fun equals(other: Any?): Boolean {
        return if (other is Product) {
            name == other.name && price == other.price
        } else {
            false
        }
    }
}
