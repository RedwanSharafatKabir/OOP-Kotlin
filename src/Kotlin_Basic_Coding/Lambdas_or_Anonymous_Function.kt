package Kotlin_Basic_Coding

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

}
