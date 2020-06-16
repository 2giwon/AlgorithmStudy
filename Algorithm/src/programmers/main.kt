package programmers

import programmers.coding.Solution

fun main() {
    Solution::class.java.declaredMethods.forEach {
        it.invoke(Solution())
    }
}