QEUSTION :- Sum of All Divisisors form 1 to n {
    
    https://practice.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1


}


Solution :-


//{ Driver Code Starts
//Initial Template for Java
import java.io.IOException;
import java.util.Scanner;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int N){
        // code here
        long ans = 0;
        
        for(int i = 1; i <= N; i++)
        {
            ans += i * (N/i);
        }
        return ans;
    }
}
