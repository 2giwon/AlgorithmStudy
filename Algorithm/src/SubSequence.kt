class SubSequence {
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.isEmpty()) return true
        if (t.isEmpty()) return false

        val start = t.indexOf(s.first())
        return if (start > -1) {
            isSubsequence(s.drop(1), t.substring(start + 1))
        } else {
            false
        }
    }
}