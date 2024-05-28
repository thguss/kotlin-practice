package section18

fun main() {
    /**
     * 다형성
     */

    val a = Drink()
    a.drink()

    val b: Drink = Cola()
    b.drink()

    if (b is Cola) { // 조건문 내에서만 잠시 다운 캐스팅
        b.washDishes()
    }

    val c = b as Cola // 반환값, 변수 모두 다운 캐스팅
    c.washDishes()
    b.washDishes()
}

open class Drink {
    val name = "음료"

    open fun drink() {
        println("${name}을 마십니다.")
    }
}

class Cola: Drink() {
    private var type = "콜라"

    override fun drink() {
        println("$name 중에 ${type}을 마십니다.")
    }

    fun washDishes() {
        println("${type}(으)로 설거지를 합시다.")
    }
}
