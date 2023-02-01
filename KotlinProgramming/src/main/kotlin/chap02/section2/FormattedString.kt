package chap02.section2

typealias  Username = String

fun main(){
    val num = 10
    val formattedString = """
        var a = 6
        var b = "kotlin"
        println(a + num)
    """
    println(formattedString)

    val user: Username = "Kildong"
    println(user)
}

