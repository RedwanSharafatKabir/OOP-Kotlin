package Kotlin_Basic_Coding
import java.util.*

fun main(args: Array<String>){
    // simple list
    val School_Of_Thought = listOf("Hanafi","Shafee","Maliki","Hanbali")
    println(School_Of_Thought)

    // remove element from a list
    val Fiqh = mutableListOf("Hanafi","Shafee","Maliki","Hanbali","Maturidi")
    Fiqh.remove("Maturidi")
    println(Fiqh)
    println("Size of list Fiqh: " + Fiqh.size)

    // arrayOf() function for all data types element in one array
    val Madhab = arrayOf("Hanafi","Shafee","Maliki","Hanbali", 4)
    println(Arrays.toString(Madhab))
    println("Size of array Madhab: " + Madhab.size)

    // integer array
    val FiqhImams = intArrayOf(1, 2, 3, 4, 40)
    println(Arrays.toString(FiqhImams))
    // .get(0) determines the value of 1st index of an array
    println("Size of integer array FiqhImams: " + FiqhImams.get(3))

    val HadithImams = intArrayOf(2, 4, 6, 9, 12)
    println(Arrays.toString(HadithImams))
    // array[4] determines the value of 5th index of an array
    println("Size of integer array HadithImams: " + HadithImams[4])

    // add two integer arrays
    val HadithAndFiqhImams = FiqhImams + HadithImams
    println("\nHadith and Fiqh Imams Rahimahullah:\n" + Arrays.toString(HadithAndFiqhImams))

    // add multiple lists and arrays
    // if an array is integer type is must be converted to string to show the elements of it
    val multiListWithArray = listOf(Arrays.toString(FiqhImams), Fiqh, "Successful")
    println("\n$multiListWithArray")

    // make an array with loop
    val testArray = Array(10) { it*2 }
    println("Test array: " + Arrays.toString(testArray))

    // print array testArray and list Fiqh as string without [, ] using for loop
    print("Test array: ")
    for(elements in testArray){
        print("$elements ")
    }
    println()
    print("Fiqh: ")
    for(elements in Fiqh){
        print(elements + " ")
    }
    println("\n")

    // print index and elements of array and list using for loop
    for((index, element) in Fiqh.withIndex()){
        println("Element of index no. $index is $element")
    }

    // print serial elements using 'in' in for loop
    for(i in 1..10){
        print("$i ")
    }
    println()

    // print downward elements using for loop
    for(i in 10 downTo 1){
        print("$i ")
    }
    println()

    // print serial numbers 2 steps ahead of each element
    for (i in 1..10 step 2) print("$i ")
    println()

    // print serial alphabets using for loop
    for (i in 'a'..'z') print ("$i ")
    println()

    // while(){} loop
    var bubbles = 0
    while (bubbles < 25) {
        bubbles++
    }
    println("\n$bubbles bubbles in the water")

    // do-while loop
    do {
        bubbles--
    } while (bubbles > 25)
    println("$bubbles bubbles in the water")

    // use of repeat() function
    repeat(3) {
        println("Teacher gave an assignment.")
    }

    // ? means the type is fixed but other Integer numbers or null can be assigned as value
    var rocks: Int? = 3
    println(rocks)
    rocks = null
    println(rocks)

    // Iterating over map
    val map = mapOf(1 to "One",
                    2 to "Two",
                    3 to "Three")
    for((key, value) in map){
        println("Key: $key = Value: $value")
    }

    // print serial letters after 2 letters past, if there is any space it prints "!"
    for(ch in "abocd"){
        print(ch + 2)
    }
    println()

    // until function
    for(c in '0' until '9'){
        print(c + " ")
    }
    println()

    println(("Kotlin" in "Java".."Scala"))
    // It will give an error "Type inference failed"
//    println(("Kotlin" in setOf("Java".."Scala")))
}
