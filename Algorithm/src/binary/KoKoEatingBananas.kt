package binary

/*
    코코는 바나나를 좋아해요. 바나나 더미 n 개 있습니다. (i)번째 더미에는 (piles[i]) 바나나가 있습니다. 경비원은 나갔고 h시간 후에 돌아올 것입니다.

    코코는 시간당 바나나 먹는 속도를 k로 정할 수 있으며, 매 시간마다 바나나 더미를 선택하고 그 더미에서 바나나를 k개씩 먹습니다. 바나나 더미에 바나나가 k개보다 적으면 코코는 바나나를 모두 먹고 이 hour 동안 더 이상 바나나를 먹지 않습니다.

    코코는 천천히 먹는 것을 좋아하지만 경비원이 돌아오기 전에 바나나를 모두 먹고 싶어 합니다.

    코코가 h 시간 안에 바나나를 모두 먹을 수 있는 최소 정수 k를 반환합니다.



    예제 1:

    입력: piles = [3,6,7,11], h = 8
    Output: 4

    예제 2:

    입력: piles = [30,11,23,4,20], h = 5
    Output: 30

    예제 3:

    입력: piles = [30,11,23,4,20], h = 6
    Output: 23

 */
fun main(args: Array<String>) {
    println(KoKoEatingBananas().minEatingSpeed(piles = intArrayOf(3, 6, 7, 11), h = 8))
    println(KoKoEatingBananas().minEatingSpeed(piles = intArrayOf(30, 11, 23, 4, 20), h = 5))
    println(KoKoEatingBananas().minEatingSpeed(piles = intArrayOf(30, 11, 23, 4, 20), h = 6))
    println(KoKoEatingBananas().minEatingSpeed(piles = intArrayOf(312884470), h = 312884469))
}

class KoKoEatingBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var min = 1
        var max = piles.max()

        while (min < max) {
            val start = (min + max) / 2

            if (!canEatAll(start, piles, h)) {
                min = start + 1
            } else {
                max = start
            }
        }

        return min
    }

    private fun canEatAll(k: Int, piles: IntArray, h: Int): Boolean {
        var hours = 0
        for (pile in piles) {
            hours += (pile / k) + if (pile % k > 0) 1 else 0
            if (hours > h) return false
        }
        return true
    }
}
