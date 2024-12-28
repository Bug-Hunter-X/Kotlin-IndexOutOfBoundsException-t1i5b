fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //Safe way to access the element using in operator
    val index = 10
    if (index in doubledList.indices) {
        println(doubledList[index])
    } else {
        println("Index is out of bounds")
    }
    
    //Another approach using getOrNull()
    val element = doubledList.getOrNull(index)
    println(element ?: "Element not found")
} 