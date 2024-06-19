package section29

fun main() {

    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_SANDWICH)
    foodCourt.searchPrice(FoodCourt.FOOD_BURGER)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when (foodName) {
            FOOD_PASTA -> 13000
            FOOD_SANDWICH -> 8000
            FOOD_BURGER -> 10000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원입니다.")
    }

    companion object {
        const val FOOD_PASTA = "파스타"
        const val FOOD_SANDWICH = "샌드위치"
        const val FOOD_BURGER = "버거"
        const val FOOD_PIZZA = "피자"
    }
}
