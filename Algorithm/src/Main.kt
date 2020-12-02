import leetcode.challenge.december.MaxDepthBinaryTree
import leetcode.study.TreeNode

fun main(args: Array<String>) {
//    println(RangeSumBST().rangeSumBST(TreeNode(10).apply {
//        left = TreeNode(5).apply {
//            left = TreeNode(3)
//            right = TreeNode(7)
//        }
//        right = TreeNode(15).apply {
//            right = TreeNode(18)
//        }
//    }, 7, 15))
//
//    println(RangeSumBST().rangeSumBST(TreeNode(10).apply {
//        left = TreeNode(5).apply {
//            left = TreeNode(3).apply { left = TreeNode(1) }
//            right = TreeNode(7).apply { left = TreeNode(6) }
//        }
//        right = TreeNode(15).apply {
//            left = TreeNode(13)
//            right = TreeNode(18)
//        }
//    }, 6, 10))

    println(MaxDepthBinaryTree().maxDepth(TreeNode(3).apply {
        left = TreeNode(9)
        right = TreeNode(20).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
    }))

    println(MaxDepthBinaryTree().maxDepth(TreeNode(1).apply {
        right = TreeNode(2)
    }))

    println(MaxDepthBinaryTree().maxDepth(null))
    println(MaxDepthBinaryTree().maxDepth(TreeNode(0)))
}
