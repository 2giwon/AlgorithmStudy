package leetcode.challenge.june

import kotlin.math.pow

class PowerOfTwo {
    fun isPowerOfTwo(n: Int): Boolean {
        var a = 0
        while (true) {
            if (2.0.pow(a) > n) {
                return false
            }

            if (2.0.pow(a).toInt() == n) {
                return true
            }

            a++
        }
    }
}