fun main() {
    println((0..12).map { fibonacciNumber(it) })
    println(fibonacciSeries(12))
}

fun fibonacciSeries(n: Int): List<Int> {
    return when (n) {
        0 -> listOf(0)
        1 -> listOf(0, 1)
        else -> {
            fibonacciSeries(n - 1) + listOf(fibonacciSeries(n - 1).last() + fibonacciSeries(n - 2).last()).fold(0) { a, b ->
                a + b
            }
        }
    }
}

fun fibonacciNumber(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> listOf(fibonacciNumber(n - 1) + fibonacciNumber(n - 2)).fold(0) { a, b ->
            a + b
        }
    }
}
