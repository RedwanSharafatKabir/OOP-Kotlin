package All_Basic_Coding

fun main(args: Array<String>){
    val a: Int? = null
    val b: Int? = 5
    val c: Int = 3

    val s1 = (a ?: 0) + c
    val s2 = (b ?: 0) + c
    println("$s1 $s2")

    val x: Int? = 1
    val y: Int = 2
    val sum = x ?: 0 + y // val sum = (x ?: 0) + y, here sum will print 3
    println("$sum")

    // Type casting
    val any = 51
    val str = "HeLlo"
    println(str)

    if(str is String){
        //val s = any as String
        println(str.toUpperCase())
    }

    println((str as? String)?.toLowerCase())

    // If "any" variable is String it will print the string, if not it will print null
    val str1: String? = any as? String
    println(str1)

    // If variable is string, Int? will throw exception
    // If variable is string or Int, as? will print null
    // If variable is Int, Int? will print null
    println(str1 as Int?)
    println(str1 as? Int)
    println(str as? Int)
    println(str as Int?)
    
}

fun foo(list1: List<Int?>, list2: List<Int>?) {
    list1.size
    list2?.size

    val i: Int? = list1.get(0)
    val j: Int? = list2?.get(0)
}
