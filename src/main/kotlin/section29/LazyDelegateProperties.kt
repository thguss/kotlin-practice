package section29

fun main() {

    val number : Int by lazy {
        println("초기화합니다.")
        7
    }

    println("코드를 시작합니다.")
    println(number) // 변수 초기화 시점 (lazy 전략)
    println(number) // 이미 초기화되어있으므로 초기화 단계 X

}
