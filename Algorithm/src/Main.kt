import kotlin.math.max
import kotlin.math.pow

fun main(args: Array<String>) {

//    val result = Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))
//    println(result)
//
//    val result2 = Solution().singleNumber(intArrayOf(2, 2, 1))
//    println(result2)

//    val result = Solution().isHappy(2)
//    println(result)

//    Solution().moveZeroes(intArrayOf(1, 0))

//    println(Solution().singleNumber2(intArrayOf(2, 2, 1)))

//    println(Solution().maxProfit(intArrayOf(7, 3, 1, 0, 8, 2)))

//    println(Solution().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))

//    println(Solution().countElements(intArrayOf(1, 3, 2, 3, 5, 0)))

    // week 2

//    [65,66,26,77,96,86,11,21,13,80]
//    val head = ListNode(65).apply {
//        next = ListNode(66).apply {
//            next = ListNode(26).apply {
//                next = ListNode(77).apply {
//                    next = ListNode(96).apply {
//                        next = ListNode(86).apply { next = ListNode(11).apply { next = ListNode(21).apply { next = ListNode(13).apply { next = ListNode(80) } } } }
//                    }
//                }
//            }
//        }
//    }
//
//    println(Solution().middleNode(head)?.v)

//    println(Solution().backspaceCompare("a##c", "#a#c"))

//    MinStack minStack = new MinStack();
//    minStack.push(-2);
//    minStack.push(0);
//    minStack.push(-3);
//    minStack.getMin();   --> Returns -3.
//            minStack.pop();
//    minStack.top();      --> Returns 0.
//            minStack.getMin();   --> Returns -2.

//    val minStack = MinStack()
//    minStack.push(-2)
//    minStack.push(0)
//    minStack.push(-3)
//    println(minStack.getMin())
//    minStack.pop()
//    println(minStack.top())
//    println(minStack.getMin())

    val tree = TreeNode(1).apply {
        left = TreeNode(2).apply {
            left = TreeNode(4)
            right = TreeNode(5)
        }
        right = TreeNode(3)
    }
    println(Solution().diameterOfBinaryTree(tree))
}

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var maxNum = nums[0]
        var cur = maxNum

        for (i in 1..nums.lastIndex) {
            if (cur + nums[i] > nums[i]) {
                cur += nums[i]
            } else {
                cur = nums[i]
            }

            maxNum = max(cur, maxNum)
        }
        return maxNum
    }

    fun singleNumber(nums: IntArray): Int {
        return nums.groupBy { it }
                .filter { it.value.size <= 1 }
                .keys
                .first()
    }

    fun singleNumber2(nums: IntArray): Int {
        var result = 0
        nums.forEach { result = result xor it }

        return result
    }

    private val nums = mutableListOf<Int>()

    fun isHappy(n: Int): Boolean {
        var v = n
        return when {
            nums.contains(v) -> false
            v == 1 -> true
            else -> {
                nums.add(n)
                var sum = 0
                while (v != 0) {
                    sum += (v % 10).toDouble().pow(2.0).toInt()
                    v /= 10
                }

                return isHappy(sum)
            }
        }
    }

    fun moveZeroes(nums: IntArray): Unit {
        val list = mutableListOf<Int>()

        val map = nums.groupBy { it == 0 }
        list.addAll(map[false]?.toList() ?: emptyList())
        list.addAll(map[true]?.toList() ?: emptyList())

        for (i in nums.indices) {
            nums[i] = list[i]
        }
    }

    fun maxProfit(prices: IntArray): Int {
        var diff = 0
        for (i in 1..prices.lastIndex) {
            if (prices[i] > prices[i - 1]) {
                diff += prices[i] - prices[i - 1]
            }
        }
        return diff
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val group = strs.groupBy(
                keySelector = { it.sortedString() },
                valueTransform = { it })

        return group.values.toList()
    }

    private fun String.sortedString(): String {
        return toCharArray().sorted().joinToString("")
    }

    fun countElements(arr: IntArray): Int {
        arr.sort()
        var result = 0
        arr.forEachIndexed { index, v ->
            for (i in index + 1..arr.lastIndex) {
                if (v + 1 == arr[i]) {
                    result++
                    break
                }
            }
        }

        return result
    }

    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    fun middleNode(head: ListNode?): ListNode? {
        val middleValue = findMaxNode(head, 1)?.let {
            it / 2 + 1
        }

        var next: ListNode? = ListNode(head?.v ?: 0).apply { next = head?.next }
        var result: ListNode? = head

        var count = 1
        while (next != null) {
            if (count == middleValue) {
                result = next
                break
            }

            next = next?.next
            count++
        }

        return result
    }

    private fun findMaxNode(head: ListNode?, count: Int): Int? {
        var c = count
        return if (head?.next == null) {
            c
        } else {
            findMaxNode(head.next, ++c)
        }
    }

    fun middleNodeAnother(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        return slow
    }

    fun backspaceCompare(S: String, T: String): Boolean {
        var s: String = ""
        var t: String = ""

        S.forEach {
            if (it == '#') {
                s = s.dropLast(1)
            } else {
                s += it
            }
        }

        T.forEach {
            if (it == '#') {
                t = t.dropLast(1)
            } else {
                t += it
            }
        }

        return s == t
    }

    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */
    private var max = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        maxDepth(root)
        return max
    }

    private fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val left = maxDepth(root.left)
        val right = maxDepth(root.right)

        max = max(max, left + right)
        return max(left, right) + 1
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class ListNode(val v: Int) {
    var next: ListNode? = null
}

class MinStack {

    /** initialize your data structure here. */
    private val stack = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return stack.min() ?: 0
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */