class ListNode(val `val`: Int) {
    var next: ListNode? = null

    override fun toString(): String =
        listNodeToList(this).toString()
}

fun listToListNode(l: List<Int>): ListNode? =
    if (l.isEmpty()) {
        null
    } else {
        val n = ListNode(l[0])
        n.next = listToListNode(l.subList(1, l.size))
        n
    }

fun listNodeToList(n: ListNode?): List<Int> =
    if (n == null) {
        listOf()
    } else {
        listOf(n.`val`) + listNodeToList(n.next)
    }
