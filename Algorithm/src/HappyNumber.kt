import kotlin.math.pow

class HappyNumber {
    private val nums = mutableListOf<Int>()

    fun isHappy(n: Int): Boolean {
        var v = n
        return when {
            nums.contains(v) -> false
            v == 1 -> true
            else -> {
                nums.add(n)
                var sum = 0
                while (v != 0) {
                    sum += (v % 10).toDouble().pow(2.0).toInt()
                    v /= 10
                }

                return isHappy(sum)
            }
        }
    }
}