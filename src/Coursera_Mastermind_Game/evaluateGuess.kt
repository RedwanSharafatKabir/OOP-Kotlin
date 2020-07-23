package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    // "ABCD".zip("EFGH"), here zip works to create four item-sets
    // each item-set will contain two items and
    // each of their first item will be from first string "ABCD"
    // and second item will be from second string "EFGH"
    // output will be [(A, E), (B, F), (C, G), (D, H)]
    val rightPosition = secret.zip(guess).count { p -> p.first == p.second }

    val repeatedLetters = "ABCDEF".sumBy {
        chars -> Math.min(secret.count { it == chars },
        guess.count { it == chars })
    }

    val wrongPosition = repeatedLetters - rightPosition

    return Evaluation(rightPosition, wrongPosition)
}
