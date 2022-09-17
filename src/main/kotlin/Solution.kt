object Solution {
    tailrec fun isSubsequence(s: String, t: String): Boolean =
        when {
            s.isEmpty() -> true
            s.length > t.length -> false
            s[0] == t[0] -> isSubsequence(s.substring(1), t.substring(1))
            else -> isSubsequence(s, t.substring(1))
        }
}
