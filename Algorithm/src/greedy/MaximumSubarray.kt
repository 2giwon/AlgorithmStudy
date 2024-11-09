package greedy

import kotlin.math.max

/*
    정수 배열의 숫자가 주어지면 가장 큰 합을 가진 하위 배열을 구하고 그 합을 반환합니다.


    예제 1:

    입력: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    설명: 하위 배열 [4,-1,2,1]의 합계가 가장 큰 6입니다.

    예 2:

    입력: nums = [1]
    Output: 1
    설명: 하위 배열 [1]의 합계가 가장 큰 1입니다.

    예 3:

    입력: nums = [5,4,-1,7,8]
    Output: 23
    설명: 하위 배열 [5,4,-1,7,8]의 합계가 23으로 가장 큽니다.
 */
fun main(args: Array<String>) {
    println(MaximumSubarray().solution(nums = listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(MaximumSubarray().solution(nums = listOf(1)))
    println(MaximumSubarray().solution(nums = listOf(5, 4, -1, 7, 8)))
}

class MaximumSubarray {
    fun solution(nums: List<Int>): Int {
        if (nums.size == 1) return nums.first()
        var start = 0
        var end = nums.lastIndex
        var isFromEnd = false
        var result = 0
        while (true) {
            if (start > end) break

            val sub = nums.slice(start .. end)
            val sum = sub.sum()
            if (result < sum) {
                result = sum
            }

            if (isFromEnd) {
                end -= 1
            } else {
                start += 1
            }

            isFromEnd = !isFromEnd
        }

        return result
    }
}

class SolutionMaxSubArray {
    fun maxSubArray(nums: IntArray): Int {

        var maxNum = nums[0]
        var cur = maxNum

        for (i in 1..nums.lastIndex) {
            if (cur + nums[i] > nums[i]) {
                cur += nums[i]
            } else {
                cur = nums[i]
            }

            maxNum = max(cur, maxNum)
        }
        return maxNum
    }
}
