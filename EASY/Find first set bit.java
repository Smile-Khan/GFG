QUESTION :-

https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1


SOLUTION :- 



//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        
        if(n == 0)
        {
            return 0; // If n is 0, there are no set bits.
        }
        
        // Calculate the position of the rightmost set bit.
        
        int position = (int)(Math.log(n & -n)/Math.log(2))+1;
        
        return position;
            
    }
}