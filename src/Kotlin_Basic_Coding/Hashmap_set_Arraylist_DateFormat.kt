package Kotlin_Basic_Coding

val set1 = hashSetOf(10, 23, 36)
val list = arrayListOf(5, 18, 31)
val map = hashMapOf(5 to "Five", 18 to "Eighteen", 31 to "Thirty one")

fun String.get(index: Int) = '*'

fun main(args: Array<String>){
    println(set1)
    println(list)
    println(map)

    println(listOf('a', 'b', 'c').joinToString(
            separator = ", ", prefix = "(", postfix = ")"))

    val q = """To code,
        #or not to code ?""".trimMargin(marginPrefix = "#")
    println(q)

    val regex = "\\d{2}\\-\\d{2}\\-\\d{4}".toRegex()
    println(regex.matches("23-07-2020")) // true
    println(regex.matches("23-07-20")) // false

    println("ABC ".get(1)) // print value of index 1, that means B will be printed

}
