import leetcode.study.RangeSumBST
import leetcode.study.TreeNode

fun main(args: Array<String>) {
    println(RangeSumBST().rangeSumBST(TreeNode(10).apply {
        left = TreeNode(5).apply {
            left = TreeNode(3)
            right = TreeNode(7)
        }
        right = TreeNode(15).apply {
            right = TreeNode(18)
        }
    }, 7, 15))

    println(RangeSumBST().rangeSumBST(TreeNode(10).apply {
        left = TreeNode(5).apply {
            left = TreeNode(3).apply { left = TreeNode(1) }
            right = TreeNode(7).apply { left = TreeNode(6) }
        }
        right = TreeNode(15).apply {
            left = TreeNode(13)
            right = TreeNode(18)
        }
    }, 6, 10))
}
