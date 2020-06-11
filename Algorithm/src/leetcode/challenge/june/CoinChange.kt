package leetcode.challenge.june

class CoinChange {
    fun change(amount: Int, coins: IntArray): Int {
        val dp = Array(coins.size + 1) { IntArray(amount + 1) }
        dp[0][0] = 1

        for (i in 1..coins.size) {
            dp[i][0] = 1
            for (j in 1..amount) {
                dp[i][j] = dp[i - 1][j] + if (j >= coins[i - 1]) dp[i][j - coins[i - 1]] else 0
            }
        }

        return dp[coins.size][amount]
    }


}