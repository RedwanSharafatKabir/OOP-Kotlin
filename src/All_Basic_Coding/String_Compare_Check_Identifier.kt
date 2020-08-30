package All_Basic_Coding

fun isValidIdentifier(str: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch in '0'..'9' || ch in 'a'..'z'
            || ch in 'A'..'Z'

    if(str.isEmpty() || str[0].isDigit()){
        return false
    }

    for(ch in str){
        if(!isValidCharacter(ch))
            return false
    }

    return true
}

fun main(args: Array<String>){
    println(isValidIdentifier("name"))
    println(isValidIdentifier("_name"))
    println(isValidIdentifier("_NaMe"))
    println(isValidIdentifier(""))
    println(isValidIdentifier("_15"))
    println(isValidIdentifier("051"))
}
