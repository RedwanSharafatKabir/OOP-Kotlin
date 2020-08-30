package All_Basic_Coding
import java.util.*

fun main(args: Array<String>){
    val s = Scanner(System.`in`)
    print("Will you surrender ?\ny/Yes OR\nn/No\nAns: ")
    println(respondToInput(s.nextLine()))
}

fun respondToInput(input: String) = when(input){
    "y", "Yes" -> "You are lucky."
    "n", "No" -> "I am going to teach you hard."
    else -> "I will destroy your cunt."
}
