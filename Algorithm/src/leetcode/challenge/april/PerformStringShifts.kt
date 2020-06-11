package leetcode.challenge.april

class PerformStringShifts {
    fun stringShift(s: String, shift: Array<IntArray>): String {
        var ss = s
        for (sh in shift) {
            val direction = sh[0]
            val amount = sh[1]

            for (i in 0 until amount) {
                if (direction == 0) {       // left
                    val first = ss.first()
                    ss = ss.drop(1)
                    ss += first
                } else {                    // right
                    val last = ss.last()
                    ss = ss.dropLast(1)
                    ss = last + ss
                }
            }
        }

        return ss
    }
}