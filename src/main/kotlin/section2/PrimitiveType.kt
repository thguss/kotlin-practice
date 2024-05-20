package section2

fun main() {

    /**
     * 정수
     */
    val intValue: Int = 1234
    val longValue: Long = 1234L
    val intValueByHex: Int = 0x1af // 16진수 : 0x
    val intValueByBin: Int = 0b101010 // 2진수 : 0b

    /**
     * 실수
     */
    val doubleValue: Double = 123.5 // 기본 실수형은 double
    val doubleValueWithExp: Double = 123.5e10 // 지수 표기법 : e10
    val floatValue: Float = 123.5f

    /**
     * 문자
     */
    val charValue: Char = 'a'
    val koreanCharValue: Char = '가'

    /**
     * Boolean
     */
    val booleanValue: Boolean = true

    /**
     * 문자열
     */
    val stringValue = "one line string test"
    val multiLineStringValue = """multiline
    string
    test"""
}