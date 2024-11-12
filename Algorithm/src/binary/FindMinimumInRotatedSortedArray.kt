package binary

/*
    오름차순으로 정렬된 길이 n의 배열이 1에서 n번 사이로 회전한다고 가정해 보겠습니다. 예를 들어 배열 nums = [0,1,2,4,5,6,7]은:

    4번 회전한 경우 [4,5,6,7,0,1,2]가 될 수 있습니다.
    7회 회전한 경우 [0,1,2,4,5,6,7]이 됩니다.
    배열 [a[0], a[1], a[2], ..., a[n-1]] 배열을 한 번 회전하면 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 배열이 됩니다.

    정렬되고 회전된 배열의 고유 원소의 숫자들이 주어졌을 때, 이 배열의 가장 작은 원소를 반환합니다.

    O(log n) 시간 내에 실행되는 알고리즘을 작성해야 합니다.



    예제 1:

    입력: nums = [3,4,5,1,2]
    Output: 1
    설명: 원래 배열은 [1,2,3,4,5]를 3번 회전한 것입니다.

    예제 2:

    입력: nums = [4,5,6,7,0,1,2]
    Output: 0
    설명: 원래 배열은 [0,1,2,4,5,6,7]이었고 4번 회전되었습니다.

    예제 3:

    입력: nums = [11,13,15,17]
    Output: 11
    설명: 원래 배열은 [11,13,15,17]이었고 4번 회전했습니다.

 */
fun main(args: Array<String>) {
    println(FindMinimumInRotatedSortedArray().findMin(nums = intArrayOf(3,4,5,1,2)))
    println(FindMinimumInRotatedSortedArray().findMin(nums = intArrayOf(4,5,6,7,0,1,2)))
    println(FindMinimumInRotatedSortedArray().findMin(nums = intArrayOf(11,13,15,17)))
}

class FindMinimumInRotatedSortedArray {
    fun findMin(nums: IntArray): Int {
        return nums.min()
    }
}
