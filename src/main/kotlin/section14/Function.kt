package section14

fun main() {

    /**
     * 고차함수
     */
    b(::a) // 일반 함수를 고차 함수로 변경해주는 연산자 (::)

    /**
     * 람다함수
     */
    val c: (String) -> Unit = { str -> println("$str 람다함수")}
    b(c)

}

fun a(str: String) {
    println("$str 함수 a")
}

fun b(function: (String) -> Unit) {

    /**
     * 함수 파라미터
     * - function: (파라미터 정보) -> 리턴 타입
     * - void 일 경우 Unit
     */

    function("b가 호출한")
}