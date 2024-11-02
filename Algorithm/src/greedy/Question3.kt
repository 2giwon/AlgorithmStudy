package greedy

// 문제 : 모험가 길드
// 난이도 1
// 풀이시간 30분
// 시간제한 1초
// 메모리제한 128MB

// 첫째 줄에 모험가의 수 N(1 <= N <= 100000)이 주어진다.
// 둘째 줄에 각 모험가의 공포도의 값을 N 이하의 자연수로 주어지며, 각 자연수는 공백으로 구분한다.

// 첫째 줄에 여행을 떠날 수 있는 그룹 수의 최댓값을 출력한다.

/* 한 마을에 모험가가 N명이 있습니다. 모험가 길드에서는 N명의 모험가를 대상으로 '공포도'를 측정했는데,
'공포도'가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어집니다.

모험가 길드장인 동빈이는 모험가 그룹을 안정하게 구성하고자
공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여
해야 여행을 떠날 수 있도록 규정했습니다.

동빈이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금합니다. N명의 모험가에 대한 정보가 주어졌을 때,
여행을 떠날 수 있는 구릅 수의 최댓값을 구하시오

예를 들어 N = 5이고, 각 모험가의 공포도가 다음과 같다고 가정합시다.

2 3 1 2 2

이 경우 그룹 1에 공포도가 1, 2, 3인 모험가를 한 명씩 넣고, 그룹 2에 공포도가 2인 남은 두 명을 넣게 되면
총 2개의 그룹을 만들 수 있습니다

또한 몇 명의 모험가는 마을에 그대로 남아 있어도 되기 때문에, 모든 모험가를 특정한 그룹에 넣을 필요는 없습니다
 */
fun main(args: Array<String>) {
    println(Question3(5, intArrayOf(2, 3, 1, 2, 2)).solution())
    println(Question3(5, intArrayOf(1, 1, 2, 2, 2)).solution())

    println(Solution3(5, listOf(2, 3, 1, 2, 2)).solution())
}

class Question3(
    private val n: Int,
    private val k: IntArray
) {
    fun solution(): Int {
        var group = intArrayOf()
        var groupIndex = 0

        var result = 0
        k.sorted()
            .forEach {
                if (group.isEmpty()) {
                    group = IntArray(it)
                    groupIndex = 0
                }

                if (it <= group.count()) {
                    if (groupIndex < group.count()) {
                        group[groupIndex] = it
                        groupIndex++
                    }

                    if (groupIndex == group.count()) {
                        result++
                        group = intArrayOf()
                    }
                }
            }
        return result
    }
}

class Solution3(
    private val n: Int,
    private val k: List<Int>
) {
    fun solution(): Int {
        var result = 0
        var count = 0

        k.forEach {
            count++

            if (count >= it) {
                result++
                count = 0
            }
        }

        return result
    }
}
