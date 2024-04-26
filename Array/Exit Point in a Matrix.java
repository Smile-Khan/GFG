package Array;

public class Exit Point in a Matrix {
    
    https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1

//{ Driver Code Starts
// Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            int[] ans = ob.FindExitPoint(n, m, matrix);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
        
        int[] exitPoint = new int[2];
        // Initialize starting position at (0, 0) and direction (right).
        int row = 0, col = 0;
        int direction = 1; // 1: right, 2: down, 3: left, 4: up
        
        // Loop until we exit the matrix.
        while (true) {
            // If the current cell contains 1, change direction and mark the cell as 0.
            if (matrix[row][col] == 1) {
                matrix[row][col] = 0;
                direction = (direction + 1) % 4;
            }
            
            // Move to the next cell based on the current direction.
            switch (direction) {
                case 1: // Right
                    col++;
                    break;
                case 2: // Down
                    row++;
                    break;
                case 3: // Left
                    col--;
                    break;
                case 0: // Up (0 becomes 4 in the switch case)
                case 4: // Up
                    row--;
                    break;
            }
            
            // Check if we have exited the matrix.
            if (row < 0 || row >= n || col < 0 || col >= m) {
                // Adjust exit point to the last valid position.
                exitPoint[0] = row + (row < 0 ? 1 : (row >= n ? -1 : 0));
                exitPoint[1] = col + (col < 0 ? 1 : (col >= m ? -1 : 0));
                break;
            }
        }
        
        return exitPoint;
    }
}
