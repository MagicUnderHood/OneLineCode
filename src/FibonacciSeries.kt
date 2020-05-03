fun main(){
    println((0..12).map { fibonacci(it) })
}
fun fibonacci(n: Int): Int =  if (n == 0) 0 else if (n == 1) 1 else fibonacci(n - 1) + fibonacci(n - 2)