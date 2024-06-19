package section29

fun main() {

    val a = LateInitSample()

    println(a.getLateInitText())
    a.text = "새로 할당한 값"
    println(a.getLateInitText())

}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        return if (::text.isInitialized) {
            text
        } else {
            "기본값"
        }
    }
}
