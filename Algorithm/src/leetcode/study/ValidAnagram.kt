package leetcode.study

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        s.forEach { c ->
            var ret = false
            t.forEach {
                if (c != it) {
                    ret = true
                }
            }
            if (!ret) return false
            ret = false
        }

        return true
    }
}