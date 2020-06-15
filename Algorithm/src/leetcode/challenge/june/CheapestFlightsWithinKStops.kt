package leetcode.challenge.june

import java.util.*

class CheapestFlightsWithinKStops {
    fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
        val prices = mutableMapOf<Int, MutableMap<Int, Int>>()
        for (f in flights) {
            if (!prices.containsKey(f[0])) prices[f[0]] = HashMap()
            prices[f[0]]?.set(f[1], f[2])
        }
        val pq = PriorityQueue<IntArray> { a, b -> a[0].compareTo(b[0]) }
        pq.add(intArrayOf(0, src, k + 1))
        while (!pq.isEmpty()) {
            val top = pq.remove()
            val price = top[0]
            val city = top[1]
            val stops = top[2]
            if (city == dst) return price
            if (stops > 0) {
                val adj: MutableMap<Int, Int> = prices.getOrDefault(city, HashMap())
                for (a in adj.keys) {
                    pq.add(intArrayOf(price + adj[a]!!, a, stops - 1))
                }
            }
        }
        return -1
    }
}

