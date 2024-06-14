package section26

fun main() {

    val a = mutableMapOf(
        "레드벨벳" to "feel my rhythm",
        "에스파" to "supernova",
        "엔믹스" to "dash"
    )

    for (entry in a) {
        println("${entry.key} : ${entry.value}")
    }

    a.put("뉴진스", "how sweet")
    println(a)

    a.remove("레드벨벳")
    println(a)

    println(a["에스파"])
}
