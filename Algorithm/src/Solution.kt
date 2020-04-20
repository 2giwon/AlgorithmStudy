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

    fun moveZeroes(array: IntArray = intArrayOf(1, 0)) {
        println(MaxZeroes().moveZeroes(array))
    }

    fun singleNumber2(nums: IntArray = intArrayOf(2, 2, 1)) {
        println(SingleNumber().singleNumber2(nums))
    }

    fun maxProfit(nums: IntArray = intArrayOf(7, 3, 1, 0, 8, 2)) {
        println(MaxProfit().maxProfit(nums))
    }

    fun groupAnagrams(strings: Array<String> = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")) {
        println(GroupAnagrams().groupAnagrams(strings))
    }

    fun countElements(nums: IntArray = intArrayOf(1, 3, 2, 3, 5, 0)) {
        println(CountElements().countElements(nums))
    }

    // week 2

    fun middleNode() {
        //    [65,66,26,77,96,86,11,21,13,80]
        val head = ListNode(65).apply {
            next = ListNode(66).apply {
                next = ListNode(26).apply {
                    next = ListNode(77).apply {
                        next = ListNode(96).apply {
                            next = ListNode(86).apply { next = ListNode(11).apply { next = ListNode(21).apply { next = ListNode(13).apply { next = ListNode(80) } } } }
                        }
                    }
                }
            }
        }

        println(MiddleNode().middleNode(head))
    }

    fun backspaceCompare(s: String = "a##c", t: String = "#a#c") {
        println(BackSpaceCompare().backspaceCompare(s, t))
    }

    fun minStack() {
        /**
         *  MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();   --> Returns -3.
        minStack.pop();
        minStack.top();      --> Returns 0.
        minStack.getMin();   --> Returns -2.
         **/

        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        println(minStack.getMin())
        minStack.pop()
        println(minStack.top())
        println(minStack.getMin())
    }

    fun diameterOfBinaryTree() {
        val tree = TreeNode(1).apply {
            left = TreeNode(2).apply {
                left = TreeNode(4)
                right = TreeNode(5)
            }
            right = TreeNode(3)
        }

        println(DiameterOfBinaryTree().diameterOfBinaryTree(tree))
    }

    // 2, 7, 4, 1, 8, 1
    // 4, 6, 4, 10
    // 2, 2
    // 1
    fun lastStoneWeight(stones: IntArray = intArrayOf(4, 6, 4, 10)) {
        println(LastStoneWeight().lastStoneWeight2(stones))
        println(LastStoneWeight().lastStoneWeight2(intArrayOf(2, 7, 4, 1, 8, 1)))
        println(LastStoneWeight().lastStoneWeight2(intArrayOf(2, 2)))
        println(LastStoneWeight().lastStoneWeight2(intArrayOf(1)))
    }

    fun findMaxLength(nums: IntArray = intArrayOf(1, 1, 1, 0, 1, 0, 1, 0, 1, 1)) {
//        println(ContiguousArray().findMaxLength(nums))
    }

    fun isNumber(s: String = "a234") {
        println(ProgrammersSkilLevelOne().isNumber(s))
    }

    fun isHasyadNumber(x: Int = 11) {
        println(ProgrammersSkilLevelOne().isHarshadNumber(x))
    }

    fun sumFactor(n: Int = 12) {
        println(ProgrammersSkilLevelOne().sumFactor(n))
    }
}