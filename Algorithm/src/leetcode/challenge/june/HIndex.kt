package leetcode.challenge.june

class HIndex {
    fun hIndex(citations: IntArray): Int {
        var (lo, hi) = 0 to citations.lastIndex

        while (lo <= hi) {
            val mid = (hi + lo) / 2
            when {
                citations[mid] == citations.size - mid -> return citations.size - mid
                citations[mid] < citations.size - mid -> lo = mid + 1
                else -> hi = mid - 1
            }
        }

        return citations.size - lo
    }
}