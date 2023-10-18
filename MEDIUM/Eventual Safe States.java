QUESTION :- Eventual Safe States 


https://practice.geeksforgeeks.org/problems/eventual-safe-states/1


SOLUTION :-

//{ Driver Code Starts
// Initial Template for Java

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        List<Integer> safeNodes = new ArrayList<>();
        int[] state = new int[V]; // 0: not visited, 1: visiting, 2: visited
        
        for (int i = 0; i < V; i++) {
            if (dfs(i, adj, state)) {
                safeNodes.add(i);
            }
        }
        
        Collections.sort(safeNodes);
        return safeNodes;
    }
    
    private boolean dfs(int node, List<List<Integer>> adj, int[] state) {
        if (state[node] == 1) return false; // Visiting, cycle detected
        if (state[node] == 2) return true; // Already visited, it's a safe node
        
        state[node] = 1; // Mark as visiting
        
        for (int neighbor : adj.get(node)) {
            if (!dfs(neighbor, adj, state)) return false;
        }
        
        state[node] = 2; // Mark as visited (safe)
        return true;
    }
}


