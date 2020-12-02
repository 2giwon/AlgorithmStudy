package programmers

class Coupang {
    fun solution(n: Int, text: String, second: Int): String {
        val textList = text.toMutableList()
        val answer = StringBuilder()
        repeat(n) {
            answer.append('_')
        }

        for (i in 0 until second) {
            when {
                i % (textList.size + n) <= textList.lastIndex -> {
                    answer.append(if (textList[i % (textList.size + n)] == ' ') '_' else textList[i % (textList.size + n)])
                    answer.deleteCharAt(0)
                }
                else -> {
                    answer.append('_')
                    answer.deleteCharAt(0)
                }
            }
        }

        return answer.toString()
    }
}