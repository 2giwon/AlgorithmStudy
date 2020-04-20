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
}