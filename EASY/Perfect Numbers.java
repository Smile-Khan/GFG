// Here is a Question Link :-  https://practice.geeksforgeeks.org/problems/perfect-numbers3207/1


// Here is the solution 

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        // code here
        if(N < 2)
        {
            return 0; // Number less than 2 are not perfect
        }
        
        long sum = 1; // Initialize the sum with 1 (since 1 is always a factor)
        
        // Loop to find factors and calculate their sum
        
        for(long i=2; i * i <= N; i++)
        {
            if(N % i == 0)
            {
                // If i is a factor, add it to the sum
                
                sum += i;
                
                // If i is not equal to the square root of N, add the corresponding factor to the sum
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }
        
        // Check if the sum of factors equals the number itself
        if (sum == N) {
            return 1; // The number is perfect
        } else {
            return 0; // The number is not perfect
    }
    }
};