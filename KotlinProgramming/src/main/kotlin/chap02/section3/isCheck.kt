package chap02.section3

import java.util.Arrays

fun main(){
    val num = 256

    if (num is Int) {
        print(num)
    } else if (num !is Int) { // == if (!(num is Int))
        print("Not a Int")
    }

    val x: Any
    x = "Hello"
    if (x is String) {
        print(x.length) // is String 통과시 type casting
    }

    val a: Any = "Hello"
    val b: String = a as String
    val c: String? = a as? String
}