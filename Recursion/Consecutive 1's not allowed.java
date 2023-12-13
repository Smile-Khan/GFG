public class Consecutive 1's not allowed {
    

    https://www.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1


}


SOLUTION :-

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
        
        final int MOD = 1000000007;
        
        long[] endingWithZero = new long[n + 1];
        long[] endingWithOne = new long[n + 1];
        
        endingWithZero[1] = 1;
        endingWithOne[1] = 1;
        
        for(int i = 2; i <= n; i++)
        {
            endingWithZero[i] = (endingWithZero[i - 1] + endingWithOne[i - 1]%MOD);
            endingWithOne[i]  = endingWithZero[i - 1];
        }
        return (endingWithZero[n] + endingWithOne[n])%MOD;
    }
}
