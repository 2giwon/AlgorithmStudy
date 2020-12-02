package programmers

class Fibo {
    fun solution(n: Int): Int {
        val dp = Array(n + 1) { 0 }
        dp[0] = 0
        dp[1] = 1

        for (i in 2 until dp.size) {
            dp[i] = dp[i - 1] % 1234567 + dp[i - 2] % 1234567
        }

        return dp[n] % 1234567
    }
}