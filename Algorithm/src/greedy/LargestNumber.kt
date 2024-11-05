package greedy

import java.util.Collections

/*
    음수가 아닌 정수의 목록이 주어지면 가장 큰 수를 이루도록 정렬하여 반환합니다.

    결과가 매우 클 수 있으므로 정수 대신 문자열을 반환해야 합니다.



    예제 1:

    입력: nums = [10,2]
    Output: “210”

    예제 2:

    입력: nums = [3,30,34,5,9]
    Output: “9534330”
 */

fun main(args: Array<String>) {// 10, 2, 30, 2,
    println(LargestNumber().solution(nums = intArrayOf(10, 2)))
    println(LargestNumber().solution(nums = intArrayOf(3, 30, 34, 5, 9)))
    println(LargestNumber().solution(nums = intArrayOf(3332, 33313, 3244, 5, 9)))
    println(LargestNumber().solution(nums = intArrayOf(0, 0)))
}

class LargestNumber {
    fun solution(nums: IntArray): String {
        if (nums.size == 1) return nums[0].toString()
        val newNums = nums.map(Int::toString).toMutableList()
        if (newNums.sumOf { it.toInt() } == 0) return "0"

        for (i in newNums) {
            for (index in 0 until  newNums.lastIndex) {
                if (newNums[index] + newNums[index + 1] < newNums[index + 1] + newNums[index]) {
                    Collections.swap(newNums, index, index + 1)
                }
            }
        }

        return newNums.joinToString ( "" )
    }
}
