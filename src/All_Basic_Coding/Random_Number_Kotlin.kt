package All_Basic_Coding

import java.util.Random

object Random_Number_Kotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val random = Random()
        val randomGeneratedNumber = random.nextInt()
        println(randomGeneratedNumber)

        // show random value between two specific numbers
        val max = 15
        val min = 10
        val randomGeneratedNumber2 = min + random.nextInt(max - min + 1)
        println(randomGeneratedNumber2)
    }
}
