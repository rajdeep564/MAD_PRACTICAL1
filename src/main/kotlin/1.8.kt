tailrec fun factorial(n: Int, result: Long = 1): Long {
    return if (n == 0) {
        result
    } else {
        factorial(n - 1, result * n)
    }
}
fun main(){
    var x : Long = factorial(12)
    println("$x")
}