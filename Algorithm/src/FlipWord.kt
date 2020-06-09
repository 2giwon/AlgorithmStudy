import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val reader = BufferedReader(InputStreamReader(System.`in`))
    val n: Int = reader.readLine().toInt()
    val arr = Array(n) { "" }
    for (i in 0 until n) {
        arr[i] = reader.readLine()
    }
    reader.close()
    FlipWord().flipWord(n, arr)
}

class FlipWord {
    fun flipWord(n: Int, strArray: Array<String>): String {
        val stack = Stack<Char>()
        val result: StringBuilder = StringBuilder()
        for (i in 0 until n) {
            result.clear()
            strArray[i].split(" ").forEach { word ->
                word.forEach {
                    stack.push(it)
                }

                for (j in stack.indices) {
                    result.append(stack.pop())
                }
                result.append(" ")
                stack.clear()
            }
            println(result)
        }
        return result.toString()
    }
}