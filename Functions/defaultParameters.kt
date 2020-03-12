fun printMessageWithDefaultParams(prefix: String="[", postfix: String="]"){
    println("$prefix $postfix")
}

fun noReturnValue(message: String): Unit{
    println(message)
}

fun returnsInterger(x: Int, y: Int): Int{
    return x + y
}