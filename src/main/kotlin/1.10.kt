fun main() {
    val numbers = arrayListOf(12, 45, 67, 23, 9, 56, 78, 100, 4, 35)
    val maxNumber = numbers.maxOrNull()
    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The list is empty.")
    }
}
