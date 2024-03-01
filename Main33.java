class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the head itself needs to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        // If the list becomes empty or only contains nodes with value val
        if (head == null) {
            return null;
        }
        
        ListNode prev = head;
        ListNode current = head.next;
        
        // Iterate through the list and remove nodes with value val
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        
        return head;
    }
}

public class Main33 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        
        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);
        
        // Create an instance of Solution class
        Solution solution = new Solution();
        
        // Remove nodes with value 6
        int valToRemove = 6;
        head = solution.removeElements(head, valToRemove);
        
        // Print the modified linked list
        System.out.println("\nLinked List after removing nodes with value " + valToRemove + ":");
        printLinkedList(head);
    }
    
    // Helper method to print the linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
