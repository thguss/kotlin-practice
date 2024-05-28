package section17

fun main() {
    /**
     * 옵저버
     */

    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter(
    private val listener: EventListener
) {

    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter: EventListener {
    override fun onEvent(count: Int) {
        print("${count}-")
    }

    fun start() {
        val counter = Counter(this)
        counter.count()
    }
}
