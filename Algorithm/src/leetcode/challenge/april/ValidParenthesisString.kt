package leetcode.challenge.april

class ValidParenthesisString {
    fun checkValidString(s: String): Boolean {
        return req(0, 0, s) != 0
    }

    private fun req(openCount: Int, idx: Int, s: String): Int {
        if (openCount < 0) return 0
        if (idx == s.length) {
            if (openCount == 0) return 1        // 모든 문자열 처리 끝남 완료처리
            return 0                            // 완료처리가 아닌 경우
        }

        var ret = -1
        if (s[idx] == '(') {                    // 현재 인덱스가 왼쪽 괄호 인경우 openCnt +1 해서 다음 함수로 전달
            ret = req(openCount + 1, idx + 1, s)
            return ret
        }
        if (s[idx] == ')') {                       // 오른쪽 괄호 인 경우 openCount -1 전달
            ret = req(openCount - 1, idx + 1, s)
            return ret
        }
        if (s[idx] == '*') {                      // 별표인 경우 3가지 다해본다. 오른쪽괄호, 아무것도 없기, 왼쪽괄호
            ret = req(openCount - 1, idx + 1, s)       // 오른쪽 괄호
            ret += req(openCount, idx + 1, s)                     // 아무것도 없기
            ret += req(openCount + 1, idx + 1, s)      // 왼쪽 괄호
        }
        return if (ret > 0) 1 else 0                      // 3가지 중 하나라도 성립되면 리턴 1
    }
}