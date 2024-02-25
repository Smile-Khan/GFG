package Dynamic Programming;

public class Reach a given score {
    
    https://www.geeksforgeeks.org/problems/reach-a-given-score-1587115621/1

}

SOLUTION :-

//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    public class GFG {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            while(t > 0)
            {
                int n = in.nextInt();
                Geeks obj = new Geeks();
                System.out.println(obj.count(n));
                t--;
            }
        }
    }
    // } Driver Code Ends
    
    
    // Complete this function!
    
    class Geeks {
        public long count(int n) {
            // Add your code here.
            int[] dp = new int[n+1];
            int[] scores = {3,5,10};
            dp[0] = 1;
            
            for(int score : scores)
            {
                for(int i = score; i <= n; i++)
                {
                    dp[i] += dp[i - score];
                }
            }
            return dp[n];
        }
    }
