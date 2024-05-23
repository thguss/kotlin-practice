package section6

fun main() {
    /**
     * 조건형 반복문: do, while
     */
    var a = 0

    while (a < 5) {
        println(a++) // 증가 연산자 (후위)
    }

    do { // 조건에 관계 없이 무조건 한 번 실행
        println(a++)
    } while (a < 10)

    /**
     * 범위 반복문: for
     */
    for (i in 0..9) {
        print(i)
    }

    println()

    for (i in 0 .. 9 step 3) {
        print(i)
    }

    println()

    for (i in 9 downTo 0) {
        print(i)
    }

    println()

    for (i in 9 downTo 0 step 3) {
        print(i)
    }

    println()

    for (i in 'a'..'e') {
        print(i)
    }
}