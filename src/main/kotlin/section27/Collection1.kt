package section27

fun main() {

    val nameList = listOf("김민정", "오해원", "임나연", "강해린", "임윤아")

    nameList.forEach{ print("$it ")}
    println()

    println(nameList.filter { it.startsWith("임") })

    println(nameList.map { "이름: $it" })

    println(nameList.any { it == "팜하니" })
    println(nameList.all { it.length == 3 })
    println(nameList.none { it.startsWith("이") })

    println(nameList.first { it.startsWith("임") })
    println(nameList.last { it.startsWith("임") })

    println(nameList.count { it.contains("해") })
}
