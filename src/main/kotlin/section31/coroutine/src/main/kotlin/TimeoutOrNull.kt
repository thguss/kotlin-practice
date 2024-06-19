package kr.co

import kotlinx.coroutines.*

fun main() {

    runBlocking {
        val result = withTimeoutOrNull(50) { // timeout 값 = 50
            for (i in 1..10) {
                println(i)
                delay(10)
            }
            "Finish"
        }

        println(result) // 타임아웃 내에 수행할 수 없어 도중에 null 출력
    }
}
