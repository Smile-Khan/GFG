package String;

public class Edit Distance {
    

    LINK :- https://www.geeksforgeeks.org/problems/edit-distance3702/1

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while (T-- > 0) {
                String s1 = br.readLine();
                String[] S = s1.split(" ");
                String s = S[0];
                String t = S[1];
                Solution ob = new Solution();
                int ans = ob.editDistance(s, t);
                System.out.println(ans);
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public int editDistance(String str1, String str2) {
            // Code here
            // if(str1 == str2)
            // {
            //     return 0;
            // }
            int m = str1.length();
            int n = str2.length();
            int[][] dp = new int[m + 1][n + 1];
    
            // Initialize base cases
            for (int i = 0; i <= m; i++)
            {
                dp[i][0] = i;
            }
            for (int j = 0; j <= n; j++) 
            {
                dp[0][j] = j;
            }
    
            // Fill the dp array using dynamic programming
            for (int i = 1; i <= m; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) 
                    {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                    }
                }
            }
    
            // Return the edit distance
            return dp[m][n];
            
        }
    }
