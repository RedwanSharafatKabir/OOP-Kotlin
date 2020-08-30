package All_Function_and_Properties

val foo1 = run {
    println("Calculating the answer...")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }

fun main(args: Array<String>) {
    println("$foo1 $foo1 $foo2 $foo2")
}
