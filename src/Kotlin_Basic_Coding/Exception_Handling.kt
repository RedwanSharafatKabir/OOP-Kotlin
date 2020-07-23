package Kotlin_Basic_Coding

import java.io.IOException
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>){
//    val number = 70
    val number = try {
        Integer.parseInt(String.toString())
    } catch (e: NumberFormatException){
//        return
        null
    }

    foo2()

    val percentage =
            if(number in 0..50)
                number
            else {
                throw IllegalArgumentException("Percentage value $number is not between 0 and 50")
            }
}

@Throws(IOException::class)
fun foo2(){
    throw IOException("Hello Input Output Exception !")
}
