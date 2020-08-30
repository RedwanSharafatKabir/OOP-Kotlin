package Corsera_Nicestring
import java.util.*

object nicestring_test_sample {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        val str: String
        var i: Int
        var j: Int
        var countvowel = 0
        var pass = 0
        var temp = 0
        str = s.next()
        val ch = str.toCharArray()
        i = 0
        while (i < str.length) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                countvowel++
            }
            i++
        }
        if (countvowel >= 3) {
            pass++
        }
        i = 1
        while (i < str.length) {
            if (ch[i] == ch[i - 1]) {
                temp++
                break
            }
            i++
        }
        if (temp > 0) {
            pass++
        }
        i = 0
        while (i < str.length) {
            if (ch[i] == 'b' && (ch[i + 1] == 'u' || ch[i + 1] == 'a' || ch[i + 1] == 'e')) {
                pass++
                break
            }
            i++
        }

        if (pass >= 2) {
            println("$str is nice.")
        } else if (pass < 2) {
            println("$str isn't nice.")
        }
    }
}
