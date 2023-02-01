package chap03

fun main(){
    normalVarargs(1,2,3)
    normalVarargs(10,11,12)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        print("$num ")
    }
    println()
}