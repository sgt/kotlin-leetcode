object Solution {
    tailrec fun isSubsequence(s: String, t: String): Boolean =
        when {
            s.isEmpty() -> true
            s.length > t.length -> false
            s[0] == t[0] -> isSubsequence(s.substring(1), t.substring(1))
            else -> isSubsequence(s, t.substring(1))
        }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? =
        when {
            list1 == null && list2 == null -> null
            list1 == null -> list2
            list2 == null -> list1
            list1.`val` < list2.`val` -> {
                val n = ListNode(list1.`val`)
                n.next = mergeTwoLists(list1.next, list2)
                n
            }

            else -> {
                val n = ListNode(list2.`val`)
                n.next = mergeTwoLists(list1, list2.next)
                n
            }
        }

    fun reverseList(head: ListNode?): ListNode? {
        tailrec fun helper(acc: ListNode?, head: ListNode?): ListNode? =
            when {
                head == null -> acc
                else -> {
                    val n = ListNode(head.`val`)
                    n.next = acc
                    helper(n, head.next)
                }
            }

        return helper(null, head)
    }
}
