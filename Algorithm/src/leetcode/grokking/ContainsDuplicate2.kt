package leetcode.grokking

import kotlin.math.abs

//Given an integer array nums and an integer k, return true if there are two
//distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <
//= k.
//
//
// Example 1:
//
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//
//
// Example 2:
//
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//
//
// Example 3:
//
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁵
// -10⁹ <= nums[i] <= 10⁹
// 0 <= k <= 10⁵
//


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            if (map[nums[i]] == null) {
                map[nums[i]] = i
            } else {
                val j = map[nums[i]]!!
                if (abs(j.minus(i)) <= k) return true
                else map[nums[i]] = i
            }
        }
        return false
    }
}
