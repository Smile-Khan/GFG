package LinkedList;

public class Rotate a Linked List {

    QUESTION :-

    https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1

//{ Driver Code Starts
// Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
      if (head == null || k == 0) {
            return head;
        }

        // Initialize pointers and a counter.
        Node current = head;
        Node newHead = null;
        int count = 1;

        // Traverse the list to find the k-th node.
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // If current is null, k is greater than the number of nodes, so return the head.
        if (current == null || current.next == null) {
            return head;
        }

        // Mark the node next to the k-th node as the new head.
        newHead = current.next;

        // Break the list after the k-th node.
        current.next = null;

        // Traverse to the end of the list starting from the new head.
        Node temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect the end of the list to the old head.
        temp.next = head;

        // Return the new head of the rotated list.
        return newHead;
    }
}


//{ Driver Code Starts.

public class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            if (!input.isEmpty()) {
                String[] numbers = input.split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        arr.add(Integer.parseInt(num));
                    }
                }
            }

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            head = ob.rotate(head, k);
            printList(head);
        }
    }
}

// } Driver Code Ends



/// SOLUTION IN PYTHON 

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Solution:
    # Function to rotate a linked list.
    def rotate(self, head, k):
        if not head or k == 0:
            return head  # Edge case: empty list or no rotation needed
        
        current = head
        length = 1
        
        # Traverse the list to find the kth node and the length of the list
        while current.next and length < k:
            current = current.next
            length += 1
        
        if not current.next:
            return head  # If k is equal to or greater than the length of the list, no rotation needed
        
        # Mark the kth node
        new_head = current.next
        current.next = None  # Break the list at the kth node
        
        # Traverse the new list to find the end
        end = new_head
        while end.next:
            end = end.next
        
        # Connect the end of the list to the original head
        end.next = head
        
        return new_head

