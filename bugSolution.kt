fun main() {
    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")

    // Correct way to remove elements from a map based on the key
    val keysToRemove = map.keys.filter { it % 2 == 0 }
    keysToRemove.forEach { map.remove(it) }
    println(map) // Output: {1=one, 3=three}

    //Alternative using filterNot
    val filteredMap = map.filterNot { it.key % 2 == 0 }
    println(filteredMap) //Output: {1=one, 3=three}

} 