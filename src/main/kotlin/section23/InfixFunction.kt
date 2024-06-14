package section23

fun main() {

    /**
     * this: 6
     * x: 4
     */
    println(6 multiply 4)
    println(6 multiply(4))

}

infix fun Int.multiply(x: Int) = this * x
