package leetcode.challenge.april

import kotlin.math.max

class ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        map[0] = -1
        var max = 0
        var acc = 0
        for ((idx, value) in nums.withIndex()) {
            if (value == 1) {
                acc++
            } else {
                acc--
            }

            if (acc in map) {
                max = max(max, idx - map[acc]!!)
            } else {
                map[acc] = idx
            }
        }
        return max
    }
}