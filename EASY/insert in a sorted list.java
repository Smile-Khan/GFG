QUESTION :- insert in a sorted list 

https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

SOLUTION :-

//{ Driver Code Starts
import java.io.IOException;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution g = new Solution();
            head = g.sortedInsert(head,k);
            
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
         Node newNode = new Node(key);
        
        if (head1 == null || head1.data >= key) {
            newNode.next = head1;
            head1 = newNode;
            return head1;
        }
        
        Node current = head1;
        Node prev = null;
        
        while (current != null && current.data < key) {
            prev = current;
            current = current.next;
        }
        
        prev.next = newNode;
        newNode.next = current;
        
        return head1;
    }
}
