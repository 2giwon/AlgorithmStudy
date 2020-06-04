
class TwoCityScheduling {


    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        val n = costs.size / 2
        val refund = IntArray(n * 2)
        var (minCost, index) = 0 to 0

        costs.forEach { cost ->
            refund[index++] = cost[1] - cost[0]
            minCost += cost[0]
        }
        refund.sort()
        for (i in 0 until n) {
            minCost += refund[i]
        }

        return minCost
    }
}