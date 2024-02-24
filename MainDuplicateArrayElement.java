class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
               
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return head;
    }
}

public class MainDuplicateArrayElement {
    public static void main(String[] args) {
        
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        
        Solution solution = new Solution();
        ListNode result = solution.deleteDuplicates(node1);
        

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
