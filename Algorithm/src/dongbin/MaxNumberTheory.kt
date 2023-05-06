package dongbin

class MaxNumberTheory {
    fun solution(input1: IntArray, input2: IntArray): Int {
        val data = input2.sorted()
        val n = input1[0]
        var m = input1[1]
        val k = input1[2]

        val first = data[n - 1]
        val second = data[n - 2]

        var result = 0

        while (true) {
            for (i in 0 until k) {
                if (m == 0) break
                result += first
                m -= 1
            }
            if (m == 0) break
            result += second
            m -= 1
        }
        return result
    }
}
