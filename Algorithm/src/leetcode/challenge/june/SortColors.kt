package leetcode.challenge.june

import util.HeapSort

class SortColors {
    fun sortColors(nums: IntArray): IntArray {
        HeapSort.heapSort(nums)
        return nums
    }
}