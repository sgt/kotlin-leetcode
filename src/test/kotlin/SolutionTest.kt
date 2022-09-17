import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun testIsSubsequence() {
        assertTrue(Solution.isSubsequence(s = "abc", t = "ahbgdc"), "abc")
        assertFalse(Solution.isSubsequence(s = "axc", t = "ahbgdc"), "axc")
        assertTrue(Solution.isSubsequence(s = "", t = "ahbgdc"), "empty")
    }
}
