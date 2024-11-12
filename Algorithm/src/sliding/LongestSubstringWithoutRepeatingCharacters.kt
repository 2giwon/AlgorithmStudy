package sliding

import kotlin.math.max

/*
    문자열 s가 주어졌을 때 반복되는 문자가 없는 가장 긴 부분 문자열의 길이를 구합니다.


    예제 1:

    입력: s = “abcabcbb”
    Output: 3
    설명: 답은 길이가 3인 “abc”입니다.
    예 2:

    입력: s = “bbbbb”
    출력 1
    설명: 답은 길이가 1인 “b”입니다.
    예제 3:

    입력: s = “pwwkew”
    Output: 3
    설명: 답은 길이가 3인 “wke”입니다.
    답은 부분 문자열이어야 하며, “pwke”는 부분 문자열이 아닌 서브시퀀스입니다.
 */
fun main(args: Array<String>) {
    println(LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"))
    println(LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"))
    println(LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"))
    println(LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"))
}
class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        val hash = HashSet<Char>()
        var i = 0
        var j = 0
        var max = 0

        while (j < s.length) {
            if (!hash.contains(s[j])) {
                hash.add(s[j])
                j++
                max = max(hash.size, max)
            } else {
                hash.remove(s[i])
                i++
            }
        }

        return max
    }
}
