package leetcode.study

class Permutations {

//    fun permuteUnique(nums: IntArray): List<List<Int>> {
//        // input check, the length of nums >= 1
//        val res: MutableList<List<Int>> = ArrayList()
//
//        helper(nums, 0, res)
//        return res
//    }
//
//    private fun helper(nums: IntArray, index: Int, res: MutableList<List<Int>>) {
//        // base case
//        if (index >= nums.size) {
//            val list: MutableList<Int> = ArrayList()
//            for (n in nums) {
//                list.add(n)
//            }
//            res.add(list)
//            return
//        }
//
//        val visited = mutableSetOf<Int>()
//        for (i in index until nums.size) {
//            if (visited.contains(nums[i])) continue
//
//            visited.add(nums[i])
//            // swap i, index
//            swap(nums, i, index)
//            helper(nums, index + 1, res)
//            swap(nums, index, i)
//        }
//    }

//    private fun swap(nums: IntArray, i: Int, j: Int) {
//        val temp = nums[i]
//        nums[i] = nums[j]
//        nums[j] = temp
//    }

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result: MutableList<MutableList<Int>> = mutableListOf()
        val mutableNums = nums.toMutableList()

        if (nums.size <= 1) result.add(mutableNums)
        else req(mutableNums, nums.size, mutableListOf(), result)

        return result.toList()
    }

    private fun req(nums: MutableList<Int>, max: Int, values: MutableList<Int>, result: MutableList<MutableList<Int>>) {
        if (nums.size <= 1) {
            values.add(nums[0])
            return
        }

        for (i: Int in nums.indices) {
            val v = values.toMutableList()
            val nums2 = nums.toMutableList()
            v.add(nums2[i])
            nums2.remove(nums2[i])
            req(nums2, max, v, result)
            if (v.size == max) result.add(v)
        }
    }


}