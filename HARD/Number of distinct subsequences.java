package HARD;
QUESTION:-  Number of distinct subsequences 

https://practice.geeksforgeeks.org/problems/number-of-distinct-subsequences0909/1

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String S) {
        // code here
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        long dp[]=new long[S.length()+1];
        
        int mod=1000000007;
        
        dp[0]=1;
        
        for(int i=1;i<dp.length;i++){
            
            dp[i]=(2*dp[i-1]%mod)%mod;
            
            char ch=S.charAt(i-1);
            
            if(map.containsKey(ch)){
                
                int j=map.get(ch);
                
                dp[i]=(dp[i]%mod-dp[j-1]+mod)%mod;
            }
            
            map.put(ch,i);
        }
        
        return (int) dp[S.length()]%mod;
    }
}