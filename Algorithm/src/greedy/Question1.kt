package greedy


// 문제 : 1이 될 때까지
// 난이도 1
// 풀이시간 15분
// 시간제한 2초
// 메모리제한 128MB

// 첫째 줄에 N(1 <= N <= 100000), K(1 <= K <= 100000)의 자연수가 주어지며, 각 자연수는 공백으로 구분한다.
// 첫째 줄에 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 출력한다.
fun main(args: Array<String>) {
    val question = Question1(Int.MAX_VALUE, 3)
    println(question.minOperations())

    val solution = Solution1(Int.MAX_VALUE, 3)
    println(solution.minOperations())
}

class Question1 (
    val n: Int,
    private val k: Int
) {
    fun minOperations(): Int {
        var result = 0
        var n = n

        while (n != 1) {
            if (n % k == 0) {
                n /= k
            } else {
                n -= 1
            }
            result++
        }

        return result
    }
}

class Solution1 (
    val n: Int,
    private val k: Int
) {
    fun minOperations(): Int {
        var n = n
        var result = 0

        while (true) {
            val target = (n / k) * k
            result += (n - target)
            n = target
            if (n < k) break
            result++
            n /= k
        }

        result += (n - 1)
        return result
    }
}
