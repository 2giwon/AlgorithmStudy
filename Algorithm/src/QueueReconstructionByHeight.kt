class QueueReconstructionByHeight {
    fun reconstructionQueue(people: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        people.sortWith(compareBy({ -it[0] }, { it[1] }))
        people.forEach { result.add(it[1], it) }
        return result.toTypedArray()
    }
}