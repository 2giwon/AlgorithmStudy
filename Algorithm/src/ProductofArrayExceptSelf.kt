class ProductofArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val newNums = IntArray(nums.size) { 1 }
        var fromStartProduct = 1
        var fromEndProduct = 1
        for (i in 0 until nums.size) {
            newNums[i] *= fromStartProduct
            newNums[nums.lastIndex - i] *= fromEndProduct
            fromStartProduct *= nums[i]
            fromEndProduct *= nums[nums.lastIndex - i]
        }
        return newNums
    }
}