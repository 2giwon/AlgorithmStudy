import kotlin.math.max

fun main(args: Array<String>) {

    val result = Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
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
}