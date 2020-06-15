import leetcode.MaxSubArray
import leetcode.SingleNumber
import leetcode.challenge.april.*
import leetcode.challenge.june.*
import programmers.ProgrammersSkilLevelOne
import util.ListNode
import util.TreeNode

object Solution {
    private fun solution(vararg func: () -> Any) {
        listOf(*func).forEach { it() }
    }

    fun solution() {
        solution(
//                ::productExceptSelf,
//                ::checkValidString
//                ::numIslands,
//                ::minPathSum,
//                ::invertTree,
//                ::deleteNodeInALinkedList,
//                ::twoCitySchedCost,
//                ::reserveString,
//                ::randomPickWithWeight,
//                ::reconstructionQueue,
//                ::coinChange,
//                ::powerOfTwo,
//                ::isSubSequence,
//                ::searchInsert,
//                ::sortColors,
//                ::randomizedSet,
//                ::largestDivisibleSubset,
                ::findCheapestPrice
        )
    }

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
         *  leetcode.challenge.april.MinStack minStack = new leetcode.challenge.april.MinStack();
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
        println(ContiguousArray().findMaxLength(nums))
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

    fun stringShift(s: String = "abcdefg", shift: Array<IntArray> =
            arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 3)
            )
    ) {
        println(PerformStringShifts().stringShift(s, shift))
    }

    private fun productExceptSelf() {
        println(ProductofArrayExceptSelf().productExceptSelf(intArrayOf(1, 2, 3, 4)).toList())
    }

    private fun checkValidString() {
        println(ValidParenthesisString().checkValidString("()"))
        println(ValidParenthesisString().checkValidString("(*)"))
        println(ValidParenthesisString().checkValidString("(*))"))
        println(ValidParenthesisString().checkValidString("((*)))"))
    }

    private fun numIslands() {
        println(NumberOfIslands().numIslands(
                arrayOf(
                        charArrayOf('1', '1', '1', '1', '0'),
                        charArrayOf('1', '1', '0', '1', '0'),
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('0', '0', '0', '0', '0')
                )
        ))

        println(NumberOfIslands().numIslands(
                arrayOf(
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('0', '0', '1', '0', '0'),
                        charArrayOf('0', '0', '0', '1', '1')
                )
        ))
    }

    private fun minPathSum() {
//        println(leetcode.challenge.april.MinimumPathSum().minPathSum(
//                arrayOf(
//                        intArrayOf(1, 3, 1),
//                        intArrayOf(1, 5, 1),
//                        intArrayOf(4, 2, 1)
//                )
//        ))
//
//        println(leetcode.challenge.april.MinimumPathSum().minPathSum(
//                arrayOf(
//                        intArrayOf(1, 2),
//                        intArrayOf(1, 1)
//                )
//        ))

        println(MinimumPathSum().minPathSum(
                arrayOf(
                        intArrayOf(1, 2, 5),
                        intArrayOf(3, 2, 1)
                )
        ))
    }

    private fun invertTree() {
        val tree = TreeNode(4).apply {
            left = TreeNode(2).apply {
                left = TreeNode(1)
                right = TreeNode(3)
            }
            right = TreeNode(7).apply {
                left = TreeNode(6)
                right = TreeNode(9)
            }
        }

        println(InvertTree().invertTree(tree))
    }

    private fun deleteNodeInALinkedList() {

        println(DeleteNodeInALinkedList().apply {
            deleteNode(ListNode(5))
        }.linkedList)

    }

    private fun twoCitySchedCost() {
        println(TwoCityScheduling().twoCitySchedCost(
                arrayOf(
//                        intArrayOf(10, 20),
//                        intArrayOf(30, 200),
//                        intArrayOf(400, 50),
//                        intArrayOf(30, 20)

                        intArrayOf(259, 770),
                        intArrayOf(448, 54),
                        intArrayOf(926, 667),
                        intArrayOf(184, 139),
                        intArrayOf(840, 118),
                        intArrayOf(577, 469)
                )
        )
        )
    }

    private fun reserveString() {
        println(ReserveString().reserveString("hello".toCharArray()))
    }

    private fun randomPickWithWeight() {
        println(RandomPickWIthWeight(intArrayOf(1)))
    }

    private fun reconstructionQueue() {
        val peoples = arrayOf(
                intArrayOf(7, 0),
                intArrayOf(4, 4),
                intArrayOf(7, 1),
                intArrayOf(5, 0),
                intArrayOf(6, 1),
                intArrayOf(5, 2)
        )
        val result = QueueReconstructionByHeight().reconstructionQueue(peoples)
        result.forEach { print(it.toList()) }

        println()
    }

    private fun coinChange() {
        println(CoinChange().change(5, intArrayOf(1, 2, 5)))
    }

    private fun powerOfTwo() {
        println(PowerOfTwo().isPowerOfTwo(218))
        println(PowerOfTwo().isPowerOfTwo(1))
        println(PowerOfTwo().isPowerOfTwo(16))
    }

    private fun isSubSequence() {
        println(SubSequence().isSubsequence("abc", "ahbgdc"))
        println(SubSequence().isSubsequence("axc", "ahbgdc"))
        println(SubSequence().isSubsequence("ace", "abcde"))
        println(SubSequence().isSubsequence("aec", "abcde"))
    }

    private fun searchInsert() {
        println(SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 5))
        println(SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 2))
        println(SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 7))
        println(SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }

    private fun sortColors() {
        println(SortColors().sortColors(intArrayOf(2, 0, 2, 1, 1, 0)).toList())
    }

    private fun randomizedSet() {
        // Init an empty set.
        val randomSet = RandomizedSet()

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        println(randomSet.insert(1))

        // Returns false as 2 does not exist in the set.
        println(randomSet.remove(2))

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        println(randomSet.insert(2))

        // getRandom should return either 1 or 2 randomly.
        println(randomSet.getRandom())

        // Removes 1 from the set, returns true. Set now contains [2].
        println(randomSet.remove(1))

        // 2 was already in the set, so return false.
        println(randomSet.insert(2))

        // Since 2 is the only number in the set, getRandom always return 2.
        println(randomSet.getRandom())
    }

    private fun largestDivisibleSubset() {
//        println(LargestDivisibleSubset().largestDivisibleSubset(intArrayOf(1, 2, 3)))
//        println(LargestDivisibleSubset().largestDivisibleSubset(intArrayOf(1, 2, 4, 8)))
//        println(LargestDivisibleSubset().largestDivisibleSubset(intArrayOf(546, 669)))
        println(LargestDivisibleSubset().largestDivisibleSubset(intArrayOf(359, 376, 43, 315, 167, 216, 777, 625, 498, 442, 172,
                324, 987, 400, 280, 367, 371, 24, 418, 208, 812, 488, 861, 646, 63, 804, 863, 853, 102, 174, 443, 901, 486, 126, 419, 701, 254, 550, 48,
                214, 873, 386, 965, 504, 753, 336, 527, 522, 895, 339, 361, 755, 423, 558, 551, 276, 11, 724, 70, 823, 624, 555, 300, 42, 607, 554, 84,
                508, 953, 649, 732, 338, 613, 236, 90, 762, 612, 194, 452, 972, 140, 747, 209, 690, 22, 220, 413, 91, 36, 998, 341, 77, 956, 246, 512,
                464, 198, 547, 888, 476, 782, 977, 776, 896, 940, 321, 347, 264, 621, 10, 829, 383, 939, 825, 441, 326, 822, 754, 130, 379, 265, 945,
                577, 491, 252, 273, 792, 168, 699, 866, 319, 704, 708, 148, 230, 521, 914, 988, 846, 88, 121, 600, 217, 499, 513, 427, 344, 3, 242,
                947, 627, 325, 146, 469, 375, 12, 815, 46, 67, 193, 648, 963, 876, 78, 366, 531, 49, 532, 475, 875, 398, 69, 821, 454, 497, 170, 922,
                872, 533, 736, 917, 951, 609, 461, 598, 571, 118, 798, 981, 835, 113, 530, 799, 995, 930, 682, 38, 405, 557, 787, 377, 810, 278, 874,
                331, 199, 97, 215, 286, 13, 165, 473, 115, 816, 584, 707, 237, 568, 72, 166, 249, 805, 247, 746, 534, 408, 759, 739, 925, 855, 305,
                210, 219, 470, 807, 936, 974, 417, 519, 288, 15, 64, 438, 581, 455, 250, 503, 496, 145, 256, 327, 255, 346, 251, 109, 650, 813, 679,
                119, 619, 721, 406, 593, 489, 924, 964, 563, 897, 27, 769, 687, 608, 224, 462, 432, 39, 937, 384, 990, 45, 33, 154, 723, 152, 772, 795,
                364, 283, 833, 395, 495, 164, 181, 232, 116, 899, 458, 548, 191, 320, 889, 587, 353, 661, 856, 814, 764, 529, 737, 948, 127, 335, 695,
                960, 858, 801, 543, 916, 588, 478, 103, 592, 20, 481, 958, 618, 334, 424, 397, 694, 314, 158, 114, 700, 381, 287, 683, 966, 459, 923,
                902, 332, 892, 235, 938, 178, 431, 631, 296, 885, 820, 409, 585, 141, 223, 535, 688, 258, 689, 884, 720, 365, 611, 277, 985, 684, 416,
                666, 182, 961, 108, 355, 525, 862, 412, 549, 186, 244, 589, 421, 52, 76, 718, 352, 702, 510, 117, 290, 692, 603, 864, 323, 388, 536,
                392, 151, 436, 350, 788, 75, 900, 490, 306, 975, 207, 261, 870, 188, 729, 231, 485, 348, 507, 676, 238, 111, 180, 984, 135, 771, 671,
                51, 1, 997, 675, 869, 950, 445, 434, 92, 137, 221, 907, 245, 17, 794, 360, 935, 370, 239, 362, 175, 620, 973, 784, 106, 136, 122, 281,
                426, 196, 134, 68, 634, 672, 28, 385, 411, 526, 735, 633, 841, 227, 86, 500, 653, 906, 933, 932, 129, 435, 756, 262, 698, 329, 204, 941,
                614, 668, 139, 403, 229, 243, 808, 857, 659, 640, 545, 345, 82, 228, 516, 734, 566, 868, 414, 474, 506, 363, 87, 173, 578, 575, 312,
                169, 908, 929, 444, 685, 657, 23, 524, 358, 225, 9, 41, 999, 834, 546, 920, 849, 456, 93, 651, 433, 586, 882, 942, 457, 62, 839, 818,
                260, 369, 773, 890, 865, 596, 98, 271, 669, 962, 311, 996, 160, 200, 767, 539, 163, 800, 757, 582, 343, 538, 131, 567, 446, 213, 378,
                959, 299, 915, 761, 313, 845, 712, 330, 253, 573, 18, 138, 317, 56, 691, 349, 605, 463, 652, 781, 992, 422, 32, 664, 711, 284, 741,
                289, 57, 697, 368, 583, 943, 40, 298, 430, 851, 913, 745, 65, 179, 705, 630, 401, 674, 465, 487, 878, 477, 240, 35, 572, 838, 968, 678,
                342, 775, 30, 806, 680, 969, 2, 241, 909, 803, 979, 460, 518, 156, 85, 643, 850, 597, 843, 89)))
    }

    private fun findCheapestPrice() {
//        println(CheapestFlightsWithinKStops().findCheapestPrice(
//                3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)), 0, 2, 1)
//        )
//        println(CheapestFlightsWithinKStops().findCheapestPrice(
//                3, arrayOf(intArrayOf(0, 1, 100), intArrayOf(1, 2, 100), intArrayOf(0, 2, 500)), 0, 2, 0)
//        )
//        println(CheapestFlightsWithinKStops().findCheapestPrice(
//                5,
//                arrayOf(
//                        intArrayOf(1, 2, 10),
//                        intArrayOf(2, 0, 7),
//                        intArrayOf(1, 3, 8),
//                        intArrayOf(4, 0, 10),
//                        intArrayOf(3, 4, 2),
//                        intArrayOf(4, 2, 10),
//                        intArrayOf(0, 3, 3),
//                        intArrayOf(3, 1, 6),
//                        intArrayOf(2, 4, 5)
//                ),
//                0,
//                4,
//                1)
//        )
        println(CheapestFlightsWithinKStops().findCheapestPrice(
                10,
                arrayOf(
                        intArrayOf(3, 4, 4),
                        intArrayOf(2, 5, 6),
                        intArrayOf(4, 7, 10),
                        intArrayOf(9, 6, 5),
                        intArrayOf(7, 4, 4),
                        intArrayOf(6, 2, 10),
                        intArrayOf(6, 8, 6),
                        intArrayOf(7, 9, 4),
                        intArrayOf(1, 5, 4),
                        intArrayOf(1, 0, 4),
                        intArrayOf(9, 7, 3),
                        intArrayOf(7, 0, 5),
                        intArrayOf(6, 5, 8),
                        intArrayOf(1, 7, 6),
                        intArrayOf(4, 0, 9),
                        intArrayOf(5, 9, 1),
                        intArrayOf(8, 7, 3),
                        intArrayOf(1, 2, 6),
                        intArrayOf(4, 1, 5),
                        intArrayOf(5, 2, 4),
                        intArrayOf(1, 9, 1),
                        intArrayOf(7, 8, 10),
                        intArrayOf(0, 4, 2),
                        intArrayOf(7, 2, 8)
                ),
                6,
                0,
                7
        ))

    }
}