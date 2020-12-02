package programmers

class BinaryConverter {
    fun solution(s: String): List<Int> {
        var stringList = s.toMutableList()
        val ss = mutableListOf<Char>()
        var zero = 0
        var count = 0

        while (true) {
            if (stringList.size == 1 && stringList[0] == '1') break

            for (i in stringList.indices) {
                if (stringList[i] == '0') {
                    zero++
                } else {
                    ss.add(stringList[i])
                }
            }

            stringList = ss.size.toString(2).toMutableList()

            count++
            ss.clear()
        }

        return listOf(count, zero)
    }
}