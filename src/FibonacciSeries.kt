fun main(){
    val foo = (0..5).map { fibonacci(it) }
    println(foo)
}
fun fibonacci(n: Int): Int =  if (n == 0) 0 else if (n == 1) 1 else fibonacci(n - 1) + fibonacci(n - 2)