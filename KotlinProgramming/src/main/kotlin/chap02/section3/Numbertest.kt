package chap02.section3

fun main(){
    var test: Number = 12.2 // float Smart Cast 자동형변환
    println("$test")

    test = 12 // int
    println("$test")

    test = 120L // long
    println("$test")

    test += 12.0f // float
    println("$test")
}