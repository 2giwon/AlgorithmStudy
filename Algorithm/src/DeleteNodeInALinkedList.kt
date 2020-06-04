class DeleteNodeInALinkedList {
    val linkedList = ListNode(4).apply {
        next = ListNode(5).apply {
            next = ListNode(1).apply {
                next = ListNode(9)
            }
        }
    }

    fun deleteNode(node: ListNode?) {
        node?.v = node?.next?.v
        node?.next = node?.next?.next
    }
}