package chap03.section2

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
}

fun main() {
//    namedParam(z = 300)
    normalVarargs(1, 2, 3, 4)
}