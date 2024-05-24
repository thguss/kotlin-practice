package section10

open class Animal(
    private var name : String,
    private var age : Int,
    private var type : String
) {

    /**
     * 코틀린은 상속 금지가 기본이다.
     * open을 추가해주면 상속이 가능하다.
     */

    fun introduce() {
        println("저는 $type ${name}이고, ${age}살입니다.")
    }
}