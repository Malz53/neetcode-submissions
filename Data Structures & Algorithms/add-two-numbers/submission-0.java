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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode(0);
        ListNode currentResultNode = resultHead;
        int carryOver=0;
        //loop continues if eother list still has a value or carry still has something
        while(l1!=null || l2!=null || carryOver>0){
            int firstValue = (l1!=null) ? l1.val : 0;
            int secondValue = (l2!=null) ? l2.val : 0;
            int columnSum = firstValue + secondValue + carryOver;
            //The carry is the ammount passed to the next higher order digit;
            carryOver = columnSum/10;
            int currentDigit= columnSum%10;
            currentResultNode.next = new ListNode(currentDigit);
            currentResultNode = currentResultNode.next;

            //logic to advance the pointers
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return resultHead.next; //skipping dummy head
    }
}
