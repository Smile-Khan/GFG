// package EASY;

// public class Print first n Fibonacci Numbers {
    
// }

// Question :- Print first n Fibonacci Numbers (https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1)


// Here is the Solution :-



//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.util.Scanner;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        
        // Initialize an Array to store the Fibonacci numbers.
        long[] fibonacci = new long[n];
        
        // First two numbers of the  Fibonacci series are 1 and 1.
        
        fibonacci[0] = 1;
        
        if(n > 1)
        {
            fibonacci[1] = 1;
        }
        
        // Calculate the remaining Fibonacci numbers.
        for(int i=2; i<n; i++)
        {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}