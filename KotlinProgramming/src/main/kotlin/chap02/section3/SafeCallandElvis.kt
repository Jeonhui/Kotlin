package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 lenght: ${ str1?.length ?: -1}") // elvis operator (엘비스 연산자)
    // 옵셔널값 ?: null일 때의 값 / swift - OptionalValue ?? value

}