class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.groupBy { it }
                .filter { it.value.size <= 1 }
                .keys
                .first()
    }

    fun singleNumber2(nums: IntArray): Int {
        var result = 0
        nums.forEach { result = result xor it }

        return result
    }
}