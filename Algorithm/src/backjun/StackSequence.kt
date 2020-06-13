package backjun

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val reader = BufferedReader(InputStreamReader(System.`in`))
    val n: Int = reader.readLine().toInt()

    var start = 0
    val stack = Stack<Int>()

    val result = mutableListOf<Char>()

    var no = false

    for (i in 0 until n) {
        var v = reader.readLine().toInt()

        while (true) {
            if (start > v && stack.isEmpty()) {
                no = true
                break
            }

            if (v > start) {
                stack.push(++start)
                result.add('+')
            } else if (stack.isNotEmpty() && (v < stack.peek())) {
                stack.pop()
                result.add('-')
            } else {
                stack.pop()
                result.add('-')
                break
            }
        }
    }

    if (no) println("NO") else {
        result.forEach {
            println(it)
        }
    }
}