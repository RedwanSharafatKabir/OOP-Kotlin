@file:JvmName("Util")
package Kotlin_Basic_Coding

fun main(args: Array<String>){
    println("First ${foo()}, Second ${foo()}, Third ${foo()}")
    val a = 25
    val b = 22
    val c = 49
    val d = 56
    println(max(a, b))
    displayMin(c, d)
}

fun foo(): String{
    val language = mutableListOf("Java")
    language.add("Kotlin")
    println(language)
    return "foo"
}

fun max(a: Int, b: Int) = if(a>b) a else b
fun min(a: Int, b: Int) = if(a<=b) a else b

fun displayMin(a: Int, b: Int): Unit{
    println(min(a, b))
}

// go to class Call_top_level_function_from_Java in package Call_function_from_Java
fun call_top_level_function_from_java() = "Alhamdulillah, successful."
