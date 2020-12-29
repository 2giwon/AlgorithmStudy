import leetcode.study.SwapPairs
import util.ListNode

fun main(args: Array<String>) {
//    println(Palindrome().partition("aab"))
//    println(Palindrome().partition("a"))
//    println(Palindrome().partition("cdd"))

    val list = ListNode(1).apply {
        next = ListNode(2).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }
    }

    println(SwapPairs().swapPairs(list))
    println(SwapPairs().swapPairs(ListNode(null)))
    println(SwapPairs().swapPairs(ListNode(1)))
}