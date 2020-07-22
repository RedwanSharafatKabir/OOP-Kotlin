package Kotlin_Basic_Coding

import java.util.Random

fun main(args: Array<String>){
    // go to Run > Edit Configurations > Kotlin > Current code file name > Program arguments (now edit)
    println("Hello ${args[0]}!")

    // If we print something inside a val variable
    // Again we print the same variable for 2nd time, it will print "kotlin.Unit"
    // Because println() does not return a value, so it returns "kotlin.Unit"
    val testPrint = println("Good bye world")
    println(testPrint)

    println(listOf('a', 'b', 'c').joinToString(
            separator = ", ", prefix = "(", postfix = ")"))

    println(mutableListOf('A', 'B', 'C').joinToString(
            separator = ", ", prefix = "{", postfix = "}"))

    // If we don not use >>> separator = "" <<< it will generate comma operator automatically
    println(listOf(1, 2, 3).joinToString(postfix = "."))
    displayPattern()
    displayPattern('*', 8)
    displayPattern('&')
    displayPattern(size = 15)
    displayPattern(size = 15, character = '^')

    feedMe()

    // We can call a function without parameters and
    // also pass parameters in that function which contains arguments
    runSpeed()
    runSpeed("deer")
    runSpeed(speedTest = "turtle")
}

fun feedMe(){
    val day = randomDay()
    val food = randomFood(day)
    println("Today is $day and I love $food.")

    // We can call a function without parameters and
    // also pass parameters in that function which contains arguments
    println("Change food menu: ${shouldChangeFoodMenu(day)}")
    println("Change food menu: ${shouldChangeFoodMenu(day, 25, 56)}")
}

fun randomDay(): String{
    val weekDays = arrayOf("sunday", "monday", "tuesday", "wednesday",
            "thursday", "friday", "saturday")

    return weekDays[Random().nextInt(weekDays.size)]
}

fun randomFood(day: String): String{
    var food: String
    when(day){
        "sunday" -> food = "bread and egg poach"
        "monday" -> food = "pangash fish"
        "tuesday" -> food = "khichuri and beef"
        "wednesday" -> food = "lobster"
        "thursday" -> food = "chicken"
        "friday" -> food = "mutton kacchi"
        "saturday" -> food = "your tits and cunt"
        else -> food = "404. food not found"
    }

    return food
}

// pass parameter in function
fun runSpeed(speedTest: String = "cheetah"){
    println("Run like a $speedTest.")
}

fun isTooHot(temperature: Int) = temperature > 21

fun dirtyEnvironmentTest(dirty: Int = 25): Int{
    val dirty1: Int
    when(dirty){
        20 -> dirty1 = dirty
        else -> dirty1 = 40
    }
    return dirty1
}

fun shouldChangeFoodMenu (day: String, temperature: Int = 22, dirty: Int = dirtyEnvironmentTest()): Boolean {
    return when {
        isTooHot(temperature) -> true
        dirty > 36 -> true
        day == "Friday" ->  true
        else -> false
    }
}

fun displayPattern(character: Char = '*', size: Int = 10){
    repeat(size){
        print(character)
    }
    println()
}
