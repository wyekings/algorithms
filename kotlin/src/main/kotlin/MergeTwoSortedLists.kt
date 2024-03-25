package org.wyekings


/**
 * https://leetcode.cn/problems/merge-two-sorted-lists
 */
class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode<Int>?, list2: ListNode<Int>?): ListNode<Int>? {
        if (list1 == null) {
            return list2
        } else if (list2 == null) {
            return list1;
        } else if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next)
            return list2
        }
    }
}

class ListNode<T>(val `val`: T, var next: ListNode<T>? = null)