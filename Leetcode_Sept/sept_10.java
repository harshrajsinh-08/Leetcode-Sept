public class sept_10 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode crt = head.next;
        ListNode prev = head;
        while (crt != null) {
            int x = gcd(prev.val, crt.val);
            prev.next = new ListNode(x, crt);
            prev = crt;
            crt = crt.next;
        }
        return head;
    }
    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}