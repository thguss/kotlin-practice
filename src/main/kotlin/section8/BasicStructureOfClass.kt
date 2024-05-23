package section8

fun main() {
    /**
     * 클래스의 기본 구조
     */

    val a = Person("김소현", 2000)
    a.introduce()
}

class Person (var name: String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}