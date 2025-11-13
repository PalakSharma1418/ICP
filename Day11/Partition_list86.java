package Day11;

public class Partition_list86 {
    public class ListNode {
         ListNode next;
         int val;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode lefttemp = left;
        ListNode righttemp = right;
        while(head != null){
            if(head.val < x){
                left.next = head;
                left = left.next;
            }
            else{
                right.next = head;
                right = right.next;
            }
            head  = head.next;
        }
        
        right.next = null;
        left.next = righttemp.next;
        return lefttemp.next;
    }
}

