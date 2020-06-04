class MiddleNode {
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    fun middleNode(head: ListNode?): ListNode? {
        val middleValue = findMaxNode(head, 1)?.let {
            it / 2 + 1
        }

        var next: ListNode? = ListNode(head?.v ?: 0).apply { next = head?.next }
        var result: ListNode? = head

        var count = 1
        while (next != null) {
            if (count == middleValue) {
                result = next
                break
            }

            next = next?.next
            count++
        }

        return result
    }

    fun middleNodeAnother(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        return slow
    }

    private fun findMaxNode(head: ListNode?, count: Int): Int? {
        var c = count
        return if (head?.next == null) {
            c
        } else {
            findMaxNode(head.next, ++c)
        }
    }
}
