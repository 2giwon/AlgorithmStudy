package leetcode.study

class ChocolatesByNumbers {
    fun solution(N: Int, M: Int): Int {
        val result = mutableListOf<Int>()
        var start = 0
        while (true) {
            val chocolateNumber: Int = (start + M) % N
            if (chocolateNumber == 0) break
            result.add(chocolateNumber)

            start = chocolateNumber
        }

        return result.size
    }
}