package section13

val str = "패키지 스코프"

class Test {

    val str = "클래스 스코프"

    fun print() {
        println(str)
    }
}

fun main() {

    val str = "함수 스코프"
    println(str) // 함수 스코프
    Test().print() // 클래스 스코프
}