package greedy

/*
    일부 플롯에는 꽃이 심어져 있고 일부는 심어져 있지 않은 긴 화단이 있습니다. 그러나 인접한 화단에는 꽃을 심을 수 없습니다.

    0과 1이 포함된 정수 배열 화단(0은 비어 있고 1은 비어 있지 않음을 의미)과 정수 n이 주어질 때, 인접 꽃 금지 규칙을 위반하지 않고 화단에 새 꽃을 심을 수 있으면 참을 반환하고, 그렇지 않으면 거짓을 반환합니다.



    예제 1:

    입력: 화단 = [1,0,0,0,1], n = 1
    출력: true

    예 2:

    입력: flowerbed = [1,0,0,0,1], n = 2
    출력: false
 */
fun main(args: Array<String>) {
//    println(CanPlaceFlowers(flowerbed = intArrayOf(1, 0, 0, 0, 1), 2).solution())
//    println(CanPlaceFlowers(flowerbed = intArrayOf(1, 0, 0, 0, 1), 1).solution())
//    println(CanPlaceFlowers(flowerbed = intArrayOf(1, 0, 0, 0, 0, 0, 1), 2).solution())
//    println(CanPlaceFlowers(flowerbed = intArrayOf(0, 1, 0), 1).solution())
//    println(CanPlaceFlowers(flowerbed = intArrayOf(0, 0, 1, 0, 1), 1).solution())
//    println(CanPlaceFlowers(flowerbed = intArrayOf(0), 1).solution())
    println(CanPlaceFlowers(flowerbed = intArrayOf(0, 0, 1, 0, 0), 1).solution())
}

class CanPlaceFlowers(
    private val flowerbed: IntArray,
    private val n: Int
) {
    fun solution(): Boolean {
        var result = n
        flowerbed.forEachIndexed { index, i ->
            if (result == 0) return true
            if (i == 0) {
                when {
                    index == 0 && 1 > flowerbed.lastIndex -> {
                        result--
                        flowerbed[index] = 1
                    }

                    index == 0 && flowerbed[1] != 1 -> {
                        result--
                        flowerbed[index] = 1
                    }

                    index == flowerbed.lastIndex && flowerbed.size > 1 && flowerbed[index - 1] != 1 -> {
                        result--
                        flowerbed[index] = 1
                    }

                    index > 0 && flowerbed[index - 1] != 1 && flowerbed[index + 1] != 1 -> {
                        result--
                        flowerbed[index] = 1
                    }
                }
            }
        }

        return result == 0
    }
}

class Solution6 {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        if (n == 0) return true
        var left = n
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0
                && (i == 0 || flowerbed[i - 1] == 0)
                && (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
            ) {
                flowerbed[i] = 1
                left--
                if (left == 0) return true
            }
        }
        return false
    }
}
