fun main(args: Array<String>) { // ktlint-disable filename
    val someMap = mapOf("one" to 1, "two" to 2)
    println("Value for one is: ${someMap.get("one")}")
    println("Value for unknown key is: ${someMap.get("blah")}")
    println("Value for getOrDefault is: ${someMap.getOrDefault("blah", 100)}")
    println("Value for two is: ${someMap["two"]}")

//    ==========
//    Map Filter
//    ==========
    val mapForFilter = mapOf("one" to 1, "two" to 2, "three" to 3, "fourty" to 40)
    val filtered = mapForFilter.filter { (key, value) -> value > 4 }
    println("filtered: $filtered")
    val filteredByKey = mapForFilter.filterKeys { it.endsWith("ty") }
    println("filteredByKey: $filteredByKey")
    val filteredByValue = mapForFilter.filterValues { it > 2 }
    println("filteredByValue: $filteredByValue")

//    ==========
//    Plus Minus
//    ==========
    val plusMap1 = mapForFilter + Pair("fifty", 50)
    println("plusMap1: $plusMap1")

    val plusMap2 = mapForFilter + mapOf("Seven" to 7)
    println("plusMap2: $plusMap2")

    val minusMap1 = mapForFilter - "one"
    println("minusMap1: $minusMap1")
    val minusMap2 = mapForFilter - listOf("one", "two")
    println("minusMap2: $minusMap2")

//    ==========
//    Map Write
//    ==========
    val writeMap = mutableMapOf("one" to 1, "two" to 2, "four" to 4, "five" to 5)
    writeMap.put("eight", 8)
    writeMap.keys.remove("two")
    writeMap.values.remove(5)
    writeMap.putAll(setOf("nine" to 9, "ten" to 10))

    writeMap += mapOf("eleven" to 11)
    println("shorthand : $writeMap")
    writeMap -= "one"
    println("shorthand remove : $writeMap")


}
