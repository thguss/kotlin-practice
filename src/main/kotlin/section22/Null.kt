package section22

fun main() {

    val a: String? = null
    val b: String? = "Kotlin Exam"

    /**
     * null safe
     */
    println(a?.uppercase())

    a?.run { // null이면 전체 수행되지 않음
        println(uppercase())
        println(lowercase())
    }

    b?.run {
        println(uppercase())
        println(lowercase())
    }

    /**
     * elvis
     */
    println(a?:"default".uppercase())

    /**
     * non-null assertion
     */
    println(a!!.uppercase()) // NPE
}
