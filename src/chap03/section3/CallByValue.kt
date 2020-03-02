package chap03.section3

val lambda = {
    println("lambda function")
    true
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue Function")
    return b
}

fun main() {
    val result = callByValue(lambda())
    println(result)
}