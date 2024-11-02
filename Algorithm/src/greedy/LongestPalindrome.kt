package greedy

/*
leetcode 409
    소문자 또는 대문자로 구성된 문자열 s가 주어지면 가장 긴
    팰린드롬의 길이를 반환합니다

    팰린드롬: 앞뒤가 같은 문자열

    문자는 대소문자를 구분합니다(예: "Aa"는 팰린드롬이 아님)

    예1

    입력: s="abccccdd"
    출력: 7
    설명: 만들 수 있는 가장 긴 팰린드롬은 길이가 7인 "dccaccd" 입니다

    예2

    입력: s="a"
    출력: 1
    설명: 만들 수 있는 가장 긴 팰린드롬은 길이가 1인 "a" 입니다.

    제약조건:

    1 <= s.length <= 2000
    s는 영문 소문자 및 대문자로만 구성 됩니다.
 */
fun main(args: Array<String>) {
    println(LongestPalindrome("abccccdd").solution())

    println(LongestPalindrome("a").solution())
}

class LongestPalindrome(
    private val s: String
) {
    fun solution(): Int {
        val sorted = s.toList().sortedDescending()

        val temp = mutableListOf<Char>()
        val palindrome = mutableListOf<Char>()

        sorted.forEach { c ->
            val foundChar = temp.find { c == it }
            if (foundChar != null) {
                temp.remove(foundChar)
                palindrome.add(foundChar)
                palindrome.add(c)
            } else {
                temp.add(c)
            }
        }

        if (temp.isNotEmpty()) {
            palindrome.add(temp.last())
        }

        return palindrome.count()
    }
}

class Solution {
    fun longestPalindrome(s: String): Int {

        val hm = HashMap<Char, Int>()
        var count = 0

        for (c in s) {
            hm[c] = 1 + (hm[c] ?: 0)
        }

        var isOdd = false
        for (n in hm.values) {
            if (n % 2 == 0) {
                count += n
            } else {
                isOdd = true
                count = count + n - 1
            }
        }
        if (isOdd) {
            count += 1
        }

        return count
    }

}
