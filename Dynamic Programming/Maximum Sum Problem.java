package Dynamic Programming;

public class Maximum Sum Problem {
    

    https://www.geeksforgeeks.org/problems/maximum-sum-problem2211/1


}

    SOLUTION :-

    //{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    static int[] dp;
    public int maxSum(int n) 
    { 
        //code here.
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return findMaxSum(n);
    } 
    
    private static int findMaxSum(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        
        if(dp[n] != -1)
        {
            return dp[n];
        }
        
        int sum = findMaxSum(n/2) + findMaxSum(n/3) + findMaxSum(n/4);
        
        dp[n] = Math.max(n, sum);
        
        return dp[n];
    }
}

