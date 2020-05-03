import kotlin.test.assertEquals

fun main(){
    val expectedFibonacciSeries = listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
    val fibonacciCount = 12
    assertEquals(expectedFibonacciSeries, (0..fibonacciCount).map { fibonacci(it) })
    assertEquals(expectedFibonacciSeries, (0..fibonacciCount).map { fibonacciNumber(it) })
    assertEquals(expectedFibonacciSeries, fibonacciSeries(fibonacciCount))
}