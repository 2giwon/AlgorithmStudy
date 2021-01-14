import leetcode.study.DeleteNodeBST
import leetcode.study.TreeNode

fun main(args: Array<String>) {
    val value = TreeNode(5).apply {
        left = TreeNode(3).apply {
            left = TreeNode(2)
            right = TreeNode(4)
        }
        right = TreeNode(6).apply {
            right = TreeNode(7)
        }
    }
    println(DeleteNodeBST().deleteNode(value, 3))
}