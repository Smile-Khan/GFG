package Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Burning Tree {
    
    QUESTION LINK:

    https://www.geeksforgeeks.org/problems/burning-tree/1


}

SOLUTION: -

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        
        // Step 1: Create a parent map
        Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode = mapParents(root, target, parentMap);
        
        // Step 2: Perform BFS to burn the tree
        return burnTree(targetNode, parentMap);
    }
    
    private static Node mapParents(Node root, int target, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node targetNode = null;
        
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            if (currentNode.data == target) {
                targetNode = currentNode;
            }
            if (currentNode.left != null) {
                parentMap.put(currentNode.left, currentNode);
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                parentMap.put(currentNode.right, currentNode);
                queue.add(currentNode.right);
            }
        }
        return targetNode;
    }
    
    private static int burnTree(Node targetNode, Map<Node, Node> parentMap) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        
        queue.add(targetNode);
        visited.add(targetNode);
        int time = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burned = false;
            
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                
                // Check left child
                if (currentNode.left != null && !visited.contains(currentNode.left)) {
                    queue.add(currentNode.left);
                    visited.add(currentNode.left);
                    burned = true;
                }
                
                // Check right child
                if (currentNode.right != null && !visited.contains(currentNode.right)) {
                    queue.add(currentNode.right);
                    visited.add(currentNode.right);
                    burned = true;
                }
                
                // Check parent
                if (parentMap.containsKey(currentNode) && !visited.contains(parentMap.get(currentNode))) {
                    queue.add(parentMap.get(currentNode));
                    visited.add(parentMap.get(currentNode));
                    burned = true;
                }
            }
            
            if (burned) {
                time++;
            }
        }
        return time;
    }
}
