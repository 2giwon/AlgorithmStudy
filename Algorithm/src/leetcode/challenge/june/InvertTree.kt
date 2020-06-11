package leetcode.challenge.june

import util.TreeNode

class InvertTree {
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
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return root
        val temp = invertTree(root.left)
        root.left = invertTree(root.right)
        root.right = temp

        return root
    }


}

