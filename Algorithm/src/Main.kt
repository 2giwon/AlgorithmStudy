import kotlin.math.max
import kotlin.math.pow

fun main(args: Array<String>) {

//    val result = Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
//    println(result)
//
//    val result2 = Solution().singleNumber(intArrayOf(2, 2, 1))
//    println(result2)

//    val result = Solution().isHappy(2)
//    println(result)

//    Solution().moveZeroes(intArrayOf(1, 0))

//    println(Solution().singleNumber2(intArrayOf(2, 2, 1)))

    println(Solution().maxProfit(intArrayOf(7, 3, 1, 0, 8, 2)))

}

// [-2,1,-3,4,-1,2,1,-5,4]

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var maxNum = nums[0]
        var cur = maxNum

        for (i in 1..nums.lastIndex) {
            if (cur + nums[i] > nums[i]) {
                cur += nums[i]
            } else {
                cur = nums[i]
            }

            maxNum = max(cur, maxNum)
        }
        return maxNum
    }

    fun singleNumber(nums: IntArray): Int {
        return nums.groupBy { it }
                .filter { it.value.size <= 1 }
                .keys
                .first()
    }

    fun singleNumber2(nums: IntArray): Int {
        var result = 0
        nums.forEach { result = result xor it }

        return result
    }

    private val nums = mutableListOf<Int>()

    fun isHappy(n: Int): Boolean {
        var v = n
        return when {
            nums.contains(v) -> false
            v == 1 -> true
            else -> {
                nums.add(n)
                var sum = 0
                while (v != 0) {
                    sum += (v % 10).toDouble().pow(2.0).toInt()
                    v /= 10
                }

                return isHappy(sum)
            }
        }
    }

    fun moveZeroes(nums: IntArray): Unit {
        val list = mutableListOf<Int>()

        val map = nums.groupBy { it == 0 }
        list.addAll(map[false]?.toList() ?: emptyList())
        list.addAll(map[true]?.toList() ?: emptyList())

        for (i in nums.indices) {
            nums[i] = list[i]
        }
    }

    fun maxProfit(prices: IntArray): Int {
        var diff = 0
        for (i in 1 until prices.lastIndex) {
            if (prices[i] > prices[i - 1]) {
                diff += prices[i] - prices[i - 1]
            }
        }
        return diff
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return emptyList()
    }
}