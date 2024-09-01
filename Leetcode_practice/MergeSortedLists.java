public class MergeSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode temp = new ListNode(-1);
            ListNode crt = temp;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    crt.next = list1;
                    list1 = list1.next;
                } else {
                    crt.next = list2;
                    list2 = list2.next;
                }
                crt = crt.next;
            }

            if (list1 != null) {
                crt.next = list1;
            } else {
                crt.next = list2;
            }

            return temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution sol = new Solution();
        ListNode res = sol.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }
}