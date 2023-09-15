// package MEDIUM;

// public class Partition Equal Subset Sum {
    
// }

// Question Link :-  https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1



// here is the Solution


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int s=0;
        for(int i:arr)
            s+=i;
        if(s%2!=0)
            return 0;
            
        int sum=s/2;
        
        boolean [][]dp=new boolean[N+1][sum+1];
        dp[0][0]=true;
        
        for(int i=1;i<=N;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j<arr[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
            }
        }
        
        if(dp[N][sum]==true)
            return 1;
        return 0;
    }
}