package section11.interfacee

class Dog : Runner, Eater {

    override fun run() {
        println("꽁꽁 얼어붙은 한강 위로 강아지가 뛰어다닙니다.")
    }

    override fun eat() {
        println("와구와구 먹습니다.")
    }
}