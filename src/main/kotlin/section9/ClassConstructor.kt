package section9

fun main() {

    /**
     * 기본 생성자
     */
    Person("김소현00", 2000)
    Person("김소현01", 2001)
    Person("김소현02", 2002 )

    /**
     * 보조 생성자
     */
    Person("A양")
    Person("B양")
    Person("C양")

}

class Person(
    private var name: String,
    private val birthYear: Int
) {

    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    /**
     * 보조 생성자
     */
    constructor(name: String): this(name, 2000) {
        println("보조 생성자가 사용되었습니다.")
    }
}