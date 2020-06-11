package leetcode.challenge.april

class MinStack {

    /** initialize your data structure here. */
    private val stack = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop() {
        stack.removeAt(stack.lastIndex)
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return stack.min() ?: 0
    }

}

/**
 * Your leetcode.challenge.april.MinStack object will be instantiated and called as such:
 * var obj = leetcode.challenge.april.MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */