package All_Basic_Coding
import java.awt.Color

class weather_test_class {
    fun main(args: Array<String>) {
        updateweather(38)
    }
    companion object {
        fun updateweather(degree: Int) {
            val description: String
            val color: Color
            if (degree < 10) {
                description = "cold"
                color = Color.BLUE
            } else if (degree <= 26) {
                description = "mild"
                color = Color.GREEN
            } else {
                description = "hot"
                color = Color.RED
            }
            println("Today is $description $color")
        }
    }
}
