package leetcode.challenge.june

class LargestDivisibleSubset {
    fun largestDivisibleSubset(nums: IntArray): List<Int> {
        val result = mutableSetOf<List<Int>>()
        val subList = mutableSetOf<Int>()
        var isInsert = true
        nums.sort()

        for (i in nums.indices) {
            subList.clear()
            for (j in nums.indices) {
                if (nums[i] % nums[j] == 0 || nums[j] % nums[i] == 0) {
                    if (subList.size > 0) {
                        for (k in subList.indices) {
                            if (subList.elementAt(k) % nums[j] != 0 && nums[j] % subList.elementAt(k) != 0) {
                                isInsert = false
                            }
                        }

                        if (isInsert) {
                            subList.add(nums[j])
                        }
                    } else {
                        subList.add(nums[i])
                        subList.add(nums[j])
                    }

                    isInsert = true
                }
            }

            result.add(subList.toList())
        }

        return result.maxByOrNull { it.size }?.sorted() ?: emptyList()
    }
}
