class BackSpaceCompare {
    fun backspaceCompare(S: String, T: String): Boolean {
        var s: String = ""
        var t: String = ""

        S.forEach {
            if (it == '#') {
                s = s.dropLast(1)
            } else {
                s += it
            }
        }

        T.forEach {
            if (it == '#') {
                t = t.dropLast(1)
            } else {
                t += it
            }
        }

        return s == t
    }
}