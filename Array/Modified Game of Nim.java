package Array;

public class Modified Game of Nim {
 
    
    https://www.geeksforgeeks.org/problems/variation-in-nim-game4317/1

//{ Driver Code Starts
//Initial Template for Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[n];
            for(int i = 0; i < n; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findWinner(n, A));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findWinner(int n, int A[]){
        // code here
        
        int check = 0;
        
        for(int i = 0; i<n; i++)
        
            check ^= A[i];
            
            if(check == 0)
            {
                return 1;
            } else 
            {
                return (n%2)+1;
            }
        
    }
}
