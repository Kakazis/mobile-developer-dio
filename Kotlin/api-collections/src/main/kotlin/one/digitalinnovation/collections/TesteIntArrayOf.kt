package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 5, 1, 10, 8)

    values.forEach {
        println(it)
    }

    values.sort()
    values.forEach {
        println(it)
    }

}