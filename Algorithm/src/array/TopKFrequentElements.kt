package array

import java.util.*
import kotlin.collections.LinkedHashMap

/*
    정수 배열 num과 정수 k가 주어지면 가장 빈번한 원소 k를 반환합니다. 어떤 순서로든 답을 반환할 수 있습니다.



    예제 1:

    입력: nums = [1,1,1,1,2,2,3], k = 2
    Output: [1,2]

    예 2:

    입력: nums = [1], k = 1
    출력 [1]
 */
fun main(args: Array<String>) {
//    println(TopKFrequentElements().solution(intArrayOf(1,1,1,1,2,2,3), 2))
//    println(TopKFrequentElements().solution(intArrayOf(3,4,4,5,3,3), 2))
//    println(TopKFrequentElements().solution(intArrayOf(1), 1))
    println(TopKFrequentElements().solution(intArrayOf(3,0,1,0), 1))
}

class TopKFrequentElements {
    fun solution(nums: IntArray, k: Int): IntArray {
        val unique = IntArray(k) { 0 }
        val map = nums.groupBy { it }

        val entries = LinkedList(map.entries)
        entries.sortByDescending { it.value.size }

        val newMap = LinkedHashMap<Int, List<Int>>()
        for (entry in entries) {
            newMap[entry.key] = entry.value
        }

        repeat(k) {
            unique[it] = newMap.toList()[it].first
        }

        return unique
    }
}
