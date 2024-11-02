package greedy

/*
    큰 수의 법칙

    첫째 줄에 N(2 <= N <= 1000), M(1 <= M <= 10000), K(1 <= K <= 10000) 자연수가 주어지며,
    각 자연수는 공백으로 구분한다.

    둘째 줄에 N개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다. 단, 각각의 자연수는 1 이상 10000 이하의 수로
    주어진다.

    입력으로 주어지는 K는 항상 M 보다 작거나 같다

    출력 조건 : 첫째 줄에 동빈이의 큰 수의 법칙에 따라 더해진 답을 출력한다.

    예시

    5 8 3
    2 4 5 4 6

    46

    M이 8이고 K가 3이므로
    특정한 인덱스 수가 3번 더해질 수 있고
    총 8번 더한 합을 구해주면 된다
 */

fun main(args: Array<String>) {
    println(Question4(5, 8, 3, intArrayOf(2, 4, 5, 4, 6)).solution())

    println(Solution4(5, 8, 3, intArrayOf(2, 4, 5, 4, 6)).solution())
}

class Question4(
    private val n: Int,
    private val m: Int,
    private val k: Int,
    private val data: IntArray
) {
    fun solution(): Int {
        val sorted = data.sortedDescending()
        val max = sorted.first()
        val secondMax = sorted[1]
        var result = 0
        var kCount = k

        repeat(m) {
            if (kCount > 0) {
                result += max
                kCount--
            } else {
                result += secondMax
                kCount = k
            }
        }

        return result
    }
}

class Solution4(
    private val n: Int,
    private val m: Int,
    private val k: Int,
    private val data: IntArray
) {
    fun solution(): Int {
        var result = 0

        val sorted = data.sorted()
        val first = sorted[n - 1]
        val second = sorted[n - 2]

        var count: Int = (m / (k + 1) * k)
        count += m % (k + 1)

        result += count * first
        result += (m - count) * second

        return result
    }
}
