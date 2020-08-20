// Complete the func function below.
/*fun func(s: String, n: Long): Long {
    val numberOfCharInString = s.count { it == 'a' }.toLong()
    val numberOfCharInRecurringString = numberOfCharInString * (n / s.length)
    val remainderCount = n % s.length
    val remainderString = s.take(n.toInt() % s.length)
    val numberOfCharInRemainderString = remainderString.count { it == 'a' }
    return numberOfCharInRecurringString + numberOfCharInRemainderString
}*/

fun func(s: String, n: Long): Long {
    return s.count{it=='a'}.toLong()*(n/s.length)+s.take(n.toInt()%s.length).count{it=='a'}
}

fun main(args: Array<String>) {

    println(7L == func("aba", 11)) //abaabaabaab
    println(1L == func("aba", 2))
    println(1L == func("abaaba", 1))
    println(1L == func("ababjknbj", 2))
    println(2L == func("ababjknbj", 3))
    println(7L == func("abaaba", 10))
    println(0L == func("ba", 1))
    println(1L == func("ba", 2))
    println(5L == func("ba", 10))

    println("return s.count{it=='a'}.toLong()*(n/s.length)+s.take(n.toInt()%s.length).count{it=='a'}".count())

/*    val scan = Scanner(System.`in`)
    println("0. Введите бесконечную строку:")
    val s = scan.nextLine()

    println("1. Введите ограничитель:")
    val n = scan.nextLine().trim().toLong()

    val result = func(s, n)

    println(result)*/
}

//fun String.f()=count{it=='a'}