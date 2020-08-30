package All_Exception_Handling

fun String.lastChar() = get(length - 1)

//fun main(args: Array<String>){
//    val c:Char = "SEX".lastChar()
//    println(c)
//}

fun sum (list: List<Int>): Int{
    var result = 0
    for(i in list){
        result += i
    }

    return result
}

fun main(args: Array<String>){
    val summation = sum(listOf(5, 15, 30))
    println(summation)
}
