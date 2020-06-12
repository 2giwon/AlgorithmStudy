package util

object HeapSort {
    fun heapSort(nums: IntArray) {
        for (i in (nums.size / 2 - 1) downTo 0) {
            heapify(nums, nums.size, i)
        }

        for (j in nums.lastIndex downTo 1) {
            swap(nums, 0, j)

            heapify(nums, j, 0)
        }
    }

    private fun heapify(arr: IntArray, n: Int, i: Int) {
        var largest = i
        val left = i * 2 + 1
        val right = i * 2 + 2

        if (left < n && arr[left] > arr[largest]) {
            largest = left
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right
        }

        if (largest != i) {
            swap(arr, i, largest)

            heapify(arr, n, largest)
        }

    }

    private fun swap(arr: IntArray, start: Int, dest: Int) {
        val temp = arr[start]
        arr[start] = arr[dest]
        arr[dest] = temp
    }
}
