class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prevleft = null;
        ListNode left = head;
        while (left != null && left.next != null) {
            ListNode right = left.next;
            ListNode nextleft = right.next;
            // reverse current pair
            ListNode prev = nextleft;
            ListNode curr = left;
            while (curr != nextleft) {
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
            }

            // connect with previous group
            if (prevleft == null)
                head = right;
            else
                prevleft.next = right;

            // left becomes tail after reversal
            prevleft = left;

            // move to next pair
            left = nextleft;
        }

        return head;
    }
}