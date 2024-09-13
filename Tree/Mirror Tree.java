import java.util.LinkedList;
import java.util.Queue;

public class Mirror Tree {
    
    QUESTION LINK:

    https://www.geeksforgeeks.org/problems/mirror-tree/1

}

// RECURSIVE APPROACH 

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node == null)
        {
            return;
        }
        
        // Swap the left and right children of the current node
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
        // Recursively mirror the left and right subtrees
        mirror(node.left);
        mirror(node.right);
    }
}


// ITERATIVE APPROACH 

class Solution {
    void mirror(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // Swap left and right children
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;

            // Enqueue left and right children
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}

