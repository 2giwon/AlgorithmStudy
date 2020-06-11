package programmers

class ProgrammersSkilLevelOne {
    fun isNumber(s: String): Boolean {
        s.forEach {
            val range = it - '0'
            if (range < 0 || range > 9) {
                return false
            }
        }

        return true
    }

    fun isHarshadNumber(x: Int): Boolean {
        var sum = 0
        var n = x
        while (n != 0) {
            sum += (n % 10)
            n /= 10
        }

        return sum % x == 0
    }

    fun sumFactor(n: Int): Int {
        var x = 1
        var sum = 0
        while (x <= n) {
            sum += if (n % x == 0) x else 0
            x++
        }

        return sum
    }

    fun findKim(seoul: Array<String>): String {
        val index = seoul.indexOf("Kim")

        return "김서방은 ${index}에 있다"
    }
}