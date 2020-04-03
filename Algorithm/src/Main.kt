fun main(args: Array<String>) {

    val result = Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
    println(result)
}

// [-2,1,-3,4,-1,2,1,-5,4]
fun IntArray.sumSubArray(): Int = this.fold(0) { a, b -> a + b }

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var maxNum = nums[0]
        for (i in nums.indices) {
            for (j in i..nums.lastIndex) {
                val foldResult = nums.sliceArray(i..j)
                        .sumSubArray()

                if (maxNum < foldResult) maxNum = foldResult

            }
        }
        return maxNum
    }
}