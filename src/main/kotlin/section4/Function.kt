package section4

fun main() {
    println(add(1, 2, 3))
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

/**
 * 단일 표현식 함수
 * - 타입 추론 가능
 */
fun add2(a: Int, b: Int, c: Int) = a + b + c