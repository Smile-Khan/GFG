QUESTION :- Number Of Enclaves MediumAccuracy 

https://practice.geeksforgeeks.org/problems/number-of-enclaves/1

ANSWER :-

//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
     void dfs(int i, int j, int[][] grid)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return;
        
        grid[i][j] = 0;
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i+1, j, grid);
        dfs(i, j-1, grid);
    }

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int n = grid.length;
        int m = grid[0].length;
        
        if(n == 1 || m == 1 || n == 2 || m == 2)
            return 0;
        
        for(int row = 0; row < m; row++)
        {
            if(grid[0][row] == 1)
            {
                dfs(0, row, grid);
            }
        }
        
        for(int col = 1; col < n; col++)
        {
            if(grid[col][0] == 1)
            {
                dfs(col, 0, grid);
            }
        }
        
        for(int j = 1; j < m; j++)
        {
            if(grid[n-1][j] == 1)
                dfs(n-1, j, grid);
        }
        
        for(int i = n-1; i >= 1; i--)
        {
            if(grid[i][m-1] == 1)
                dfs(i, m-1, grid);
        }
        
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
