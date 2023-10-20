QUESTION :- Form a number divisible by 3 using array digits {
    https://practice.geeksforgeeks.org/problems/form-a-number-divisible-by-3-using-array-digits0717/1
}



SOLUTION :-

//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(a[i]);

            Solution ob = new Solution();
            System.out.println(ob.isPossible(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int isPossible(int N, int arr[]) {
        // code here
        int sum = 0;
        for(int i : arr)
        {
            sum += i%3;
        }
        return sum%3==0 ? 1:0;
    }
}
