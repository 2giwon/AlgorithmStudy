package leetcode.challenge.april

import util.TreeNode
import kotlin.math.max

class DiameterOfBinaryTree {
    /**
     * Example:
     * var ti = util.TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class util.TreeNode(var `val`: Int) {
     *     var left: util.TreeNode? = null
     *     var right: util.TreeNode? = null
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

