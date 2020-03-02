package chap03.section3

fun main() {
    val result: Int

    val multi = {x: Int, y: Int -> x * y}
    val greet = { println("Hello World") }
    var square = { x: Int -> x * x }

//    result = multi(10, 20)
//    println(result)

//    greet()
    println(square(5))
}
