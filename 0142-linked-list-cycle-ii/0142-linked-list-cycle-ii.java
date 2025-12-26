/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        //find kia ki cycle hai ki nahi 
        boolean iscycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
               iscycle=true;
               break;
            }
        }
//cycle nhi hai toh null return kr dia
        if(iscycle==false){
            return null;
        }
        //agr hai toh fast ko head pr point krwa dia aur slow abnd fst ko same speed se move krwaya
        fast=head;

        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    
    }
}