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
    public void reorderList(ListNode h) {
        if(h==null||h.next==null)return;
        ListNode s=h,f=h;
        while(f.next!=null&&f.next.next!=null){s=s.next;f=f.next.next;}
        ListNode p=null,c=s.next;s.next=null;
        while(c!=null){ListNode n=c.next;c.next=p;p=c;c=n;}
        while(p!=null){ListNode n=h.next,m=p.next;h.next=p;p.next=n;h=n;p=m;}
    }
}
