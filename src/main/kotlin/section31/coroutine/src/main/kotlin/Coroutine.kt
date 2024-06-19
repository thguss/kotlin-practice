package kr.co

import kotlinx.coroutines.*

fun main() {

    runBlocking { // 코루틴이 종료될 때까지 메인 루틴 대기
        val a = launch {
            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료"
        }

        println("async 대기")
        println(b.await())

//        println("launch 대기")
        println("launch 취소")
//        a.join() // Job 실행이 끝날 때까지 대기
        a.cancel() // 작업 도중 취소
        println("launch 종료")
    }
}
