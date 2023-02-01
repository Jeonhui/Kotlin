package chap03

fun main() {
    var result: Int
    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    result = multi(10,20)
    println(result)
}