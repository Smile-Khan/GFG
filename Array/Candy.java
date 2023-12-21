package Array;

public class Candy extends{

    https:import java.io.IOException;

//www.geeksforgeeks.org/problems/candy/1

//{ Driver Code Starts
// Initial Template for Java
import java.util.Arrays;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int N, int ratings[]) {
        // code here
        // if(N == 1)
        // return 1;
        
        // int[] right = new int[N];
        // int[] left  = new int[N];
        
        // // Initially the leftmost child has 1 candy and the rightmost child has 1 candy
        
        // // when we start traversing from those directions
        
        // left[0] = 1;
        // right[N - 1] = 1;
        // int j = N-2;
        
        // for(int i = 1; i<N; i++)
        // {
        //     left[i]  = ratings[i] > ratings[i-1] ? left[i-1]+1 : 1;
            
        //     right[i] = ratings[i] > ratings[j+1] ? right[j+1]+1 : 1;
            
        //     j--;
        // }
        // int result = 0;
        
        // for(int i = 0; i<N; i++)
        // {
        //     result += Math.max(right[i],left[i]);
        // }
        // return result;
         if (N <= 1) {
            return N;
        }

        long[] candies = new long[N];
        Arrays.fill(candies, 1);

        // Left pass: Ensure that a child with a higher rating gets more candies than its left neighbor
        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right pass: Ensure that a child with a higher rating gets more candies than its right neighbor
        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Calculate the total number of candies needed
        long totalCandies = 0;
        for (long candy : candies) {
            totalCandies += candy;
        }

        return (int) totalCandies;
    }
}
