import kotlin.math.max
import kotlin.math.pow

fun main(args: Array<String>) {

//    val result = Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
//    println(result)
//
//    val result2 = Solution().singleNumber(intArrayOf(2, 2, 1))
//    println(result2)

    val result = Solution().isHappy(2)
    println(result)
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

    fun maxSubArray(nums: IntArray): Int {

    }

}