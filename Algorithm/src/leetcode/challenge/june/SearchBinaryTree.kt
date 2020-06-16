package leetcode.challenge.june

import util.TreeNode

class SearchBinaryTree {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        root?.let {
            var tree = searchBST(it.left, `val`)
            if (`val` == tree?.`val`) return tree
            tree = searchBST(it.right, `val`)
            if (`val` == tree?.`val`) return tree
            if (`val` == it.`val`) return it
        }

        return null
    }
}