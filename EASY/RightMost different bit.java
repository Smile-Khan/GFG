public class RightMost different bit {
    

    https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1

}

SOLUTION :-

//{ Driver Code Starts
//Initial Template for Java

import java.io.IOException;
import java.util.Scanner;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here   
        int xor = m^n;
        
        if(xor == 0)
        return -1;
        
        int count = 1;
        while(xor > 0)
        {
            if((xor&1)!=0)
            return count;
            xor >>= 1;
            count++;
        }
        return -1;
            
    }
}



