package array


/*
    문자열 배열 strs가 주어지면 애너그램을 함께 그룹화합니다. 어떤 순서로든 답을 반환할 수 있습니다.

     예제 1:

     입력: strs = [“eat”,“tea”,“tan”,“ate”,“nat”,“bat”]
     출력: [[“bat”],[“nat”,“tan”],[“ate”,“eat”,“tea”]]

     설명:

     strs에 “bat”을 형성하도록 재 배열할 수 있는 문자열이 없습니다.
     “nat” 및 ‘tan’ 문자열은 재배열하여 서로를 형성할 수 있으므로 아나그램입니다.
     “ate”, ‘eat’ 및 ‘tea’ 문자열은 서로 재배열하여 서로를 형성할 수 있으므로 아나그램입니다.

     Example 2:

     Input: strs = [""]
     Output: [[""]]

     Example 3:

     Input: strs = ["a"]
     Output: [["a"]]

     Constraints:

     1 <= strs.length <= 10⁴
     0 <= strs[i].length <= 100
     strs[i] consists of lowercase English letters.
*/
fun main(args: Array<String>) {
    println(AnagramGroups().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
    println(AnagramGroups().groupAnagrams(arrayOf("")))
    println(AnagramGroups().groupAnagrams(arrayOf("a")))
    println(AnagramGroups().groupAnagrams(arrayOf("", "")))
    println(AnagramGroups().groupAnagrams(arrayOf("c", "c")))
}

class AnagramGroups {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return listOf(strs.toList())
        if (strs.size == 1) return listOf(strs.toList())
        val result = mutableMapOf<String, MutableList<String>>()
        var index = 0

        while (true) {
            if (index > strs.lastIndex) break
            val sorted = strs[index].toList().sorted().joinToString ("")
            val list = result[sorted] ?: mutableListOf()
            list.add(strs[index])

            result[sorted] = list
            index++
        }

        return result.map {
            it.value.toList()
        }
    }
}

