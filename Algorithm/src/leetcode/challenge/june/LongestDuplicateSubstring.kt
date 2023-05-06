package leetcode.challenge.june

class LongestDuplicateSubstring {
    fun longestDupSubstring(S: String): String {
        var findString = ""
        val mid = S.length / 2
        val result = ""
        for (i in mid downTo 1) {
            for (j in 0..(findString.length - i)) {
                findString = S.substring(j, j + i)

            }
        }

        return result
    }
}
