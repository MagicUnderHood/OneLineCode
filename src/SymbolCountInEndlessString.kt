import java.util.*
import kotlin.test.assertEquals

// Complete the func function below.
/*fun func(s: String, n: Long): Long {
//    val symbolPredicate = ( it == 'a' )
    val length = s.length
    val lineNumberOfRepetitions = n / length
    val numberOfCharInString = s.count { it == 'a' }.toLong()
    val numberOfCharInRecurringString = numberOfCharInString * lineNumberOfRepetitions
    val remainderCount = n % length
    val remainderString = s.subSequence(0, remainderCount.toInt())
    val numberOfCharInRemainderString = remainderString.count { it == 'a' }
    val result = numberOfCharInRecurringString + numberOfCharInRemainderString
    return result
}*/

fun func(s: String, n: Long): Long {
    return s.count{it=='a'}.toLong()*n/s.length+s.subSequence(0,(n%s.length).toInt()).count{it=='a'}
}

fun main(args: Array<String>) {

    println(7L == func("aba", 10))
    println(1L == func("aba", 2))
    println(func("aba", 2))
    println(1L == func("aba", 1))

    println("return s.count{it=='a'}.toLong()*n/s.length+s.subSequence(0,(n%s.length).toInt()).count{it=='a'}".count())

/*    val scan = Scanner(System.`in`)
    println("0. Введите бесконечную строку:")
    val s = scan.nextLine()

    println("1. Введите ограничитель:")
    val n = scan.nextLine().trim().toLong()

    val result = func(s, n)

    println(result)*/
}
