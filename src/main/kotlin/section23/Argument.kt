package section23

fun main() {

    /**
     * default arguments
     */
    deliveryItem("짬뽕")
    deliveryItem("책", 3)
    deliveryItem("맥북", 30, "회사")

    /**
     * named arguments
     */
    deliveryItem("선물", destination = "친구 집")

    /**
     * variable number of arguments
     * : 다른 파라미터와 함께 쓸 때는 반드시 마지막에 써야한다.
     */
    sum(1, 2, 3, 4)


}

fun deliveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("$name ${count}개를 ${destination}에 배달하였습니다.")
}

fun sum(vararg numbers: Int) {
    var sum = 0

    for (n in numbers) {
        sum += n
    }

    println(sum)
}
