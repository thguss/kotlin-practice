package section25

fun main() {

    var state = Status.SING
    println(state)

    state = Status.SLEEP
    println(state.isSleeping())

    state = Status.EAT
    println(state.message)
}

enum class Status(
    val message: String
) {
    SING("노래 부르기"),
    EAT("밥 먹기"),
    SLEEP("잠자기");

    fun isSleeping() = this == SLEEP
}
