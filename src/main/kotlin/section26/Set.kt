package section26

fun main() {

    val a = mutableSetOf("귤", "배", "복숭아")

    for (item in a) {
        println(item)
    }

    a.add("패션후르츠")
    println(a)

    a.remove("귤")
    println(a)

    println(a.contains("복숭아"))
}
