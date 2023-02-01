package chap02.section3

fun main(){
    val a: Int = 128
    val b = a
    println(a === b) // same reference

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // compare content (true)
    println(c === d) // difference reference - diff data type (false)
    println(c === e) // same reference (true)
}