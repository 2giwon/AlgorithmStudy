class MaxProfit {
    fun maxProfit(prices: IntArray): Int {
        var diff = 0
        for (i in 1..prices.lastIndex) {
            if (prices[i] > prices[i - 1]) {
                diff += prices[i] - prices[i - 1]
            }
        }
        return diff
    }
}