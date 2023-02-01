package chap03

fun main() {
    namedParam(z = 1)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}