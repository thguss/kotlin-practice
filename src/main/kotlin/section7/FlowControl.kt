package section7

fun main() {
    println("#1")

    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }

    println("\n#2")

    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }

    println("\n#3. 다중 반복문")

    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }
}