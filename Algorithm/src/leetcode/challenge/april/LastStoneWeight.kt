package leetcode.challenge.april

import java.util.*


class LastStoneWeight {
    fun lastStoneWeight(stones: IntArray): Int {
        if (stones.size <= 1) return stones.first()

        val s = stones.sortedDescending().toMutableList()
        val max = s.first()
        val second = s[1]

        s[0] = max - second
        s.removeAt(1)

        if (s[0] < 0) {
            s.removeAt(0)
        }

        return lastStoneWeight(s.toIntArray())
    }

    fun lastStoneWeight2(stones: IntArray): Int {
        val pq = PriorityQueue<Int> { a, b -> b - a }
        for (a in stones)
            pq.offer(a)
        while (pq.size > 1)
            pq.offer(pq.poll() - pq.poll())
        return pq.poll()
    }
}