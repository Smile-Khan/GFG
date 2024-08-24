package Dynamic Programming;

public class 0 - 1 Knapsack Problem {
    
    QUESTION LINK:

    https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

}

--------------------------JAVA----------------------------

class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int N = val.length;
        
        // DP array to store the maximum value for each weight capacity
        int dp[][] = new int[N + 1][W + 1];
        
        // Build the DP Table in a bottom-up manner
        for(int i = 1; i <= N; i++)
        {
            for(int j = 1; j <= W; j++)
            {
                if(wt[i-1] <= j)
                {
                    // Include the current item and exclude the current item
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                }
                else
                {
                    // Exclude the current item
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }
}


----------------------------------PYTHON----------------------------
def knapSack(W, wt, val):
    N = len(val)
    dp = [[0 for _ in range(W + 1)] for _ in range(N + 1)]

    for i in range(1, N + 1):
        for j in range(1, W + 1):
            if wt[i-1] <= j:
                dp[i][j] = max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j])
            else:
                dp[i][j] = dp[i-1][j]

    return dp[N][W]
