package Tree;

public class closest Neighbour in BST {
    
    https://www.geeksforgeeks.org/problems/closest-neighbor-in-bst/1
    
}


SOLUTION :-

class Solution {
    public static int findMaxForN(Node root, int n) {
        int maxVal = -1; // Initialize the maximum value
        
        // Traverse the BST
        while (root != null) {
            // If the current node's key is greater than or equal to n, move to the left subtree
            if (root.key >= n) {
                root = root.left;
            } else { // If the current node's key is less than n, update maxVal and move to the right subtree
                maxVal = root.key;
                root = root.right;
            }
        }
        
        return maxVal; // Return the maximum value less than or equal to n
    }
}
