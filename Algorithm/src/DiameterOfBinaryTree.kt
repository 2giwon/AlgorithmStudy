import kotlin.math.max

class DiameterOfBinaryTree {
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

