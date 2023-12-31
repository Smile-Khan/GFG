QUESTION :- Pairwise swap elements of a linked list 


https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1



SOLUTION :- 


//{ Driver Code Starts
import java.io.IOException;
import java.util.HashMap;
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
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data); 
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data); 
            }
            
            Node failure = new Node(-1);
            
            Solution g = new Solution();
            head = g.pairwiseSwap(head);
            
            Node temp = head;
            int f = 0;
            while (temp != null) 
    		{ 
    			if(mp.get(temp) != temp.data){
    			    f = 1;
    			}
    			temp = temp.next; 
    		} 
            
            if(f==1){
                printList(failure); 
            }
            else{
                printList(head); 
            }
            t--;
        }
    } 
} 
   

// } Driver Code Ends


/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/


class Solution {
    // Function to pairwise swap elements of a linked list.
    // It ishould returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        
        // Base case: If the list has less than 2 nodes, no need to swap.
        if(head == null || head.next == null)
        {
            return head;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        while(head != null && head.next != null)
        {
            Node first = head;
            Node second = head.next;
            
            // Swape the nodes
            
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            // Move the pointers
            
            prev = first;
            head = first.next;
        }
        return dummy.next;
    }
}