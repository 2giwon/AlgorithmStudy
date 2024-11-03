package greedy

/*
    561. Array Partition

    2n개의 정수로 이루어진 정수 배열이 주어졌을 때, 모든 i에 대한 최소(ai, bi)의 합이 최대가 되도록
    이 정수들을 (a1, b1), (a2, b2), ..., (an, bn) 쌍으로 그룹화합니다. 최대화된 합을 반환합니다.

    예제 1:

    입력: nums = [1,4,3,2]
    Output: 4
    설명: (요소의 순서를 무시하고) 가능한 모든 쌍은 다음과 같습니다:
    1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
    2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
    3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
    따라서 가능한 최대 합은 4입니다.

    예제 2:

    입력: nums = [6,2,6,5,1,2]
    출력 9
    설명: 최적의 페어링은 (2, 1), (2, 5), (6, 6)입니다. min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9입니다.
 */
fun main(args: Array<String>) {
    println(ArrayPartition(nums = listOf(1, 4, 3, 2)).solution())
    println(ArrayPartition(nums = listOf(6, 2, 6, 5, 1, 2)).solution())
}

class ArrayPartition(
    private val nums: List<Int>,
) {
    fun solution(): Int {
        val sortedNums = nums.sortedDescending()
        var result = 0
        sortedNums.forEachIndexed { index, i ->
            if (index > 0 && index % 2 == 1) {
                result += i
            }
        }
        return result
    }

}

class Solution5(
    private val nums: IntArray
) {
    fun arrayPairSum(): Int {
        var sum = 0
        nums.sort()
        for (i in nums.indices step 2) {
            sum += nums[i]
        }

        return sum
    }
}
