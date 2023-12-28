public class WildCard strig matchig {
 https://www.geeksforgeeks.org/problems/wildcard-string-matching1126/1

}

SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean match(String wild, String pattern)
    {
        // code here
         int m = wild.length();
        int n = pattern.length();

        // Create a boolean array to store the results of subproblems
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Empty pattern matches with empty wild
        dp[0][0] = true;

        // Only '*' can match with an empty string
        for (int i = 1; i <= m; i++) {
            if (wild.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }

        // Fill the table in a bottom-up manner
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match or wild has '?', move diagonally
                if (wild.charAt(i - 1) == pattern.charAt(j - 1) || wild.charAt(i - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If wild has '*', consider it as an empty string or match with the current character
                else if (wild.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }

        return dp[m][n];
    }
}
