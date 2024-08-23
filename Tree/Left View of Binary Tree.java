package Tree;

public class Left View of Binary Tree {
    
    QUESTION LINK:

    https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1


}

SOLUTION :-

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.View;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    // Function to return list containing elements of the left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i == 0) {  // Add the first node of each level
                    result.add(node.data);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return result;
    }
}

