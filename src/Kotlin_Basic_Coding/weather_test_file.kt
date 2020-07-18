package Kotlin_Basic_Coding
import java.awt.Color
import java.util.*

fun main(args: Array<String>) {
    val S1= Scanner(System.`in`)
    print("আজকের তাপমাত্রা কত ডিগ্রী ? ")
    val inputFromUser: Int = S1.nextInt()
    updateweather(inputFromUser)
}

fun updateweather(degree: Int) {
    val (description, color) = when {
        degree < 10 -> "শীত" to Color.BLUE
        degree <= 25 -> "বসন্ত" to Color.GREEN
        else -> "গ্রীষ্ম" to Color.RED
//        degree < 10 -> Pair("শীত", Color.BLUE)
//        degree <= 25 -> Pair("বসন্ত", Color.GREEN)
//        else -> Pair("গ্রীষ্ম", Color.RED)
    }
    println("এখন $description ঋতু, \nপ্রকৃতি আজ $color রঙে রঙিন")

///////////////////////////////////////////////////////////////// OR
//    val (description: String, color: Color)=
//        if (degree < 10) {
//            Pair("cold", Color.BLUE)
//        } else if (degree <= 26) {
//            Pair("mild", Color.GREEN)
//        } else {
//            Pair("hot", Color.RED)
//        }
//    println("Today is $description \n$color")
///////////////////////////////////////////////////////////////// OR
//    val description: String
//    val color: Color
//    if (degree < 10) {
//        description = "cold"
//        color = Color.BLUE
//    } else if (degree <= 26) {
//        description = "mild"
//        color = Color.GREEN
//    } else {
//        description = "hot"
//        color = Color.RED
//    }
//    println("Today is $description \n$color")

}
