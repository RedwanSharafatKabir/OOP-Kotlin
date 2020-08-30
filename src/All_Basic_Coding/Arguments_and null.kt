package All_Basic_Coding

fun main(args: Array<String>){
    val starting = "Bismillahir-Rahmanir-Rahim"
    val satisfied = if(args.size > 0) args[0] else "Alhamdulillah"
    println("$starting\n$satisfied.")

    println("Hello ${null}!")
    println("Good bye ${args.getOrNull(0)}!")
}
