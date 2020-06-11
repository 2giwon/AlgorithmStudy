package leetcode.challenge.april

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val group = strs.groupBy(
                keySelector = { it.sortedString() },
                valueTransform = { it })

        return group.values.toList()
    }

    private fun String.sortedString(): String {
        return toCharArray().sorted().joinToString("")
    }
}