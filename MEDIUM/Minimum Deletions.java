QUESTION :- Minimum Deletions {
    

    https://practice.geeksforgeeks.org/problems/minimum-deletitions1648/1


}



SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
        //your code here
        int n = S.length();
        
        // Create a table to store the longest palindromic subsequence
        
        int[][] dp = new int[n][n];
        
        // Initialize the diagonal elements (single characterss)
        
        for(int i = 0; i<n; i++)
        {
            dp[i][i] = 1;
        }
        
        // Fill the table using dynamic programming
        
         for (int cl = 2; cl <= n; cl++) {
            for (int i = 0; i < n - cl + 1; i++) {
                int j = i + cl - 1;
                if (S.charAt(i) == S.charAt(j) && cl == 2) {
                    dp[i][j] = 2;
                } else if (S.charAt(i) == S.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        
        // The minimum number of deletions is the difference between the string length and
        // the length of the longest palindromic subsequence
        return n - dp[0][n - 1];
    }
}
