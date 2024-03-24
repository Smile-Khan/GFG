public class Insert an Element at the Bottom of a Stack {
    

    https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1


}

SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

class GFG {
    static File file;
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String args[]) throws IOException {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            s = in.readLine().trim().split(" ");
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                st.push(Integer.parseInt(s[i]));
            }
            Solution ob = new Solution();
            Stack<Integer> S = ob.insertAtBottom(st, x);
            for (int i : S) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
         // Base case: if the stack is empty, push the new element
        if (st.isEmpty()) {
            st.push(x);
        } else {
            // Remove the top element from the stack
            int temp = st.pop();
            // Recur for the remaining elements
            insertAtBottom(st, x);
            // Push the removed element back onto the stack after the new element
            st.push(temp);
        }
        return st;
    }
}
