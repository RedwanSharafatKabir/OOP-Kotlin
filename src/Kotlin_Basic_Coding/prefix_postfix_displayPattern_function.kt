package Kotlin_Basic_Coding

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

}

fun displayPattern(character: Char = '*', size: Int = 10){
    repeat(size){
        print(character)
    }
    println()
}
