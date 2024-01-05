public class Count possible ways to construct buildings {
    

    https://www.geeksforgeeks.org/problems/count-possible-ways-to-construct-buildings5007/1



}


SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        // Code here
         if(N == 1) return 4;
        if(N == 2) return 9;
        long a = 2 ;
        long b = 3;
        long m = 1000000007;
    long s = 0;
    for(int i = 3 ; i<=N;i++)
{
    s = (a + b) % m;
    a =b;
    b = s;
} 

        return (int)( (s * s)%m);
    }
}
