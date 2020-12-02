package leetcode.challenge.december

import leetcode.study.TreeNode
import kotlin.math.max

class MaxDepthBinaryTree {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        var depth = 0
        depth++
        depth += max(maxDepth(root.left), maxDepth(root.right))
        return depth
    }
}