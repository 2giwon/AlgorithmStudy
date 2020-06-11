package leetcode.challenge.june

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index, v ->
            if (v == target || v > target) {
                return index
            }
        }
        return nums.size
    }
}