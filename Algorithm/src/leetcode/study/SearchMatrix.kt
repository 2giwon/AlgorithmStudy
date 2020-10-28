package leetcode.study

class SearchMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (m in matrix.iterator()) {
            if (m.isNotEmpty() && m.first() <= target && m.last() >= target) {
                for (e in m) {
                    if (e == target) return true
                    else if (e > target) return false
                }
            }
        }

        return false
    }
}