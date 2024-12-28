fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //This will throw an exception
    val index = 10
    println(doubledList[index])
}