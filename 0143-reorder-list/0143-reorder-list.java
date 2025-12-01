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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode temp=head;

        while(temp!=null){
            ListNode nxt=temp.next;
            temp.next=pre;
            pre=temp;
            temp=nxt;   // ✅ fixed
        }
        return pre;
    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return;   // ✅ fixed (no return of head)
        }  

        ListNode a=head;  
        ListNode middleElement=middleNode(head);
        ListNode b=middleElement.next;
        middleElement.next=null;

        // reverse second half
        b=reverseList(b);

        ListNode aH=null;
        ListNode aT=null;  
        int index=0;

        while(a!=null && b!=null){
            if(index%2==0){
                if(aH==null){
                    aH=a;
                    aT=a;
                }
                else{
                    aT.next=a;
                    aT=a;
                }
                a=a.next;
            }
            else{
                aT.next=b;
                aT=b;
                b=b.next;
            }
            index++;
        }
        if(a!=null){
            aT.next=a;
            aT=a;
        }
        if(b!=null){
            aT.next=b;
            aT=b;
        }
        
    }
}