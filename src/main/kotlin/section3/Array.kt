package section3

fun main() {
    var intArr = arrayOf(1, 2, 3, 4, 5)

    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 8
    println(intArr[4])
}