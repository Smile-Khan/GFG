QUESTION :- Find Common Nodes in Two BSTs 

https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1

import java.util.ArrayList;
import java.util.Stack;

SOLUTION :- 


class Solution
{
    public static ArrayList<Integer> findCommon(Node root1, Node root2)
    {
        // Create an ArrayList to store common nodes.
        ArrayList<Integer> commonNodes = new ArrayList<>();
        
        // Create two stacks to traverse the two BSTs.
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        
        // Initialize current nodes for both trees.
        Node current1 = root1;
        Node current2 = root2;

        // Use a loop to traverse the trees.
        while (!stack1.isEmpty() || !stack2.isEmpty() || current1 != null || current2 != null) {
            // Traverse the left subtree of the first tree and push nodes onto stack1.
            while (current1 != null) {
                stack1.push(current1);
                current1 = current1.left;
            }

            // Traverse the left subtree of the second tree and push nodes onto stack2.
            while (current2 != null) {
                stack2.push(current2);
                current2 = current2.left;
            }

            // Check if both stacks are not empty.
            if (!stack1.isEmpty() && !stack2.isEmpty()) {
                current1 = stack1.peek();
                current2 = stack2.peek();

                // If current nodes have the same value, they are common nodes.
                if (current1.data == current2.data) {
                    commonNodes.add(current1.data); // Add the common node to the ArrayList.
                    stack1.pop(); // Pop the node from stack1.
                    stack2.pop(); // Pop the node from stack2.
                    current1 = current1.right; // Move to the right child of the first tree.
                    current2 = current2.right; // Move to the right child of the second tree.
                } 
                // If the value of the current node in the first tree is less than the second tree.
                // Pop the node from stack1 and move to its right child.
                else if (current1.data < current2.data) {
                    stack1.pop();
                    current1 = current1.right;
                    current2 = null;
                } 
                // If the value of the current node in the second tree is less than the first tree.
                // Pop the node from stack2 and move to its right child.
                else {
                    stack2.pop();
                    current2 = current2.right;
                    current1 = null;
                }
            } 
            // If one of the stacks is empty, we need to continue traversing the non-empty stack.
            else if (!stack1.isEmpty()) {
                current1 = stack1.pop(); // Pop the node from stack1.
                current1 = current1.right; // Move to the right child.
                current2 = null;
            } else {
                current2 = stack2.pop(); // Pop the node from stack2.
                current2 = current2.right; // Move to the right child.
                current1 = null;
            }
        }
        
        // Return the ArrayList of common nodes in sorted order.
        return commonNodes;
    }
}
