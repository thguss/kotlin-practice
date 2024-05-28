package section17

fun main() {
    /**
     * 익명 객체
     */

    EventPrinter2().start()
}

interface EventListener2 {
    fun onEvent(count: Int)
}

class Counter2(
    private val listener: EventListener2
) {

    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter2 {

    fun start() {
        val counter = Counter2(object : EventListener2 {
            override fun onEvent(count: Int) {
                println("${count}-")
            }
        })
    }
}
