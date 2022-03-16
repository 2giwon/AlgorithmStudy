package leetcode.grokking

//Given two non-negative integers low and high. Return the count of odd numbers
//between low and high (inclusive).
//
//
// Example 1:
//
//
//Input: low = 3, high = 7
//Output: 3
//Explanation: The odd numbers between 3 and 7 are [3,5,7].
//
// Example 2:
//
//
//Input: low = 8, high = 10
//Output: 1
//Explanation: The odd numbers between 8 and 10 are [9].
//
//
// Constraints:
//
//
// 0 <= low <= high <= 10^9


//leetcode submit region begin(Prohibit modification and deletion)
class CountOddNumbersInIntervalRange {
    fun countOdds(low: Int, high: Int): Int {
        return if ((high - low + 1) % 2 > 0) {
            if (isOdd(high) && isOdd(low)) {
                (high - low + 1) / 2 + (high - low + 1) % 2
            } else {
                (high - low + 1) / 2
            }
        } else {
            (high - low + 1) / 2
        }
    }

    private fun isOdd(num: Int): Boolean = num % 2 > 0
}
