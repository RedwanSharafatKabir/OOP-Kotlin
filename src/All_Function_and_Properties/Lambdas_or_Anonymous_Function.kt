package All_Function_and_Properties

fun main (args: Array<String>){
    var dirtyLevel = 30
//    val waterFilter = { dirty : Int -> dirty / 2}
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
    println(waterFilter(dirtyLevel))

    val isEven = { i: Int -> i % 2 == 0 }
    println(isEven)
    val list = listOf(1, 2, 3, 4)
    println(list.any(isEven))
    println(list.filter(isEven))
    println(isEven(25)) // calling stored function
    run { print("Hello ") }
    println()

    val f1: () -> Int? = { null } // () -> Int? থাকলে value { } এর ভিতরে লিখতে হবে
    val f2: (() -> Int)? = null // (() -> Int)? থাকলে value এর আগে ও পড়ে { } নিষ্প্রয়োজন
    println("$f1\n$f2")

    // call member reference function variable
    println(predicate)
    println(predicate2)
    // pass function reference as argument
    val testList = listOf(1, 2, 3, 4, 5)
    println(testList.any(isEven))
    println(testList.filter(isEven))

    // Pluzzer
    println(duplicateNonZero(listOf(3, 0, 5)))
}

// member reference
fun isEven(i: Int): Boolean = i%2 == 0 // isEven is a non-bound function
//val predicate = isEven // compiler error
val predicate =:: isEven
val predicate2 = {i: Int -> isEven(i) }

fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if(it == 0) return listOf()
            listOf(it, it)
    }
}
