package Kotlin_Basic_Coding

fun main(args: Array<String>){
    val decoration = listOf("rock", "pagoda", "plastic-plant", "alligator", "flowerpot")

    // Here "filter" determines the value contains 'l' in first index or index "it[0]".
    val eager = decoration.filter { it[1] == 'l' }

    for(elements in eager){print("$elements ")}
    println()
    eager.forEach{ print(it + " ")}
    println()
    eager.forEach{ output -> print("$output ")}
    println("\n")
    println("eager: $eager")
    println()

    // pint the sequence of the list of 6 no. comment condition
    val filtered = decoration.asSequence().filter { it[1] == 'l' }
    println("filtered: $filtered")

    // convert sequence to list
    val newList = filtered.toList()
    println("newList: $newList")
    println()

    // show decoration list elements are accessed
    val lazyMap = decoration.asSequence().map {
        println("accessed: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    // show accessed elements of filtered list elements
    val lazyMap2 = eager.asSequence().map{
        println("accessed: $it")
        it
    }

    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}
