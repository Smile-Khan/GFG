package LinkedList;

public class Add 1 to a Linked List Number {
    
    QUESTION: -

    https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

}

------------------JAVA--------------

class Solution {
    // FUNCTION TO REVERSE THE LINKED LIST
    private Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next_node = null;
        
        while(current != null)
        {
            next_node = current.next;
            current.next = prev;
            prev = current;
            current = next_node;
        }
        return prev;
    }
    // Function to Add one to the reversed list
    private Node addOnE(Node head)
    {
        Node res = head;
        Node temp = null;
        int carry = 1;
        int sum;
        
        while(head != null)
        {
            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            head.data = sum % 10;
            temp = head;
            head = head.next;
        }
        if(carry > 0)
        {
            temp.next = new Node(carry);
        }
        return res;
    }
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        head = addOnE(head);
        return reverse(head);
    }
}



----------------PYTHON----------------

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Solution:
    def reverse(self, head):
        prev = None
        current = head
        while current is not None:
            next_node = current.next
            current.next = prev
            prev = current
            current = next_node
        return prev

    def addOneUtil(self, head):
        carry = 1
        current = head
        
        while current:
            sum_value = current.data + carry
            carry = sum_value // 10
            current.data = sum_value % 10
            temp = current
            current = current.next
        
        if carry > 0:
            temp.next = Node(carry)
        
        return head

    def addOne(self, head):
        # Step 1: Reverse the linked list
        head = self.reverse(head)
        
        # Step 2: Add one to the reversed list
        head = self.addOneUtil(head)
        
        # Step 3: Reverse the list again to restore the original order
        head = self.reverse(head)
        
        return head