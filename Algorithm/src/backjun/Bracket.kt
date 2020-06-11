package backjun

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val n = reader.readLine().toInt()

    for (i in 0 until n) {
        val p = reader.readLine()
        println(bracket(p))
    }
}

fun bracket(parenthesisString: String): String {
    val stack = Stack<Char>()
    parenthesisString.forEach {
        if (it == '(') {
            stack.push(it)
        } else if (it == ')') {
            if (stack.empty()) return "NO"
            stack.pop()
        }
    }

    if (stack.isNotEmpty()) return "NO"
    return "YES"
}