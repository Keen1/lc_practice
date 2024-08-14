package leet.problem2;

public class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(l1 != null){
            sb1.append(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            sb2.append(l2.val);
            l2 = l2.next;
        }
        sb1 = sb1.reverse();
        sb2 = sb2.reverse();
        int val1 = Integer.parseInt(sb1.toString());
        int val2 = Integer.parseInt(sb2.toString());
        int sum = val1 + val2;
        StringBuilder sumStr = new StringBuilder(String.valueOf(sum));
        String sumStrFin = sumStr.reverse().toString();
        ListNode result = new ListNode();
        ListNode returnPtr = result;
        for(int i = 0; i < sumStrFin.length(); i++){
            result.val = sumStrFin.charAt(i);
            result = result.next;
        }
        return returnPtr;
    }

}
