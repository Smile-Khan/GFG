package Tree;

public class Sum Tree {
    
        QUESTION :-

        https://www.geeksforgeeks.org/problems/sum-tree/1
}

SOLUTION: -

class Solution {
    
    boolean isSumTree(Node root) {
        // Your code here
        return helper(root) != -1;
    }
    // Helper function that returns the sum of nodes
    private int helper(Node node)
    {
        // Base case : if node is null
        if(node == null)
        {
            return 0;
        }
        
        // Base case : if node is a leaf node
        if(node.left == null && node.right == null)
        {
            return node.data;
        }
        
        // Recsively check left and right subtrees
        int leftSum = helper(node.left);
        int rightSum = helper(node.right);
        
        // if any subtree is not a Sum Tree
        // Return a special value (-1)
        if(leftSum == -1 || rightSum == -1 || node.data != leftSum + rightSum)
        {
            return -1;
        }
        
        // Return the sum of values under this node including the node itself
        return node.data + leftSum + rightSum;
    }
}
