class ValidParenthesisString {
    private val cache = Array<IntArray>(105) { IntArray(105) { -1 } }
    var str = ""
    fun checkValidString(s: String): Boolean {
        str = s
        return req(0, 0) != 0
    }

    private fun req(openCount: Int, idx: Int): Int {
        if (openCount < 0) return 0
        if (idx == str.length) {
            if (openCount == 0) return 1        // 모든 문자열 처리 끝남 완료처리
            return 0                            // 완료처리가 아닌 경우
        }

        var ret = cache[openCount][idx]         // dp 메모제이션
        if (ret != -1) {
            return ret
        }
        if (str[idx] == '(') {                    // 현재 인덱스가 왼쪽 괄호 인경우 openCnt +1 해서 다음 함수로 전달
            ret = req(openCount + 1, idx + 1)
            return ret
        }
        if (str[idx] == ')') {                       // 오른쪽 괄호 인 경우 openCount -1 전달
            ret = req(openCount - 1, idx + 1)
            return ret
        }
        if (str[idx] == '*') {                      // 별표인 경우 3가지 다해본다. 오른쪽괄호, 아무것도 없기, 왼쪽괄호
            ret = req(openCount - 1, idx + 1)
            ret += req(openCount, idx + 1)
            ret += req(openCount + 1, idx + 1)
        }
        return if (ret > 0) 1 else 0                      // 3가지 중 하나라도 성립되면 리턴 1
    }
}