package leet.problem83;




public class Solution {
    public class ListNode {
         int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head){
        ListNode copy = head;
        while(head.next != null){
            if(head.val != head.next.val){
                head = head.next;
            }else{
                head.next = head.next.next;
            }
        }
        return copy;
    }

}
