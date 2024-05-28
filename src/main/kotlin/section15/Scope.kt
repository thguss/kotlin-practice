package section15

fun main() {
    /**
     * 스코프 함수
     */

    val price = 5000

    val a = Book("코틀린 연습하기", 10000).apply {
        name = "[초특가] " + name
        discount()
    }

    a.run {
        println("상품명: ${name}, 가격: ${price}원") // 5000원
    }

    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원") // 8000원
    }
}

class Book(
    var name: String,
    var price: Int
) {

    fun discount() {
        price -= 2000
    }
}
