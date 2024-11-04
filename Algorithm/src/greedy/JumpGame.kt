package greedy

/*
    55. Jump Game

    정수 배열의 숫자가 주어집니다. 사용자는 처음에 배열의 첫 번째 인덱스에 위치하며, 배열의 각 요소는 해당 위치에서 최대 점프 길이를 나타냅니다.

    마지막 인덱스에 도달할 수 있으면 참을 반환하고, 그렇지 않으면 거짓을 반환합니다.



    예제 1:

    입력: nums = [2,3,1,1,4]
    출력: true
    설명: 인덱스 0에서 1로 1단계 이동한 다음 마지막 인덱스까지 3단계 이동합니다.

    예제 2:

    입력: nums = [3,2,1,0,4]
    출력: false
    설명: 무슨 일이 있어도 항상 인덱스 3에 도달합니다. 최대 점프 길이는 0이므로 마지막 인덱스에 도달할 수 없습니다.
 */
fun main(args: Array<String>) {
    println(JumpGame().solution(nums = intArrayOf(1, 1, 2, 5, 2, 1, 0, 0, 1, 3)))
    println(JumpGame().solution(nums = intArrayOf(2, 3, 1, 1, 4)))
    println(JumpGame().solution(nums = intArrayOf(3, 2, 1, 0, 4)))
    println(JumpGame().solution(nums = intArrayOf(0)))

}

class JumpGame {

    fun solution(nums: IntArray): Boolean {
        if (nums.size == 1) return true

        var position = nums.lastIndex - 1
        var goal = nums.lastIndex

        while (true) {
            if (goal == 0) return true
            if (position < 0) break
            if (position + nums[position] >= goal) {
                goal = position
            }

            position--
        }

        return false
    }

}

class Solution7 {
    fun solution(nums: IntArray): Boolean {
        var jump = 0
        for (n in nums) {
            if (jump < 0) {
                return false
            } else if (n > jump) {
                jump = n
            }

            jump -= 1
        }

        return true
    }
}
