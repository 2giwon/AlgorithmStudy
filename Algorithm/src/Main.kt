import leetcode.study.RecoverTree
import leetcode.study.TreeNode

fun main(args: Array<String>) {
    println(RecoverTree().recoverTree(TreeNode(1).apply {
        left = TreeNode(3).apply {
            right = TreeNode(2)
        }
    }))

    println(RecoverTree().recoverTree(TreeNode(3).apply {
        left = TreeNode(1)
        right = TreeNode(4).apply {
            right = TreeNode(2)
        }
    }))
}
