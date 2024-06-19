package section30

fun main() {

    var bitData: Int = 0b10000

    /**
     * 1 shl 2 : 좌측으로 2번 밀기 (0b100)
     * bitData 와 set 하여 bitData 저장 (0b10100)
     */
    bitData = bitData or (1 shl 2)
    println(bitData.toString(2)) // 이진수

    /**
     * 1 shl 4 : 좌측으로 4번 밀기 (0b10000)
     * bitData 와 clear 하여 저장 (0b10000)
     */
    val result = bitData and (1 shl 4)
    println(result.toString(2))

    println(result shr 4) // 원래 값 복원: 우측으로 4번 밀기 (0b1)

    /**
     * inv(): 반전
     */
    bitData = bitData and ((1 shl 4).inv())
    println(bitData.toString(2))

    println((bitData xor (0b10100)).toString(2))
}
