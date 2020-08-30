package All_Basic_Coding
import java.util.*

fun fibonacci(n: Int): Int{
    if (n <= 1) {
        return n
    }
    return fibonacci(n-1) + fibonacci(n-2)
}

fun main(args: Array<String>){
    print("Enter last number of your fibonacci series: ")
    val s = Scanner(System.`in`)
    val n = s.nextInt()

    var first = 0
    var second = 1
    var next = 0
    var secondLastElement = 0

    for(i in 0..n) {
        if (i <= 1) {
            next = i
        } else {
            next = first + second
            first = second
            second = next
        }

        print("$next ")
        if(i==n-1){
            secondLastElement = next
        }
    }
    println()
    println("Second last element of series: $secondLastElement ")

//    println(fibonacci(n))
}
