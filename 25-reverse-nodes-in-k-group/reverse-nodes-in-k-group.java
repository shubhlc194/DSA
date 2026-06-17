/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if(head == null || k == 1)
            return head;

        ListNode prevleft = null;
        ListNode left = head;

        while(left != null){

            ListNode right = left;

            for(int i = 1; i < k; i++){
                right = right.next;

                if(right == null)
                    return head;
            }

            ListNode nextleft = right.next;

            ListNode prev = nextleft;
            ListNode curr = left;

            while(curr != nextleft){
                ListNode nex = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nex;
            }

            if(prevleft == null)
                head = right;
            else
                prevleft.next = right;

            prevleft = left;
            left = nextleft;
        }

        return head;
    }
}