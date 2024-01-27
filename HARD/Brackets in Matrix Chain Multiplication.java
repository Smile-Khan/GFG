package HARD;

public class Brackets in Matrix Chain Multiplication {
 
    
    https://www.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1

//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GFG
{
    private static int get(int[] p, int n) {
        int[][] m = new int[n][n];
        int ans = 1000000000;

        for (int i = 1; i < n; i++)
            m[i][i] = 0;

        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                m[i][i + L - 1] = Integer.MAX_VALUE;

                for (int k = i; k <= i + L - 2; k++) {
                    int q = m[i][k] + m[k + 1][i + L - 1] + p[i - 1] * p[k] * p[i + L - 1];

                    if (q < m[i][i + L - 1]) {
                        m[i][i + L - 1] = q;
                    }
                }
            }
        }

        return m[1][n - 1];
    }

    private static int find(String s, int[] p) {
        List<int[]> arr = new ArrayList<>();
        int ans = 0;

        for (char t : s.toCharArray()) {
            if (t == '(') {
                arr.add(new int[]{-1, -1});
            } else if (t == ')') {
                int[] b = arr.remove(arr.size() - 1);
                int[] a = arr.remove(arr.size() - 1);
                arr.remove(arr.size() - 1);
                arr.add(new int[]{a[0], b[1]});
                ans += a[0] * a[1] * b[1];
            } else {
                arr.add(new int[]{p[t - 'A'], p[t - 'A' + 1]});
            }
        }

        return ans;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int p[] = new int[n];
            for(int i = 0;i < n;i++)
                p[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            String result=ob.matrixChainOrder(p, n);
            if(get(p,n)==find(result,p))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String matrixChainOrder(int p[], int n){
        // code here
         int[][] dp = new int[n - 1][n - 1];
        int[][] bracket = new int[n - 1][n - 1];

        for (int length = 2; length <= n - 1; length++) {
            for (int i = 0; i < n - length; i++) {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + p[i] * p[k + 1] * p[j + 1];

                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        bracket[i][j] = k;
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        constructResult(result, 'A', bracket, 0, n - 2);

        return result.toString();
    }

    private static void constructResult(StringBuilder result, char matrix, int[][] bracket, int i, int j) {
        if (i == j) {
            result.append(matrix);
            return;
        }

        result.append('(');
        constructResult(result, matrix, bracket, i, bracket[i][j]);
        constructResult(result, (char) (matrix + bracket[i][j] - i + 1), bracket, bracket[i][j] + 1, j);
        result.append(')');
    }
}
