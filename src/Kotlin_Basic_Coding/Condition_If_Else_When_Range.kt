package Kotlin_Basic_Coding
import java.util.*

fun main(args: Array<String>){
    val s = Scanner(System.`in`)
    print("Enter your age: ")
    val age: Int = s.nextInt()

    if(age<=15){
        println("Kiddo")
    } else if(age>15 && age<=35){
        println("Young")
    } else if(age in 35..50){
        // "in" is used to define as a range of value
        // here range is from 35 to 50 years
        println("Middle aged")
    } else if(age in 51..130){
        println("Old buddy")
    } else {
        println("Legendary aged human")
    }

    // when works as switch
    when(age) {
        15 -> println("Kiddo")
        in 15..35 -> println("Young")
        in 35..50 -> println("Middle aged")
        in 51..130 -> println("Old buddy")
        else -> println("Legendary aged human")
    }

    val(str, ages) = when {
        age <= 15 -> "Kid's age is" to age
        age in 15..35 -> "Bro's age is" to age
        age in 35..50 -> "Uncle's age is" to age
        age in 51..130 -> "Grandpa's age is" to age
        else ->  "Legend grandpa's age is" to age
    }
    println("$str $ages")

    val temperature = 7
    val isHot = if (temperature > 30) true else false
    println(isHot)

    val message = "The water temperature is ${ if (temperature <10) "too cold" else "perfect." }."
    println(message)
}
