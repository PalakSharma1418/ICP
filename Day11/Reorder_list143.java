package Day11;

public class Reorder_list143 {
    public class ListNode {
         ListNode next;
         int val;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public static void reorderList(ListNode head) {
        if (head == null) return;

        // Step 1: Find the middle of the list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode curr = slow.next;//second
        slow.next = null;
        ListNode prev = null;//node

        while (curr  != null) {
            ListNode temp = curr .next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 3: Merge the two halves
        ListNode first = head;
        curr = prev;

        while (curr != null) {
            ListNode temp1 = first.next, temp2 = curr.next;
            first.next = curr;
            curr.next = temp1;
            first = temp1;
            curr = temp2;
        }   
          
    }
}
