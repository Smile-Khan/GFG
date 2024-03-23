public class Fibonacci series up to Nth term {
    
    https://www.geeksforgeeks.org/problems/fibonacci-series-up-to-nth-term/1

}

SOLUTION :-

//{ Driver Code Starts
    import java.io.BufferedReader;
import java.io.InputStreamReader;
    
    class Main {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                Solution obj = new Solution();
                int ans[] = obj.Series(n);
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
    
        int[] Series(int n) {
            // code here
            int MOD = 1000000007;
            
            int[] fib = new int[n + 1];
            
            // Base
            fib[0] = 0;
            if(n > 0)
            {
                fib[1] = 1;
            }
            
            for(int i = 2; i<=n; i++)
            {
                fib[i] = (fib[i-1] + fib[i - 2])%MOD;
            }
            return fib;
        }
    }
