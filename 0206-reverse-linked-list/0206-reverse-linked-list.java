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
    public ListNode reverseList(ListNode head) {
        if(head == null ){
            return head;
        }
        ListNode temp =head;
        ListNode nextadd = temp.next;
        ListNode currentadd = temp;
        temp.next= null;
        temp=nextadd;
        while(temp!=null){
            ListNode nextadd1 = temp.next;
            temp.next =currentadd;
            currentadd = temp;
            temp = nextadd1;
        }
        head =currentadd;
        return head;
    }
}