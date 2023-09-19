QUESTION :-

https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&category[]=Recursion&sortBy=submissions


SOLUTION :- 

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    //creating an object of class Print
		    Solution obj=new Solution();
		    int N;
		    
		    //input N
		    N=sc.nextInt();
		    
		    //calling printNos() methdo
		    //of class Print
		    obj.printNos(N);
		    System.out.println();
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java



class Solution
{
    
  public void printNos(int N)
    {
        //Your code here
        if(N > 0)
        {
            printNos(N - 1); // Recursively print numbers from 1
            
            System.out.print(N + " "); // Print the current number.
        }
    }
}

