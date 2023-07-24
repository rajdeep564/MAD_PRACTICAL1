import java.util.Arrays

fun main() {
    val intArray = intArrayOf(5, 2, 7, 1, 9)
    val charArray = charArrayOf('a', 'b', 'c', 'd', 'e')
    val stringArray = arrayOf("apple", "banana", "orange", "grape", "kiwi")
    val twoDArray = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))

    val doubleArray = DoubleArray(5) { index -> (index + 1) * 1.5 }

    println("Int Array: " + intArray.contentToString())
    println("Char Array: " + charArray.contentToString())
    println("String Array: " + stringArray.contentDeepToString())
    println("2D Array: " + Arrays.deepToString(twoDArray))
    println("Double Array: " + doubleArray.contentToString())

    println("Int Array joined: " + intArray.joinToString())
    println("String Array joined: " + stringArray.joinToString(", "))

    println("Printing numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    println("Printing numbers from 10 down to 1:")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    println("Printing numbers from 1 to 9 (excluding 9):")
    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    val sortedIntArray = bubbleSort(intArray.copyOf())
    println("Sorted Int Array (without inbuilt function): ${sortedIntArray.contentToString()}")

    val sortedIntArrayUsingInbuilt = intArray.sortedArray()
    println("Sorted Int Array (using inbuilt function): ${sortedIntArrayUsingInbuilt.contentToString()}")
}

fun bubbleSort(arr: IntArray): IntArray {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}
