package section5

fun main() {

    /**
     * if
     */
    val a = 7

    if (a > 10) {
        println("a는 10보다 크다.")
    } else {
        println("a는 10보다 작다.")
    }

    /**
     * when
     */
    doWhen(1)
    doWhen("sohyeon")
    doWhen(1L)
    doWhen(3.14)
    doWhen("Kotlin")

}

fun doWhen(a: Any) {
    val result = when(a) {
        1 -> "정수 1입니다."
        "sohyeon" -> "안녕하세요 소현입니다."
        is Long -> "Long 타입입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건도 만족하지 않습니다."
    }

    println(result) // when 안에서 바로 print도 가능
}