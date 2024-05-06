package Tree;

import java.util.ArrayList;
import java.util.Collections;

public class Print all nodes that don't have sibling {
    
    https://www.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1

}



//User function Template for Java

/*  A Binary Tree nodea
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Tree
{
    void find(Node root,ArrayList<Integer> list)
    {
        // code here
        if(root == null)return;
        // if(root.left == null && root.right == null)list.add(root.data);
        if(root.left == null && root.right != null){
            list.add(root.right.data);
            find(root.right,list);
        }else if(root.left != null && root.right == null){
            list.add(root.left.data);
            find(root.left,list);
        }else{
            find(root.left,list);
            find(root.right,list);
        }
    }
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        find(node,ans);
        Collections.sort(ans);
        if(ans.size() == 0)ans.add(-1);
        return ans;
    }
}
