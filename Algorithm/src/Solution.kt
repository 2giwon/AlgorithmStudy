object Solution {
    fun maxSubArray(array: IntArray = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)) {
        println(MaxSubArray().maxSubArray(array))
    }

    fun singleNumber(num: IntArray = intArrayOf(2, 2, 1)) {
        println(SingleNumber().singleNumber(num))
    }

    fun isHappy(v: Int = 2) {
        println(HappyNumber().isHappy(v))
    }

    fun lastStoneWeight(stones: IntArray = intArrayOf(2, 7, 4, 1, 8, 1)) {
        println(LastStoneWeight().lastStoneWeight(stones))
    }
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

//    val tree = TreeNode(1).apply {
//        left = TreeNode(2).apply {
//            left = TreeNode(4)
//            right = TreeNode(5)
//        }
//        right = TreeNode(3)
//    }
//    println(Solution().diameterOfBinaryTree(tree))
}