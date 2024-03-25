import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/description/">merge two sorted lists</a>
 */
public class MergeTwoSortedLists {
    public ListNode<Integer> mergeTwoLists(ListNode<Integer> list1, ListNode<Integer> list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static class ListNode<T> {

        T val;

        ListNode<T> next;

        public ListNode() {
            this(null);
        }

        public ListNode(T val) {
            this(val, null);
        }

        public ListNode(T val, ListNode<T> next) {
            this.val = val;
            this.next = next;
        }

        public ListNode<T> hasNext() {
            return next ;
        }
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();

        ListNode<Integer> list1 = new ListNode<>(1);
        ListNode<Integer> list10 = new ListNode<>(2);
        ListNode<Integer> list11= new ListNode<>(4);
        list1.next = list10;
        list10.next = list11;

        ListNode<Integer> list2 = new ListNode<>(1);
        ListNode<Integer> list20 = new ListNode<>(3);
        ListNode<Integer> list21= new ListNode<>(4);
        list2.next = list20;
        list20.next = list21;

        ListNode<Integer> result = solution.mergeTwoLists(list1, list2);
    }
}

