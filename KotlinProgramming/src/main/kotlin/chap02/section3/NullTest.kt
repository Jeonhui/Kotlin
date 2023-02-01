package chap02.section3

fun main(){
    var str1: String = "Hello Kotlin"
//    str1 = null // -> Error

    var str2: String? = "Hello Kotlin"
    str2 = null

    var str3: String? = "Hello Kotlin"

    println("str1: $str1")
    println("str2: ${str2}")
    println("str2?.length: ${str2?.length}") // Safely UnWrapping
//    println("str2!!.length: ${str2!!.length}") // Forced UnWrapping (Error - NPE, str == null)
    println("str3!!.length: ${str3!!.length}") // Forced UnWrapping (강제 언래핑)

    val let = if (str2 != null) str1.length else -1 // ternary operator (삼항 연산자)
}