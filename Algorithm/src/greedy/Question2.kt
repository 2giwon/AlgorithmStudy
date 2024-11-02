package greedy


// 문제 : 곱하기 혹은 더하기
// 난이도 1
// 풀이시간 30분
// 시간제한 1초
// 메모리제한 128MB

// 첫째 줄에 여러 개의 숫자로 구성된 하나의 문자열 S가 주어진다. (1 <= S의 길이 <= 20)
// 첫째 줄에 만들어질 수 있는 가장 큰 수를 출력한다.

// 입력 예시 02984
// 출력 예시 576

// 입력 예시2 567
// 출력 예시2 210
fun main(args: Array<String>) {
    println(Question2("02984").solution())
    println(Question2("567").solution())
}

class Question2(
    val s: String
) {
    fun solution(): String {
        val s: List<Int> = s.map { it.digitToInt() }

        var result = 0
        for (i in s.indices) {
            val n = s[i]

            if (result <= 1 || n <= 1) {
                result += n
            } else {
                result *= n
            }
        }

        return result.toString()
    }
}

class Solution2(
    val s: String
) {
    fun solution(): String {
        val s: List<Int> = s.map { it.digitToInt() }

        var result = 0
        for (i in s.indices) {
            val n = s[i]

            if (result <= 1 || n <= 1) {
                result += n
            } else {
                result *= n
            }
        }

        return result.toString()
    }
}
