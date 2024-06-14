package section21

fun main() {
    val test1 = "Test.Kotlin.String"

    println(test1.length)

    println(test1.uppercase())
    println(test1.lowercase())

    val test2 = test1.split(".")
    println(test2)

    /**
     * joinToString()
     */
    println(test2.joinToString())
    println(test2.joinToString("-"))

    println(test1.substring(5..10))

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "A"

    /**
     * isNullOrEmpty()
     */
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    /**
     * isNullOrBlank()
     */
    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    println()

    val test3 = "kotlin.kt"
    val test4 = "java.java"

    /**
     * startsWith()
     */
    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println()

    /**
     * endsWith()
     */
    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println()

    /**
     * contains()
     */
    println(test3.contains("lin"))
    println(test4.contains("lin"))
}
