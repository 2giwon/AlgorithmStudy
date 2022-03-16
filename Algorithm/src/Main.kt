import leetcode.study.ValidAnagram

fun main(args: Array<String>) {
//    println(MinOperations().minOperations(intArrayOf(1,1,4,2,3), 5))
//    println(MinOperations().minOperations(intArrayOf(5,6,7,8,9), 4))
//    println(MinOperations().minOperations(intArrayOf(3,2,20,1,1,3), 10))
//    println(MinOperations().minOperations(intArrayOf(1,1), 3))
//    println(MostCompetitive().mostCompetitive(intArrayOf(3,5,2,6), 2))
//    println(MostCompetitive().mostCompetitive(intArrayOf(2,4,3,3,5,4,9,6), 4))

    println(leetcode.grokking.Solution().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3))
    println(leetcode.grokking.Solution().containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1))
    println(leetcode.grokking.Solution().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2))

}
