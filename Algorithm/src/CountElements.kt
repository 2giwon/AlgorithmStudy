class CountElements {
    fun countElements(arr: IntArray): Int {
        arr.sort()
        var result = 0
        arr.forEachIndexed { index, v ->
            for (i in index + 1..arr.lastIndex) {
                if (v + 1 == arr[i]) {
                    result++
                    break
                }
            }
        }

        return result
    }
}