class MaxZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        val list = mutableListOf<Int>()

        val map = nums.groupBy { it == 0 }
        list.addAll(map[false]?.toList() ?: emptyList())
        list.addAll(map[true]?.toList() ?: emptyList())

        for (i in nums.indices) {
            nums[i] = list[i]
        }
    }
}