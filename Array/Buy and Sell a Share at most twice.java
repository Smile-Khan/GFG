package Array;

public class Buy and Sell a Share at most twice {
    

    https://www.geeksforgeeks.org/problems/buy-and-sell-a-share-at-most-twice/1

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxProfit(int n, int[] price) {
        // code here
         if (n <= 1) {
            return 0;
        }

        int[] profit = new int[n];

        // Initialize the profit array
        for (int i = 0; i < n; i++) {
            profit[i] = 0;
        }

        int maxPrice = price[n - 1];

        // Traverse the array from right to left and calculate the maximum profit for each day
        for (int i = n - 2; i >= 0; i--) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
            }

            // Calculate the maximum profit for the current day
            profit[i] = Math.max(profit[i + 1], maxPrice - price[i]);
        }

        int minPrice = price[0];

        // Traverse the array from left to right and calculate the maximum profit for each day
        for (int i = 1; i < n; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }

            // Calculate the maximum profit for the current day
            profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - minPrice));
        }

        // The last element of the profit array contains the maximum profit for two transactions
        return profit[n - 1];
    }
}
        

