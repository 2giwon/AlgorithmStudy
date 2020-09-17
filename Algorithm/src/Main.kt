import leetcode.study.Solution

fun main(args: Array<String>) {
//    Solution.solution()
    println(Solution().wordPattern("abba", "dog cat cat dog"))
    println(Solution().wordPattern("abba", "dog cat cat fish"))
    println(Solution().wordPattern("aaaa", "dog cat cat dog"))
    println(Solution().wordPattern("abba", "dog dog dog dog"))
    println(Solution().wordPattern("aaa", "aa aa aa aa"))
}
