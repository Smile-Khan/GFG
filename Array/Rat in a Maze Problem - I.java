public class Rat in a Maze Problem - I {
    
    QUESTION :-

    https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

}

SOLUTION :-

//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    // Directions (right, left, down, up )
    private static final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    // characters corresponding to each directions
    private static final char[] dir_CHARS = {'R', 'L', 'D', 'U'};

    public ArrayList<String> findPath(int[][] mat) {
        // your code
        // size of the matrix
        int n = mat.length;
        // use list to store paths
        ArrayList<String> ans = new ArrayList<>();
        // boolean array to keep track of the visited elements
        boolean[][] visited = new boolean[n][n];

        // base case
        if (mat[0][0] == 0) {
            return ans;
        }

        // DFS 
        findPaths(mat, n, 0, 0, "", visited, ans);
        
        // If no path is found, add -1
        if (ans.isEmpty()) {
            ans.add("-1");
        } else {
            Collections.sort(ans);
        }

        return ans;
    }
    
    // Helper function to perform DFS

    private void findPaths(int[][] mat, int n, int x, int y, String path, boolean[][] visited, ArrayList<String> ans) {
        // if the current cell is destination, add it to ans LIST
        if (x == n - 1 && y == n - 1) {
            ans.add(path);
            return;
        }
        // Mark current cell as visited

        visited[x][y] = true;
        
        // Explore all possible directions

        for (int i = 0; i < 4; i++) {
            // Calculate new X AND Y coordinates.
            int newX = x + directions[i][0];
            int newY = y + directions[i][1];
            
            // Check if the new cell is within the matrix boundaries, is not blocked, and has not been visited

            if (newX >= 0 && newX < n && newY >= 0 && newY < n && mat[newX][newY] == 1 && !visited[newX][newY]) {
                // Recusively explore the new cell
                findPaths(mat, n, newX, newY, path + dir_CHARS[i], visited, ans);
            }
        }
        
        // Unmark the current cell
        visited[x][y] = false;
    }
}
