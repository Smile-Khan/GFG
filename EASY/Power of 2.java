package EASY;

public class Power of 2 {
    
}


Question :- Power of 2 (https:import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());//testcases
        
        while(t-- > 0)
        {
            //input a number n
            long n = Long.parseLong(read.readLine());
            
            
            // if n is less than equal to zero then 
            //it can't be a power of 2 so we print No
            if(new Solution().isPowerofTwo(n) == true)
              System.out.println("YES");
            else System.out.println("NO");
        }
    }
} 

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n <= 0)
        {
            return false;   // Negative numbers and zero cannot be a power of two.
            
        }
        return (n & (n - 1)) == 0;
    }
    
}