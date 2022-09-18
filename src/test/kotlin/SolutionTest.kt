import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {

    @Test
    fun testIsSubsequence() {
        assertTrue(Solution.isSubsequence(s = "abc", t = "ahbgdc"), "abc")
        assertFalse(Solution.isSubsequence(s = "axc", t = "ahbgdc"), "axc")
        assertTrue(Solution.isSubsequence(s = "", t = "ahbgdc"), "empty")
    }

    @Test
    fun testMergeTwoLists() {
        assertArrayEquals(
            listOf(1, 1, 2, 3, 4, 4).toIntArray(),
            listNodeToList(
                Solution.mergeTwoLists(
                    listToListNode(listOf(1, 2, 4)),
                    listToListNode(listOf(1, 3, 4))
                )
            ).toIntArray()
        )
        assertEquals(null, Solution.mergeTwoLists(null, null))
        assertArrayEquals(
            listOf(0).toIntArray(),
            listNodeToList(Solution.mergeTwoLists(null, listToListNode(listOf(0)))).toIntArray()
        )
    }

    @Test
    fun testReverseList() {
        assertArrayEquals(
            listOf(5, 4, 3, 2, 1).toIntArray(),
            listNodeToList(Solution.reverseList(listToListNode(listOf(1, 2, 3, 4, 5)))).toIntArray()
        )
    }

    @Test
    fun testMaxProfit() {
        assertEquals(5, Solution.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
        assertEquals(0, Solution.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

}
