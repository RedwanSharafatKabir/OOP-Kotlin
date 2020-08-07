package Kotlin_Basic_Coding

data class Hero(
        val name: String,
        val age: Int,
        val gender: Gender?
)
enum class Gender { MALE, FEMALE }

fun main (args: Array<String>){
    val heroes = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE))

    println(heroes.last().name)
    println(heroes.firstOrNull { it.age == 30 }?.name)
    println()

    try {
        println(heroes.first { it.age == 30 }.name) // It will throw exception
    } catch (e: Exception){
        println(e)}
    println()

    println(heroes.map { it.gender })
    println()

    println(heroes.map { it.age })
    println(heroes.map { it.age }.distinct())
    println(heroes.map { it.age }.distinct().size) // distinct() function will count two 29 ages once
    println()

    println(heroes.filter { it.age<30 }.size) // .filter shows output based on the given condition
    val (youngest, oldest) = heroes.partition { it.age < 30 }  // .partition is similar to .filter
    println(oldest.size)
    println(youngest.size)
    println()

    println(heroes.maxBy { it.age }?.name) // .maxBy shows output based on the maximum value of given condition
    println(heroes.minBy { it.age }?.name) // .minBy shows output based on the minimum value of given condition
    println(heroes.groupBy { it.age==29 })
    println()

    println(heroes.all { it.age<50 }) // here .all checks if all the values of ages are less than 50
    println()

    println(heroes.any { it.gender == Gender.FEMALE }) // checks if any gender is FEMALE
    println()

    val mapByAge: Map<Int, List<Hero>> = heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) -> group.size }!!
    println("$age $group")

    val mapByName: Map<String, Hero> = heroes.associateBy { it.name }  // age of Frenchy
    println(mapByName["Frenchy"]?.age) // map[key]
    println(mapByName.getValue("Frenchy").age) // map.getValue(key)
    println(mapByName["Unknown"]?.age) // map[key]
    try {
        println(mapByName.getValue("Unknown").age) // map.getValue(key)
    } catch (e:Exception){ println(e) }

    val mapByName1 = heroes.associate { it.name to it.age }
    println(mapByName1.getOrElse("Unknown") { 0 })

    val mapByName2 = heroes.associateBy { it.name }
    val unknownHero = Hero("Unknown", 25, null)
    println(mapByName2.getOrElse("unknown") { unknownHero }.age)

    // print maximum and minimum value using "flatMap" function
    val allPossiblePairs = heroes
            .flatMap { first -> heroes.map { second -> first to second }}
    val (older, younger) = allPossiblePairs.maxBy { it.first.age - it.second.age }!!
    println(older.name + ", " + younger.name)

}
