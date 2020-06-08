import kotlin.random.Random

class RandomPickWIthWeight(private val w: IntArray) {
    private val max = w.sum()
    private val random = Random.Default

    fun pickIndex(): Int = random.nextInt(max).let { random ->
        // accIndex is the index of the result
        // accValue is the sum of the value in the array until the value is found.
        w.foldIndexed(0 to 0) { index, (accValue, accIndex), value ->
            when {
                // if random falls into this part of the pie
                random in accValue until accValue + value -> accValue + value to index
                random >= accValue + value -> accValue + value to accIndex
                else -> accValue to accIndex
            }
        }.second
    }
}