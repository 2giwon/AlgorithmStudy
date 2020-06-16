package programmers.coding

import kotlin.math.ceil

class DevFunction {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()

        var lastDay = 0
        var cnt = 0
        progresses
                .asSequence()
                .mapIndexed { idx, progress -> progress to speeds[idx].toDouble() }
                .map { (100 - it.first) / it.second }
                .map(::ceil)
                .map { it.toInt() }
                .forEach { curDay ->
                    if (lastDay >= curDay) {
                        cnt++
                    } else {
                        if (lastDay != 0) answer += cnt
                        lastDay = curDay
                        cnt = 1
                    }
                }
        answer += cnt

        return answer
    }
}

fun mySolution(progresses: IntArray, speeds: IntArray): IntArray {
    val answer = mutableListOf<Int>()
    val queue = progresses.toMutableList()
    val speedsQueue = speeds.toMutableList()
    var release = 0

    while (queue.isNotEmpty()) {
        while (queue.isNotEmpty() && queue.first() == 100) {
            queue.removeAt(0)
            speedsQueue.removeAt(0)
            release++
        }

        if (release > 0) {
            answer.add(release)
            release = 0
        }

        queue.forEachIndexed { index, _ ->
            var work = queue[index] + speedsQueue[index]
            if (work > 100) work = 100
            queue[index] = work
        }
    }

    return answer.toIntArray()
}